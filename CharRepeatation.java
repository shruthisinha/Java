import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class CharReapeat {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	
	HashMap <Character,Integer> hashmap=new HashMap<>();
	int count=0;
	char ch;
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		
		if(hashmap.containsKey(ch)) {
			count=hashmap.get(ch);
			count++;
			hashmap.replace(ch, count);
			
		}
		else
			hashmap.put(ch,1);
	}
	//System.out.println(hashmap);
	
	 for (Map.Entry<Character,Integer> set : hashmap.entrySet()) {

        System.out.print(set.getKey() + ""+ set.getValue());
    }
	
	}
}
