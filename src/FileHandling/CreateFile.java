package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			File myObj = new File("D:\\FileHandling\\Filef1.txt");
			if(myObj.createNewFile())
			{
				System.out.println("File is created " +myObj.getName());
			} else{
				System.out.println("File is already exists");
			}
		}catch(IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
