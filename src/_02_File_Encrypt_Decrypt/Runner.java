package _02_File_Encrypt_Decrypt;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileEncryptor fe = new FileEncryptor();
		fe.encryptFile("HELLOa", 3);
		
		FileDecryptor fd = new FileDecryptor();
		fd.decryptFile("src/_02_File_Encrypt_Decrypt/output.txt", 3);
	}

}
