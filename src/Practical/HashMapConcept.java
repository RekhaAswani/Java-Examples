package Practical;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapConcept {

	/**
	 * @param args
	 */
	//hashmap class implement Map interface
	//Extends Abstract Map
	//it contains only unique elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Employee>emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Tom",25,"admin");
		Employee e2 = new Employee("Peter",35,"QA");
		Employee e3 = new Employee("steve",30,"Dev");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		//traverse the hash map
		
		for(Entry<Integer,Employee> m:emp.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee " + key + " Info: ");
			System.out.println(e.name +" " +e.age+ " "+e.dept);
			
		}
		
	}

}
