package com.tec4u.idis_ordertool.login.bcrypt;

public class HashCreator 
{
	public static String getHash(String strPassword, String strSalt) {
		String strHash = BCrypt.hashpw(strPassword, strSalt);
		return strHash;
	}
}
