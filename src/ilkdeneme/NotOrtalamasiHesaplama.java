package ilkdeneme;
import java.util.*;

public class NotOrtalamasiHesaplama {

	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		int a,b;
		double ort;
		
		 System.out.print("vize sinav notunuzu giriniz: ");
		 a=Input.nextInt();
		 System.out.print("final sinav notunuzu giriniz: ");
		 b=Input.nextInt();
		 
		 System.out.println("vize sonucu: "+a);
		 System.out.println("final sonucu: "+b);
		 
		 ort=(a*0.4) + (b*0.6);
		 System.out.println("vize ve final ortalmanız: "+ort);
		 

	}

}
