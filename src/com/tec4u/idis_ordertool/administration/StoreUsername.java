/**
 * 
 */
package com.tec4u.idis_ordertool.administration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author d.reinerts
 *
 */
public class StoreUsername {
	
	public static void storeUsernameInFile(String strUsername, String strPassword) {
		File f = new File("/docs/generated_pwd.txt");
		try {
			FileWriter fw = new FileWriter(f.getName());
			if(f.createNewFile()) {
				System.out.println(f.getName() + " created");
				fw.write(strUsername + "," + strPassword + "\n");
				fw.close();
			} else {
				System.out.println(f.getName() + " already exist");
				System.out.println(f.getAbsolutePath());
				fw.write(strUsername + "," + strPassword + "\n");
				fw.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
