package com.jb.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import com.jb.DAO.AdminLoginDAO;
import com.jb.DAO.ViewProductDAO;
import com.jb.model.AdminBean;
import com.jb.model.ProductBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/alog")
public class AdminLoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminBean abean = new AdminLoginDAO().CheckAdminLogin(req.getParameter("aname"), req.getParameter("apass"));

		if (abean == null) {
			req.setAttribute("msg", "Invalid admin credential!");
			req.getRequestDispatcher("adminLogin.jsp").forward(req, resp);
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("abean", abean);

			ArrayList<ProductBean> products = new ViewProductDAO().retrieveProduct();
			if (products != null && !products.isEmpty()) {
				session.setAttribute("ProductList", products);
			} else {
				req.setAttribute("msg", "No products found.");
			}

			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
