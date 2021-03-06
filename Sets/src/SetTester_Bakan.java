/**
 * Eric Bakan
 * 
 * 
 * 7.1.1
 * Set<String> s = new HashSet<String>(); //creates a new hash set
 * s.add("hello"); //adds "hello" to s
 * s.add("bye"); //adds "bye" to s
 * s.addAll(s); //does nothing because all the elements of s are already in s
 * Set<String> t = new TreeSet<String>(); //creates a new tree set
 * t.add("123"); //adds "123" to t
 * s.addAll(t); //adds all the elements of t to s
 * System.out.printf(s.containsAll(t)); //returns true because s contains all the elements of t
 * System.out.printf(t.containsAll(s)); //returns false because t does not contain all the elements of t
 *
 *7.1.4
 *A copy is needed because the assignment operator
 *would have made setAcopy reference the same object
 *as setA. This would have made the two print statements
 *print the same thing, the intersection of setA and setB.
 */

import java.util.Set;
import java.util.HashSet;

public class SetTester_Bakan {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		for(int i=0;i<10;i++)
			a.add(i);
		System.out.printf("a: %s\n",a);
		
		Set<Integer> b = new HashSet<Integer>();
		for(int i=0;i<10;i+=2)
			b.add(i);
		System.out.printf("b: %s\n\n",b);
		
		Set<Integer> c = new HashSet<Integer>();
		c.addAll(a);
		c.addAll(b);
		System.out.printf("c = (a ∪ b)\nc: %s\n\n",c);
		
		c.removeAll(c);
		c.addAll(a);
		c.retainAll(b);
		System.out.printf("c = (a ∩ b)\nc: %s\n\n",c);
		
		c.removeAll(c);
		c.addAll(a);
		c.removeAll(b);
		System.out.printf("c = (a − b)\nc: %s\n\n",c);
		
		c.removeAll(c);
		if(a.containsAll(b))
			c.addAll(a);
		else
			c.addAll(b);
		System.out.printf("if(a ⊂ b)\n\tc = a;\nelse\n\tc = b;\nc: %s\n",c);
	}

}
