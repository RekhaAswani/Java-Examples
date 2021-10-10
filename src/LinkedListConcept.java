import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListConcept {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RFT");
		ll.add("RPA");
		System.out.println("Content of linked list" +ll);
		ll.addFirst("REkha");
		ll.addLast("Automation");
		System.out.println("Content of linked list" +ll);
		
		System.out.println("Content of linked list" +ll.get(0));
		ll.set(0, "TOM");
		
		System.out.println("Content of linked list" +ll);
		
		
		System.out.println("Content of linked list" +ll.get(0));
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of linked list" +ll);
		ll.remove(1);
		
		System.out.println("Content of linked list" +ll);
		//using for loop
		System.out.println("Using for loop");
      for(int i=0;i<ll.size();i++){
    	  
    	  System.out.println("Elements are " +ll.get(i));
      }  
      //using enhanced for loop
      System.out.println("Using for enhanced loop");
      for(String ele:ll)
      {
    	  System.out.println(ele);
      }
      System.out.println("Using iterator");
      
      Iterator<String> it =ll.iterator();
      
      while(it.hasNext())
      {
    	  it.next();
      }
      int num= 0;
  	//using while loop
      System.out.println("Using iterator");
  	while(ll.size()>num)
  	{
  		System.out.println(ll.get(num));
  		num++;
  	}
	}
	
	//using while loop
	
	
		
	
}
