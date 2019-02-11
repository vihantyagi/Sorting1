import java.util.*;

public class NewSort {

	public static void main(String[] args) {
		 // Create a list of strings 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("hello"); 
        al.add("hey"); 
        al.add("what's up?"); 
        al.add("yo"); 
        al.add("hi"); 
  
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al, Collections.reverseOrder()); 
  
        // Let us print the sorted list 
        System.out.println("List after the use of"
                           + " Collection.sort() :\n" + al); 

	}

}

