package idp.java.exercicefichier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestFichier {
	
	static OutputStream out = null;
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			// creation de fichier
			File file = new File("Test.txt");
			
			// ===================================== Ecrire ===============================
			// erifier existance fichier
			if(!file.exists()){
				file.createNewFile();
			}
			
			//ecrier dans le fichier
			out = new FileOutputStream(file, true);
	
			byte[] bIn = "\nbonjour\n".getBytes();
			out.write(bIn);
			
			//out.flush();
			
			// ===================================== Lire ===============================

			InputStream input = new FileInputStream(file);
			byte[] bOut = new byte[1000];
			int bytes;
			while((bytes = input.read(bOut)) !=-1 );
			System.out.println(new String(bOut, "UTF-8"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			out.close();
		}
	}
}
