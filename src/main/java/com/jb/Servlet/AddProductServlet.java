package com.jb.Servlet;

import java.io.IOException;

import com.jb.DAO.AddProductDAO;
import com.jb.model.ProductBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@WebServlet("/aps")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			req.setAttribute("msg", "Session expired!!");
			RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
			rd.forward(req, resp);
		} else {
			ProductBean pb = new ProductBean();

			pb.setPcode(req.getParameter("pcode"));
			pb.setPname(req.getParameter("pname"));
			pb.setPcomp(req.getParameter("pcomp"));
			pb.setPrice(Double.parseDouble(req.getParameter("price")));
			pb.setPqnt(Integer.parseInt(req.getParameter("pqnt")));

			Part filePart = req.getPart("productImage");
			if (filePart != null) {
				byte[] imageBytes = filePart.getInputStream().readAllBytes();
				pb.setImage(imageBytes);
			}

			int rowCount = new AddProductDAO().insertProduct(pb);
			if (rowCount > 0) {
				System.out.println("Product Added successfully!");
				req.setAttribute("productAdded", true);
				req.setAttribute("msg", "Product added successfully!!");
			} else {
				System.out.println("Failed to insert data!");
				req.setAttribute("productAdded", false);
			}
			resp.sendRedirect("index.jsp");
		}
	}
}
