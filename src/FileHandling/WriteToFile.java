package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try{
		FileWriter mywriter = new FileWriter("D:\\FileHandling\\Filef1.txt");
		mywriter.write("Java is promient programming language of milenium");
		mywriter.close();
		System.out.println("successfully wrote to the file");
	} catch(IOException e)
	{
		System.out.println("error occured");
		e.printStackTrace();
	}
	
	}

}
