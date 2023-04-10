package stringpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number: ");
		int num=Integer.parseInt(br.readLine());
		int count=1;
    
		System.out.println("with for loop");
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
    
		System.out.println("with while loop");
		while(count<=num) {
			System.out.println(count);
			count++;
		}
    
		System.out.println("with methods");
		printWihtoutLoop(1,num);
	}

	public static void printWihtoutLoop(int n,int num){
		if(n <= num){

			System.out.println(n);
			printWihtoutLoop( n+1,num );
		}
	}
}


//output
/*
enter number: 
5
with for loop
1
2
3
4
5
with while loop
1
2
3
4
5
with methods
1
2
3
4
5
*/
