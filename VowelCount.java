
import java.io.*;

public class CountVowel {
public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	str=str.replace(" ","").toLowerCase();         //remove spaces in sentence and Convert String to Lower Case
	char[] ch= {'a','e','i','o','u'};
	int count=0;
	for(int i=0;i<str.length();i++) {
		for(int j=0;j<ch.length;j++) {
		if(str.charAt(i)==ch[j]) {
			count++;
		}
		}
	}
	if(count>0) {
		System.out.println(count);
	}
	else
		System.out.println("no vowel");
	
}
}
