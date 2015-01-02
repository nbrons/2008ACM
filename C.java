/*Question: http://www.acmgnyr.org/year2008/c.pdf */
package ACM2008;

import java.util.Scanner;

public class C {
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);	//opens a new scanner
		
		int N = in.nextInt();					//gets the number of test cases
		in.nextLine();							//moves the scanner to the next line
		for(int t=0; t<N; t++){					//iterates each case
		String [] input = in.nextLine().split(":");	//gets the input time, splits the string into three items
		
		int H = Integer.valueOf(input[0]);		//converts the H M and S into integers
		int M = Integer.valueOf(input[1]);
		int S = Integer.valueOf(input[2]);
		
		int[] HCon = Convert(H);				//converts each int into their binary format, sends them to an integer array
		int[] MCon = Convert(M);
		int[] SCon = Convert(S);
		
		int [][] horizontal = new int [3][6];	//declares two new arrays, one for the vertical time, one for horizontal
		int [][] vertical = new int [6][3];
		
		for(int i =0; i<3; i++){				//fills the horizontal 2D array
			for(int k=0; k<6; k++){
				if(i==0)
					horizontal[i][k] = HCon[k];
				else if(i==1)
					horizontal[i][k] = MCon[k];
				else
					horizontal[i][k] = SCon[k];
			}
		}

		for(int i =0; i<3; i++){				//fills the vertical 2D array
			for(int k=0; k<6; k++){
				if(i==0)
					vertical[k][i] = HCon[k];
				else if(i==1)
					vertical[k][i] = MCon[k];
				else
					vertical[k][i] = SCon[k];
			}
		}
		
		System.out.print((t+1)+" ");			//prints case number
		for(int i =0; i<6; i++)					//prints the vertical time
			for(int k=0; k<3; k++)
				System.out.print(vertical[i][k]);
		
		System.out.print(" ");					//prints a space
		
		for(int i =0; i<3; i++)					//prints the horizontal time
			for(int k=0; k<6; k++)
				System.out.print(horizontal[i][k]);
		
		System.out.print("\n");					//prints a new line
		
		}
		in.close();								//closes the scanner
	}
	
	public static int[] Convert(int a){			//Function to convert integers into binary
		int[] digits = new int[6];				//new array for each digit, up to 2^5
		for(int i =0; i<6; i++){				//zeros out the array
			digits[i] =0;
		}
		while(a>0){								//while the input number is greater than zero
		if(a%32==0){							//if a mod 32 is 0, 2^5 becomes a 1
			digits[0] = 1;
			a=a-32;								//32 is subtracted from the remaining total
		}
		else if(a%16==0){						//same thing for 2^4
			digits[1] = 1;
			a=a-16;
		}
		else if(a%8==0){						//2^3
			digits[2] =1;
			a=a-8;
		}
		else if(a%4==0){						//2^2
			digits[3] = 1;
			a=a-4;
		}
		else if(a%2==0){						//2^1
			digits[4] =1;
			a=a-2;
		}
		else{									//2^0
			digits[5] = 1;
			a=a-1;
		}
		
		}
		return digits;							//returns the resulting array
	}
}
