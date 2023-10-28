package ilkdeneme;
import java.util.*;

public class KdvHesaplama {

	public static void main(String[] args) {
		Scanner İnput=new Scanner(System.in);
		int urunfiyat;
		float kdv=(float)0.17;
		float vergi=(float) 0.15;
		double kdvlifiyat,vergilifiyat;
		double toplamtutar;
		
		System.out.print("seçtiğiniz ürün fiyatı: ");
		urunfiyat=İnput.nextInt();
		System.out.println("uygulanan kdv miktarı: "+kdv);
		System.out.println("uygulanan vergi miktarı: "+vergi);
		
		kdvlifiyat=(urunfiyat*kdv) + urunfiyat;
		vergilifiyat=(urunfiyat*vergi) + urunfiyat;
		System.out.println("kdv sonucu ürün fiyati: "+kdvlifiyat);
		System.out.println("vergi sonucu ürün fiyatı: "+vergilifiyat);
		
		toplamtutar=urunfiyat*(kdv+vergi) + urunfiyat;
		
		System.out.println("kdv ve vergi sonucu toplam tutar: "+toplamtutar);
		
		
		
		

	}

}
