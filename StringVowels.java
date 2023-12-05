package ripplesolutionprograms;
import java.util.*;

public class StringVowels {
	public static void main(String args[]) {
		
		        Scanner sc= new Scanner(System.in);

		        System.out.print("Enter a sentence: ");
		        String inputSentence = sc.nextLine();
		        String[] words = inputSentence.split(" ");
		        System.out.print("Output: ");
		        for (String word : words) {
		            if (isVowel(word.charAt(0))) {
		                System.out.print(word + " ");
		            }
		        }
		    }

		     static boolean isVowel(char ch) {
		        ch = Character.toLowerCase(ch);
		        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
		    }
		}
