import java.util.*;

public class ArrayListBasicOperations
{
	   public static void main(String args[]) 
	   {
			ArrayList<String> obj = new ArrayList<String>();

      //add elements to an ArrayList
      obj.add("A");
      obj.add("S");
      obj.add("A");
      obj.add("N");
      obj.add("J");

      // Displaying elements
      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);

      /* Add element at the given index
       * obj.add(0, "R") - Adding element "R" at first position
       * obj.add(1, "J") - Adding element "J" at second position
       */
      obj.add(0, "R");
      obj.add(1, "J");

      // Displaying elements
      System.out.println("ArrayList after add operation:");
      for(String str:obj)
         System.out.println(str);

      //Remove elements from ArrayList like this
      obj.remove("S"); 
      obj.remove("A"); 

      // Displaying elements
      System.out.println("ArrayList after remove operation:");
      for(String str:obj)
         System.out.println(str);

      //Remove element from the specified index
      obj.remove(1);
	  //Removes Second element from the List

      // Displaying elements
      System.out.println("Final ArrayList:");
      for(String str:obj)
         System.out.println(str);
   }
}