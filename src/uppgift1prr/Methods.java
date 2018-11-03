package uppgift1prr;
import java.util.Arrays; 
import java.util.Scanner;
public class Methods {
	
	/**
	 * Denna metod tar in tv� heltal och returnerar den minsta
	 */
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		}else {
			return b;
		}
	}
	/**
	 * Denna metod tar in tv� heltal och returnerar den st�rsta
	 */
	public static int max(int c, int d) {
		if (c > d) {
			return c;
		}else {
			return d;
		}
	}
	/**
	 * Denna metod �r skapad fr�n den f�rra metoden men anpassad efter uppgift #3
	 * Genom att j�mf�ra vartenda heltal med varandra i ordning kan man f� fram den st�rsta 
	   och sen returnera den
	 */
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
	/**
	 * Jag fick skapa denna metod f�r uppgift 7
	 * den tar in ett array av int och sorterar dem enligt storlek
	 */
	public static int[] order(int i, int j, int k, int l, int m, int n, int o, int p) {
		int iarr[] = {i, j, k, l, m, n, o, p};
		Arrays.sort(iarr);
		System.out.println("Sorted numbers:");
		for (int num : iarr) {
			System.out.println("Number = " + num);
		}
		return null;
	}
	/**
	 * Denna metod tar in en str�ng och returnerar den bakl�nges med hj�lp av charAt funktionen
	 */
	public static String reverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = (reverse + str.charAt(i));
		}
		return reverse;
	}
	/**
	 * Denna metod tar in ett heltal och returnerar hur m�nga tior som finns i talet
	 * Detta �r l�tt om man bara dividerar talet med 10 och returnerar resultatet
	 * Om talet �r mindre �n tio s� returnerar den -1 f�r att visa att det inte finns n�gra tiotal
	 */
	public static int tiotal(int i) {
	i = ( i / 10);
	if (i < 1) {
		i = -1;
		}
	return i;
	}
	/**
	 * Denna metod tar in ett int och returnerar den i bakl�nges
	 * Genom att anv�nda lite division och modulus kan man isolera de olika siffrorna i heltalet 
	   och sl�r ihop dem i omv�nt ordning
	 */
	public static int backwards(int i) {
		  int reverseint = 0;
		    for (int a = i; a != 0; a /= 10) {
		        reverseint = reverseint * 10 + a % 10;
		    }
		    return reverseint;
	}
	/**
	 * Denna metod tar in ett heltal och returnerar fakultet f�r det heltal
	 * Fakultet �r talet multiplicerat med varje tal som �r mindre �n sj�lva talet
	 */
	public static int fakultet(int i) {
		int length = i;
		i = 1;
		for (int a = length; a != 0; a--) {
			i = i * a;
		}
		return i;
	}
	/**
	 * Denna metod fr�gar efter ditt namn
	 * Sen skickar den tillbaka ditt namn ifall du gl�mde det under de f� mikrosekunderna 
	 */
	public static String askForName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your name!");
		String name = input.nextLine();
		input.close();
		return name;
	}
	/**
	 * Denna metod tar in ett char och ett str�ng 
	   och sen returnerar den hur m�nga g�nger det char du satte in framkommer i str�ngen
	 */
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
	/**
	 * Denna metod tar in ett double som representerar farhenheit v�rdet
	   och sen konverterar det till celsius genom att anv�nda konversions formeln
	 */
	public static double fahrenheitToCelsius(double farhenheit) {
		double celsius = (farhenheit - 32) * 5/9 ;
		return celsius;
	}
	/**
	 * Denna metod tar in ett double som representerar kelvin v�rdet
	   och sen konverterar det till celsius genom att anv�nda konversions formeln
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;
	}
	/**
	 * Denna metod tar in ett int och returnerar ett boolean, sant eller falskt
	   beroende p� om det int som sattes in �r ett primtal eller inte
	 */
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
