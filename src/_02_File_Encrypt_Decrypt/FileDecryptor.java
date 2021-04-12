package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	public String decryptFile(String filePath, int key) {
		char[] inputChars;
		String output = "";
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedReader fr = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/output.txt"));
			String s = fr.readLine();
			while(s != null) {
			s = fr.readLine();
			inputChars = s.toCharArray();
			for(int i = 0; i < inputChars.length; i++) {
				inputChars[i] += key;
				output += inputChars[i];
			}
			}
			
			fw.write(output);
			fw.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println("File not found \n:(");
			e.printStackTrace();
		}
		return output;
	}
}
