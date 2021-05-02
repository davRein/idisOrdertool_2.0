package com.tec4u.idis_ordertool.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tec4u.idis_ordertool.login.util.DatabaseConnect;

public class RegisterDAO {
	public static void insertRegistration(String[] regARR) {
		String sql = "INSERT INTO idis_ordertool.registrations (firstname, lastname, mailaddress, language, company, phone, address, zip, city, country, order_as, activity, date, status)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

		Connection conn = DatabaseConnect.getConnection();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			for (int i = 0; i < 14; i++) {
				if (i == 13) {
					ps.setInt(i + 1, Integer.parseInt(regARR[i]));
				} else {
					ps.setString(i + 1, regARR[i]);
				}
			}
			ps.execute();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
