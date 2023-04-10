
import java.io.*;
public class Sample {
	public static void main(String[] args) throws IOException  {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int reverse = 0; 
		int count=0;
		while(number != 0)   
		{  
			int remainder = number % 10; 
			count++;
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		System.out.println(count);
	}  
}


/* OUTPUT
123456
The reverse of the given number is: 654321
6

*/
