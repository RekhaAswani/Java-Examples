
public class TestStringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer a= new StringBuffer("poets");
		StringBuffer b= new StringBuffer("andhackers");
		a.delete(1, 4);
		a.delete(1, 3);
		a.append(b);
		System.out.println(a);

	}

}
