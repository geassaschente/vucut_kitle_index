package vucut_kitle_hesaplama;
import java.util.Scanner;


public class vucut_kitle {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz: ");

		int userKilo = myObj.nextInt();
		System.out.println("Boyunuzu metre cinsinden giriniz: ");

		double userBoy = myObj.nextDouble();

		System.out.println("Vücut kitle endeksiniz: " + userKilo/(userBoy * userBoy));
		
	}

}
