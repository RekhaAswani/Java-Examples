//Inheritance 

class A
{
	A()
	{
		System.out.println("in constructor of A");
	}
	{
		System.out.println("in instance of  A");
	}
 
	static{
		System.out.println("in static of  A");
	}
}
 class B extends A{
	 B()
	 {
		 System.out.println("in constructor of B"); 
	 }
	 
	 {
		 System.out.println("in instance of B"); 
	 }
	 static{
			System.out.println("in static of  B");
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A a= new B();
	}

}
