import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		StringBuffer buffer= new StringBuffer();
		System.out.print("Adınız : ");
		buffer.append("Ad: ");
		buffer.append(scan.nextLine());
		System.out.print("Soyadınız : ");
		buffer.append(" Soyad: ");
		buffer.append(scan.nextLine());
		System.out.println(buffer.toString());
	}
}
