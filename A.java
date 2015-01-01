package ACM2008;

import java.util.Scanner;

public class A {
	
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		
		int T = in.nextInt();
		
		for(int t=0; t<T; t++){
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println((t+1)+" "+lcm(a,b)+" "+GCF(a,b));
		
		}		
		
	}

	public static int GCF(int a, int b){
		while(b>0){
			int temp =b;
			b = a%b;
			a=temp;
		}
		return a;
	}
	
	public static int lcm (int a, int b){
		return a*(b/GCF(a,b));
	}
}
