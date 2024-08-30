import java.io.*;

public class Main {

//	Steps to Deserialize
//---------------------------------------------------------------
//1. Your class should implement Serializable interface
//2. add import java.io.Serializable;
//3. FileInputStream fileIn = new FileInputStream(file path);
//4. ObjectInputStream in = new ObjectInputStream(fileIn);
//5. objectNam = (Class) in.readObject();
//6. in.close(); fileIn.close();
//---------------------------------------------------------------
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		User user = null;
		
	FileInputStream fileIn = new FileInputStream("C:\\Users\\ronal\\OneDrive\\Desktop\\CSC110AB-fall2023\\Serializable\\UserInfo.ser");
	ObjectInputStream in = new ObjectInputStream(fileIn);
	user = (User) in.readObject();
	in.close();
	fileIn.close();
	
	System.out.println(user.name);
	System.out.println(user.password);
	user.sayHello();
	
	}

}
