package ilkdeneme;
import java.util.*;

public class DaireAlanCevreHacim {

	public static void main(String[] args) {
		Scanner İnput=new Scanner(System.in);
		double hacim,alan,cevre;
		float pi=(float)3.14;
		double r;
		
		System.out.print("Dairenin yarıçapını giriniz: ");
		r=İnput.nextDouble();
		
		hacim=4/3*pi*r*r*r;
		alan=pi*r*r;
		cevre=2*pi*(r+r);
		
		System.out.println("dairenin hacmi: "+hacim);
		System.out.println("dairenin alanı: "+alan);
		System.out.println("dairenin çevresi: "+cevre);
		

	}

}
