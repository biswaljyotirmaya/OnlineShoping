package com.jb.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.jb.DAO.DeleteProductDAO;
import com.jb.model.ProductBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			req.setAttribute("msg", "Session expired!!");
			RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
			rd.forward(req, resp);
		} else {
			String pcode = req.getParameter("pcode");
			ArrayList<ProductBean> products = (ArrayList<ProductBean>) session.getAttribute("ProductList");
			ProductBean product = null;
			Iterator<ProductBean> i = products.iterator();
			while (i.hasNext()) {
				product = i.next();
				if (pcode.equals(product.getPcode())) {
					break;
				}
			}
			int rowCount = new DeleteProductDAO().DeleteProductDetails(product);

			if (rowCount > 0) {
				System.out.println("record deleted");
				req.setAttribute("msg", "Product deleted!");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		}
	}
}
