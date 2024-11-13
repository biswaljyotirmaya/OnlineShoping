package com.jb.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jb.model.AdminBean;

public class AdminLoginDAO {
	public AdminBean CheckAdminLogin(String username, String pass) {
		AdminBean abean = null;

		String GET_ADMIN = "SELECT * FROM admindetails WHERE AUNAME = ? AND APASS = ?";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "jyoti";
		
		try {
            Class.forName("oracle.jdbc.OracleDriver"); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement ps = con.prepareStatement(GET_ADMIN)) {
			ps.setString(1, username);
			ps.setString(2, pass);

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					abean = new AdminBean();
					abean.setAname(rs.getString(1));
					abean.setApass(rs.getString(2));
					abean.setAfname(rs.getString(3));
					abean.setAlname(rs.getString(4));
					abean.setAmail(rs.getString(5));
					abean.setAdddress(rs.getString(6));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return abean;
	}
}
