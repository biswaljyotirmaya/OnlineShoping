package com.jb.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.jb.DAO.UpdateproductDAO;
import com.jb.model.ProductBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/upd")
public class UpdateProductServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			req.setAttribute("msg", "Session expired!");
			resp.sendRedirect("adminLogin.html");
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
			product.setPrice(Double.parseDouble(req.getParameter("price")));
			product.setPqnt(Integer.parseInt(req.getParameter("pqnt")));

			int rowCount = new UpdateproductDAO().UpdateProductDetails(product);

			if (rowCount > 0) {
				req.setAttribute("msg", "Product details updated!");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, resp);
			}
		}
	}
}
