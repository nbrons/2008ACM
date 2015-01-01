/*Question: http://www.acmgnyr.org/year2008/b.pdf */
package ACM2008;

import java.util.Scanner;

public class B {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner (System.in);
		
		int T = in.nextInt();
		
		for(int t=0; t<T; t++){
			in.nextLine();
			char[] word = in.nextLine().toCharArray();				//sends the phrase to a character array
			char[] kalpha = in.next().toCharArray();				//sends scrambled alphabet to character array
			char[] alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();	//creates a character array of the alphabet
			char[] finished = new char[word.length];				//empty character array for the unscrambled word
			  
			
			  for(int i =0; i<word.length; i++){					//loop iterates the input phrase
					int n = Check(word[i],alpha);					//n is the index of the first character
					if(n==-1)										//if the index is -1, the character is a space
						finished[i]=' ';							
					else{
					finished[i] = kalpha[n];						//otherwise the character is located at the index in the scrambled alphabet
					
					}
			  }
			  System.out.print((t+1)+" ");							//prints case number
				for(int i =0; i<finished.length; i++){				//loops to print out each character of the finished word
					System.out.print(finished[i]);
				}
				
				System.out.println();								//prints a new line
	
		}
		
		in.close();
		
	}
	
	public static int Check(char a, char[] alpha){
		int i=0;								//the counter is 0 by default
		if(a==' ')							//if the character is a space, returns -1 as the "index"
			return -1;
	for(i=0; i<alpha.length; i++){			//otherwise loops through the alphabet until the character finds a match
			if(a==alpha[i])					//breaks the loop
				break;
		}
		return i;							//returns the index in the alphabet
	}

}
