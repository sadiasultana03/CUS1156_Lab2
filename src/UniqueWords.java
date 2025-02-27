import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	   
	   int count = 0;
	      
	      // Here I Loop through the list
	      for (int i = 0; i < list.size(); i++)
	      {
	         boolean isUnique = true; // Assuming the element is unique
	         
	         // Checking the current element against all previous elements
	         for (int j = 0; j < i; j++)
	         {
	            if (list.get(i).equals(list.get(j))) // If it's a duplicate, break
	            {
	               isUnique = false;
	               break;
	            }
	         }
	         
	         // If the element is unique, increment the count
	         if (isUnique)
	         {
	            count++;
	         }
	      }
	      
	      return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
