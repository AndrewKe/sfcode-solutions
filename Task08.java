import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < a.length(); i++) {
        	Character c = a.charAt(i);
        	if (!map.containsKey(c)) {
        		map.put(c, 0);
        	}else {
        		map.put(c, map.get(c)+1);
        	}
        }

        String out = "";
        for (int i = 0; i < b.length(); i++) {
        	Character c = b.charAt(i);
        	if (map.containsKey(c)) {
        		out += c;
        		if (map.get(c) != 0) {
        			map.put(c, map.get(c)-1);
        		} else {
        			map.remove(c);
        		}
        	}
        }

        char[] ar = out.toCharArray();
        Arrays.sort(ar);
        System.out.println(String.valueOf(ar));
    }

}
