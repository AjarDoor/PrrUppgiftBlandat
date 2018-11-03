package uppgift1prr;
import java.util.Arrays;
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
	public static int maxtask(int a, int b, int c, int d, int e) {
		if (a > b && a > c && a > d && a > e) {
			return a;
		}else if (b > a && b > c && b > d && b > e){
			return b;
		}else if (c > a && c > b && c > d && c > e) {
			return c;
		}else if (d > a && d > b && d > c && d > e) {
			return d;
		}else {
			return e;
		}
	}
	public static int[] order(int i, int j, int k, int l, int m, int n, int o, int p) {
		int iarr[] = {i, j, k, l, m, n, o, p};
		Arrays.sort(iarr);
		System.out.println("Sorted numbers:");
		for (int num : iarr) {
			System.out.println("Number = " + num);
		}
		return null;
	}
	
	public static String reverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = (reverse + str.charAt(i));
		}
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
		    for (int a = i; a != 0; a /= 10) {
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
	
	public static double fahrenheitToCelsius(double farhenheit) {
		double celsius = (farhenheit - 32) * 5/9 ;
		return celsius;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;
	}
	
	public static boolean isPrim(int i) {
        boolean flag = true;
        for(int a = 2; a <= i/2; ++a)
        {
            // condition for nonprime number
            if(i % a == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
	}

}
