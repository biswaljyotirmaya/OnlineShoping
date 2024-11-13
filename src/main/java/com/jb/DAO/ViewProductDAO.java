package com.jb.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jb.db.DBConnect;
import com.jb.model.ProductBean;

public class ViewProductDAO {
	ArrayList<ProductBean> products = new ArrayList<ProductBean>();
	private final static String GET_PRODUCTS = "Select * from productdetails";

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String username = "system";
	String password = "jyoti";

	public ArrayList<ProductBean> retrieveProduct() {
		try {
			try {
				Class.forName("oracle.jdbc.OracleDriver"); 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(GET_PRODUCTS);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ProductBean product = new ProductBean();

				product.setPcode(rs.getString(1));
				product.setPname(rs.getString(2));
				product.setPcomp(rs.getString(3));
				product.setPrice(rs.getDouble(4));
				product.setPqnt(rs.getInt(5));

				byte[] imageBytes = rs.getBytes("productImage");
				product.setImage(imageBytes);

				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
}
