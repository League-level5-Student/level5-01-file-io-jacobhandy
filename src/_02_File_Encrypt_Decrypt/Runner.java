package _02_File_Encrypt_Decrypt;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileEncryptor fe = new FileEncryptor();
		String file = "src/_02_File_Encrypt_Decrypt/output.txt";
		fe.encryptFile("HELLOa", file, 3);
		
		FileDecryptor fd = new FileDecryptor();
		fd.decryptFile(file, 3);
	}

}
