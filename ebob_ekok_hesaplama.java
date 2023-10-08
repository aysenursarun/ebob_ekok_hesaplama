package ebob_ekok_hesaplama;

import java.util.Scanner;

public class ebob_ekok_hesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Küçük sayıyı girin: ");
		int sayi1 = scan.nextInt();
		
		System.out.print("Büyük sayıyı girin: ");
		int sayi2 = scan.nextInt();
		
		int x = 1;
		int ebob = 1;
		int ekok = 0;
		
		if(sayi1>sayi2) {
			System.out.println("Lütfen ilk küçük sayıyı girin.");
		}
		
		while(x<sayi1) {
			if(sayi1%x==0 && sayi2%x==0) {
				ebob = x;
			}
			x++;
		}
		
		ekok = (sayi1*sayi2)/ebob;
		
		System.out.println("ebob: " + ebob);
		System.out.println("ekok: " + ekok);
	}

}
