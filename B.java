package ACM2008;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
	
	public static void main(String args[]){
		
		Scanner in = new Scanner (System.in);
		
		int T = in.nextInt();
		
		for(int t=0; t<T; t++){
			in.nextLine();
			char[] word = in.nextLine().toCharArray();
			char[] kalpha = in.next().toCharArray();
			char[] alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
			char[] finished = new char[word.length];
			  
			
			  for(int i =0; i<word.length; i++){
					int n = Check(word[i],alpha);
					if(n==-1)
						finished[i]=' ';
					else{
					finished[i] = kalpha[n];
					
					}//System.out.println(kalpha);
			  }
			  System.out.print((t+1)+" ");
				for(int i =0; i<finished.length; i++){
					System.out.print(finished[i]);
				}
				
				System.out.println();
	
		}	
		
	}
	
	public static int Check(char a, char[] alpha){
		int i=0;
		if(a==' '){
			return -1;
		}
		for(i=0; i<alpha.length; i++){
			if(a==alpha[i]){
				return i;
			}
		}
		return i;
	}

}
