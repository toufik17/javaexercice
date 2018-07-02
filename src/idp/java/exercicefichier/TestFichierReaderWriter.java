package idp.java.exercicefichier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.CharBuffer;

public class TestFichierReaderWriter {

	static Writer writer =null;
	private static InputStreamReader reader;
	public static void main(String[] args) throws IOException {
		try {
			
			// ============================= Ecrire ==========================
			// creation de fichier
			File fichier = new File("TestWriterReader.txt");

			if (!fichier.exists()) {

				fichier.createNewFile();
			}
			writer = new OutputStreamWriter(new FileOutputStream(fichier, true));

			writer.write("bonjour\nje suis une ligne\n");
			
			
			// ============================= Lire ===========================
			
			reader = new InputStreamReader(new FileInputStream(fichier));
			//char[] chars = new char[1000];
			//while(reader.read(chars) != -1);

			int r;
			while((r = reader.read())!= -1){
				System.out.print((char)r);
			}

			//System.out.println(chars);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			writer.close();
		}

	}
}
