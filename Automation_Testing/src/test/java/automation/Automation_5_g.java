//5. Object Oriented Programming: Collections


package automation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
public class Automation_5_g {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		Collection values=new ArrayList();
		values.add("Nidhish");
		values.add(1);
		values.add(33.22);
		Iterator i= values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
		System.out.println("-----");

		values.remove(33.22);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		System.out.println("-----");

		values.add(2);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		
		//LinkedList
		LinkedList<String> ll = new LinkedList<String>();
		 
        // Adding elements to the linked list
        ll.add("john");
        ll.add("nidhish");
        ll.addLast("thor");
        ll.addFirst("bangalore");
        ll.add(2, "hello");
         
        System.out.println(ll);
 
        ll.remove("john");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
        //vector
        Vector<Integer> v = new Vector<Integer>();
  	
        for (int j = 1; j <= 5; j++)
            v.add(j);
  
        System.out.println(v);
        v.remove(3);
        
  
        System.out.println(v);

        for (int k = 0; k < v.size(); k++)
            System.out.print(v.get(k) + " ");



	}
}
