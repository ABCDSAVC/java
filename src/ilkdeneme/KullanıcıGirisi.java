package ilkdeneme;
import java.util.Scanner;
public class KullanıcıGirisi {

	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		String pasport="12345";
		String u_name="fadime";
		String k_adi;
		String parola;
		System.out.print("lütfen paraloyı giriniz:");
		parola=Input.next();
		System.out.print("lütfen kullanıcı adınız giriniz:");
		k_adi=Input.next();
		
		if(pasport.equals(parola) && u_name.equals(k_adi)) {
			System.out.println("sisteme hoşgeldiniz");
		}
		else {
			System.out.println("kullanıcı adı ve şifre hatalı");
		}

	}

}
