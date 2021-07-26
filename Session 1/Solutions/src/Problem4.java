public class Problem4 {
    public static void main(String [] args){
        // Write your code herepackage bouns_problem;
import java.util.*;
public class Bouns_Problem 
{
	public static void main(String args[]) 
	{Scanner cin = new Scanner (System.in) ;
		String originalWord;
		System.out.println(" inter the length of the word and the word you want to encode");
		int wordLength = cin.nextInt();
		originalWord = cin.next();
		String newWord = "" ;
  for (int i = 0; i<wordLength-1; i++)
  {     while(wordLength!=2)
		{int middle;
		if (wordLength%2==0)  {middle = wordLength/2-1;}
		else  {middle = wordLength/2;}
		newWord = newWord + originalWord.charAt(middle);
		StringBuilder ow = new StringBuilder (originalWord);
		ow = ow.deleteCharAt(middle);
		originalWord = ow.toString();
		--wordLength;}
  newWord = newWord + originalWord;
  }
    System.out.println(newWord);
	}

}
    }
}
