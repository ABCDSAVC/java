package ilkdeneme;
import java.util.*;

public class NotOrtGöreSınıflandırma {

	public static void main(String[] args) {
		Scanner deger=new Scanner(System.in);
		int vize,sözlü,fınal;
		System.out.print("vize sonucunuzu giriniz:");
		vize=deger.nextInt();
		System.out.print("sözlü sonucunu giriniz:");
		sözlü=deger.nextInt();
		System.out.print("final sonucunu giriniz:");
		fınal=deger.nextInt();
		
		double ortalama;
		ortalama=(vize*0.30)+(sözlü*0.20)+(fınal*0.5);
		System.out.println("ortalamanız:"+ortalama);
		
		if (ortalama>=95) {
			System.out.print("not ortalamız:AA");
		}
		else if(ortalama>=85) {
			System.out.print("not ortalamanzı:AB");
		}
		else if(ortalama>=75) {
			System.out.print("not ortalamanzı:BB");
		}
		else if(ortalama>=65) {
			System.out.print("not ortalamanzı:BC");
		}
		else if(ortalama>=60) {
			System.out.print("not ortalamanzı:CD");
		}
		else if(ortalama>=50) {
			System.out.print("not ortalamanzı:DD");
		}
		else {
			System.out.print("sınıf tekrarı:(");
		}

	}

}
