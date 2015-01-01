/* Question: http://www.acmgnyr.org/year2008/a.pdf */
package ACM2008;

import java.util.Scanner;

public class A {
	
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		
		int N = in.nextInt();	//the number of cases
		
		for(int t=0; t<N; t++){
			int a = in.nextInt();	//two positive integers
			int b = in.nextInt();
			
			System.out.println((t+1)+" "+LCM(a,b)+" "+GCF(a,b));		//uses separate functions to get a print out the lcm and gcf
		
		}
		
		in.close();
		
	}

	public static int GCF(int a, int b){	//Euclidean algorithm
		while(b>0){
			int temp =b;					//stores b in a temporary variable
			b = a%b;						//b is the modulus of a div b
			a=temp;							//a is b on the previous iteration
		}
		return a;							//returns a when b==0 
	}
	
	public static int LCM (int a, int b){	//LCM uses the GCF, is just one of the numbers multipled by (the other number divided by the GCF of the two numbers)
		return a*(b/GCF(a,b));
	}
}
