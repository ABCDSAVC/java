package ilkdeneme;
import java.util.*;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.println("birinci sayi giriniz: ");
		sayi1=Input.nextInt();
		System.out.println("ikinci sayiyi giriniz: ");
		sayi2=Input.nextInt();
		System.out.println("yapılmak istenen işlem numarası\n1.toplama\n2.cıkarma\n3.bölme\n4.carpma");
		secim=Input.nextInt();
		
		if(secim==1) {
			int toplama;
			toplama=sayi1+sayi2;
			System.out.println("sayıların toplamı: "+toplama);
		}
		else if(secim==2) {
			int cıkarma;
			cıkarma=sayi1-sayi2;
			System.out.println("sayıların cıkarması: "+cıkarma);
		}
		else if(secim==3) {
			float bolme;
		    bolme=(float)sayi1/sayi2;
			System.out.println("sayıların bölümü: "+bolme);
		}
		else {
			int carpma;
			carpma=sayi1*sayi2;
			System.out.println("sayıların çarpımı: "+carpma);
		}
          
	}

}
