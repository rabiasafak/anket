package hastane;
import java.util.ArrayList;
import java.util.Scanner;
public class Doktor {
	public String isim;
	public int id;
	public String soyisim;
	public String poliklinik;
	
	Scanner scan=new Scanner(System.in);
	Hasta hasta1=new Hasta(123456,null,null);
	Hasta hasta11=new Hasta(123456,null,null);
	Hasta hasta2=new Hasta(123457,null,null);
	Hasta hasta22=new Hasta(123457,null,null);
	Hasta hasta3=new Hasta(123458,null,null);
	Hasta hasta33=new Hasta(123458,null,null);
	Hasta hasta4=new Hasta(123459,null,null);
	Hasta hasta44=new Hasta(123459,null,null);
	
	protected Doktor(int id,String isim,String Soyisim,String poliklinik) {
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
		this.poliklinik=poliklinik;
		
	}
	
	public void receteYaz(int c ) {
		if(c==hasta1.id) {
			
			
			
		}
		
		
		
	}

}
