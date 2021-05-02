/**
 * 
 */
package com.tec4u.idis_ordertool.core.language_tool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tec4u.idis_ordertool.login.util.DatabaseConnect;

/**
 * @author d.reinerts
 *
 */
public class LanguageToolDAO {
	
	public static void addTranslation(String strIdentifier, String strEnglish, String strGerman) {
		String sql = "INSERT INTO idis_ordertool.translation (translation.identifier, translation.english, translation.german) "
				+ "VALUES (?, ?, ?);";
		
		Connection conn = DatabaseConnect.getConnection();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, strIdentifier);
			ps.setString(2, strEnglish);
			ps.setString(3, strGerman);
			ps.execute();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
