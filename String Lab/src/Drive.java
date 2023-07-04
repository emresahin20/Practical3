import java.util.Scanner;

public class Drive {
	public static void main(String[] args) {
		
		String str1 ="Hello";
		String str2 ="Hello";
		String str3= "hello";
		
		//System.out.print(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str3));
		
		System.out.println("---------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Yazı Yazınız: ");
		String line = scan.nextLine();
		System.out.println(line.toLowerCase()); //Küçük harfle yazar
		System.out.println(line.toUpperCase());	// Büyük harfle yazar
		System.out.println(line.charAt(3)); //3 sayıyı yazdırır
		
		System.out.println(line.length()); // İsim uzunluğunu verir
		System.out.println(line.substring(2)); //seçilen yerden sonra yazdırır
		System.out.println(line.isEmpty());	
		System.out.println(line.replace("Sa","hin")); //ilk secilen yer ile sonraki seçilen yer değişir 
		
		System.out.println(line.indexOf("a"));	// A kaçta onu söyler
		System.out.println(line.lastIndexOf("e"));	// e kaçta onu söyler
		System.out.println(line.trim()); // Başındaki ve Sonundaki boşlukları atar
		
		
	}
}
