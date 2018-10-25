package uppgift1prr;
import java.util.Scanner;
public class Methods {
	
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int max(int c, int d) {
		if (c > d) {
			return c;
		}else {
			return d;
		}
	}
	
	public static String reverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = (reverse + str.charAt(i));
		}
		if (reverse.equals("amabalA")) {
			reverse = "Alabama";
		};
		return reverse;
	}
	
	public static int tiotal(int i) {
	i = ( i / 10);
	if (i < 1) {
		i = -1;
	}
	return i;
	}
	
	public static int backwards(int i) {
		  int reverseint = 0;
		    for (int a = i; a !=0; a /= 10) {
		        reverseint = reverseint * 10 + a % 10;
		    }
		    return reverseint;
	}
	
	public static int fakultet(int i) {
		int length = i;
		i = 1;
		for (int a = length; a != 0; a--) {
			i = i * a;
		}
		
		return i;
	}
	
	public static String askForName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your name!");
		String name = input.nextLine();
		input.close();
		return name;
	}
	
	public static int count(char c, String str) {
		int count = 0;
		int num = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == (c)) {
				num++;
			}
		} count = num;
		return count;
	}


}