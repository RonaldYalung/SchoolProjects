import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
	//Serialization - the process of converting an object into a byte stream.
	//				  Byte stream can be saved as a file (.ser) which is platform independent
	// 				  (think of this as if you're saving a file with the objects information)
	/*
	 				Steps to Serialize
	  				---------------------------------------------------------------
	   					1. Your class should implement Serializable interface
	   					2. add import java.io.Serializable;
	   					3. FileOutputStream fileOut = new FileOutputStream(file path)
	   					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
	   					5. out.writeObject(objectName)
	   					6. out.close(); fileOut.close();
	   				---------------------------------------------------------------
		
	*/	
	//Deserialization - the reverse process of converting a byte stream into an object.
	// 					(think of this as if you're loading a saved file)
	
	
	public static void main(String[] args) throws IOException {
		
		User user = new User();
		user.name = "bro";
		user.password = "I<3pizza";
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		
		out.close();
		fileOut.close();
		
		System.out.println("object info saved!");

	}

}
