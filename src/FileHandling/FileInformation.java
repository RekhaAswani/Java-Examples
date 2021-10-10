package FileHandling;
import java.io.File;
public class FileInformation {
	/**
	 * @param args
	 */
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File myObj = new File("D:\\FileHandling\\NewFile1.txt");
		if(myObj.exists())
		{
			System.out.println("File Name " +myObj.getName() );
			System.out.println("File path " +myObj.getAbsolutePath() );
			System.out.println("File Can write " +myObj.canWrite() );
			System.out.println("File  can read " +myObj.canRead() );
			System.out.println("File Name " +myObj.length() );	
		}
		else
		{
			System.out.println("File does not exist" );
		}
		
	}

}
