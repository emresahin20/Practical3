import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Bir Gün Giriniz: ");
//		int day = scan.nextInt();
//
//		switch (day) {
//		case 1:
//			System.out.println("Pazartesi");
//			break;
//		case 2:
//			System.out.println("Salı");
//			break;
//		case 3:
//			System.out.println("Çarşamba");
//			break;
//		case 4:
//			System.out.println("Perşembe");
//			break;
//		case 5:
//			System.out.println("Cuma");
//			break;
//		case 6:
//			System.out.println("Cumartesi");
//			break;
//		case 7:
//			System.out.println("Pazar");
//			break;
//		}

//		Scanner scan = new Scanner(System.in);
//		System.out.print("1. Sayıyı Giriniz: ");
//		float x = Float.parseFloat(scan.nextLine());
//		System.out.print("2. Sayıyı Giriniz: ");
//		float y = Float.parseFloat(scan.nextLine());
//		System.out.println("İşlem");
//		char islem = scan.nextLine().charAt(0);
//
//		switch (islem) {
//		case '+':
//			System.out.println("Sonuc: " + (x + y));
//			break;
//		case '-':
//			System.out.println("Sonuc: " + (x - y));
//			break;
//		case '*':
//			System.out.println("Sonuc: " + (x * y));
//			break;
//		case '/':
//			System.out.println("Sonuc: " + (x / y));
//			break;
//		default:
//			System.out.println("Geçersiz Operatör! ");
//			break;
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Haftanın Günü: ");
		int gun = scan.nextInt();
		
		switch(gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta içi");
			break;
		
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
			default:
				System.out.println("Geçersiz Gün Sayısı");
		}
	}

}
