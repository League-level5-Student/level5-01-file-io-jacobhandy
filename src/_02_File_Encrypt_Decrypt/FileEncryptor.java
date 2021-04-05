package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Messager;

//import javax.annotation.processing.Messager;


public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and shift value.
	 * Use any key you want (1 - 25) to shift each letter in the users input and save the final result to a file.
	 */
	public String encryptFile(String input, int key) {
		char[] inputChars = input.toCharArray();
		char[] alphabet = {
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};
		String output = "";
		for(int i = 0; i < inputChars.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(inputChars[i] == alphabet[j]) {
					inputChars[i] = alphabet[j + key];
					output += inputChars[i];
				}
			}
		}
		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/output.txt");
			fw.write(output);
			fw.close();
		}
		catch(Exception e) {
			System.out.println("File not found :(");
			e.printStackTrace();
		}
		return output;
	}
}
