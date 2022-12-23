package hastane;

import java.util.Scanner;
import java.util.ArrayList;

public class giriş {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		Doktor doktor3=new Doktor(100103,"Arslan","İbrahimoğlu","Plastik Cerrahi");
		Doktor doktor6=new Doktor(100106,"Ela", "Altındağ","Nöroloji");
		Doktor doktor4=new Doktor(100104,"Levent","Atahanlı","Nöroloji");
		Doktor doktor5=new Doktor(100105,"Suat","Birtan","Kardiyoloji");
		Doktor doktor1=new Doktor(100101,"Mehmet", "Günsür", "Diş");
		Doktor doktor2=new Doktor(100102,"Murat","Cagla","Ortopedi");
		
		Hasta hasta1=new Hasta(123456,null,null);
		Hasta hasta11=new Hasta(123456,null,null);
		Hasta hasta2=new Hasta(123457,null,null);
		Hasta hasta22=new Hasta(123457,null,null);
		Hasta hasta3=new Hasta(123458,null,null);
		Hasta hasta33=new Hasta(123458,null,null);
		Hasta hasta4=new Hasta(123459,null,null);
		Hasta hasta44=new Hasta(123459,null,null);
		
		
	
		ArrayList plastik= new ArrayList();
		plastik.add(09.50);
		plastik.add(11.30);
		plastik.add(14.30);
		plastik.add(17.30);
		plastik.add(19.40);
		plastik.add(20.00);
		
		ArrayList noroloji= new ArrayList();
		noroloji.add(09.50);
		noroloji.add(11.30);
		noroloji.add(14.30);
		noroloji.add(17.30);
		noroloji.add(19.40);
		noroloji.add(20.00);
		
		ArrayList kard= new ArrayList();
		kard.add(09.50);
		kard.add(11.30);
		kard.add(14.30);
		kard.add(17.30);
		kard.add(19.40);
		kard.add(20.00);
		
		ArrayList dis= new ArrayList();
		dis.add(09.50);
		dis.add(11.30);
		dis.add(14.30);
		dis.add(17.30);
		dis.add(19.40);
		dis.add(20.00);
		
		ArrayList ort= new ArrayList();
		ort.add(09.50);
		ort.add(11.30);
		ort.add(14.30);
		ort.add(17.30);
		ort.add(19.40);
		ort.add(20.00);
		
		
		
		
		int cevap,cevap2,cevap3;
		
		
		System.out.println("Hoşgeldiniz, Kullanıcı Tipinizi Seçiniz...\n");
		System.out.println("1= Hasta\n2=Doktor\n");
		cevap=scan.nextInt();
		ArrayList r1=new ArrayList();
		ArrayList r2=new ArrayList();
		ArrayList r3=new ArrayList();
		ArrayList r4=new ArrayList();
		
		if(cevap==2) {
		System.out.println("Lütfen ID Girin");
		int idd=scan.nextInt();
		
		if(idd==doktor1.id) {
			System.out.println("Hoşgeldiniz "+ doktor1.isim+ " ");
			System.out.println("Reçete Eklemek İstediğiniz Hastaya Ait ID Giriniz");
			int y=scan.nextInt();
			if(y==hasta1.id) {
				System.out.println(hasta1.id+ " İçin İşlem Yapıyorsunuz");
				
				while(1==1) {
					System.out.println("Eklemek İstediğiniz İlaçları Seçiniz\n1-A-Ferin\n2-Parol\n3-İliadin");
					int il=scan.nextInt();
					if(il==1) {
						r1.add("A-Ferin");
					}
					if(il==2) {
						r1.add("Parol");
					}
					if(il==3) {
						r1.add("İliadin");
					}
					System.out.println("eklemeye devem etmek için 1'e basın\n");
					int dongu=scan.nextInt();
					  
					  if(dongu!=1) {
						  break;
					  }
					
				}
				
			}
			if(y==hasta2.id) {
				System.out.println(hasta1.id+ " İçin İşlem Yapıyorsunuz");
				
				while(1==1) {
					System.out.println("Eklemek İstediğiniz İlaçları Seçiniz\n1-A-Ferin\n2-Parol\n3-İliadin");
					int il=scan.nextInt();
					if(il==1) {
						r2.add("A-Ferin");
					}
					if(il==2) {
						r2.add("Parol");
					}
					if(il==3) {
						r2.add("İliadin");
					}
					System.out.println("eklemeye devem etmek için 1'e basın\n");
					int dongu=scan.nextInt();
					  
					  if(dongu!=1) {
						  break;
					  }
					
				}
				
			}
			if(y==hasta3.id) {
				System.out.println(hasta1.id+ " İçin İşlem Yapıyorsunuz");
				
				while(1==1) {
					System.out.println("Eklemek İstediğiniz İlaçları Seçiniz\n1-A-Ferin\n2-Parol\n3-İliadin");
					int il=scan.nextInt();
					if(il==1) {
						r3.add("A-Ferin");
					}
					if(il==2) {
						r3.add("Parol");
					}
					if(il==3) {
						r3.add("İliadin");
					}
					System.out.println("eklemeye devem etmek için 1'e basın\n");
					int dongu=scan.nextInt();
					  
					  if(dongu!=1) {
						  break;
					  }
					
				}
				
			}
			System.out.println("Girilen Reçetelere Aktarılıyorusunuz...\n");
			System.out.println(hasta1.id+ "'e Ait Reçete..\n");
			for(int i=0;i<r1.size();i++) {
					System.out.println(r1.get(i));
			  }
		
			
			
			
			
		}
		}
		else if(cevap==1) {
		System.out.println("Lütfen ID Girin\n");
		int id= scan.nextInt();
		
		if(id==hasta1.id)
		{   System.out.println("Kullanıcı Bulundu...\n");
			System.out.println("Hangi Poliklinik İçin Randevu Almak İstersiniz?\n");
			System.out.println("1-Plastik Cerrahi");
			System.out.println("2-Nöroloji");
			System.out.println("3-Kardiyoloji");
			System.out.println("4-Diş");
			System.out.println("5-Ortopedi");
			
			cevap2=scan.nextInt();
			if(cevap2==1) {
			hasta1.pol="PLASTİK CERRAHİ";
			System.out.println("Saat Seçimi yapınız...\n");
			System.out.println("-----SAATLER-----\n");
			System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
			cevap3=scan.nextInt();
			if(cevap3==1) {
			    hasta1.rand="09:50";
				plastik.remove(0);}
			else if(cevap3==2) {
			    hasta1.rand="11:30";
				plastik.remove(1);
			}
			else if(cevap3==3) {
			    hasta1.rand="14,30";
				plastik.remove(2);
			}
			else if(cevap3==4) {
				hasta1.rand="17:30";
				plastik.remove(3);
			}
			else if(cevap3==5) {
			    hasta1.rand="19:40";
			    plastik.remove(4);
			}
			else if(cevap3==6) {
				hasta1.rand="20:00";
				plastik.remove(5);
			}
			else {
				System.out.println("Uygun Secim Yapınız");
			}
			
	  }
		
			else if(cevap2==2) {
				hasta1.pol="NÖROLOJİ";
				System.out.println("Saat Seçimi yapınız...\n");
				System.out.println("-----SAATLER-----\n");
				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
				cevap3=scan.nextInt();
				if(cevap3==1) {
				    hasta1.rand="09:50";
					noroloji.remove(0);}
				else if(cevap3==2) {
				    hasta1.rand="11:30";
					noroloji.remove(1);
				}
				else if(cevap3==3) {
				    hasta1.rand="14,30";
					noroloji.remove(2);
				}
				else if(cevap3==4) {
					hasta1.rand="17:30";
					noroloji.remove(3);
				}
				else if(cevap3==5) {
				    hasta1.rand="19:40";
				    noroloji.remove(4);
				}
				else if(cevap3==6) {
					hasta1.rand="20:00";
					noroloji.remove(5);
				}
				else {
					System.out.println("Uygun Secim Yapınız");
				}
				
		  }
              else if(cevap2==3) {
				hasta1.pol="KARDİYOLOJİ";
				System.out.println("Saat Seçimi yapınız...\n");
				System.out.println("-----SAATLER-----\n");
				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
				cevap3=scan.nextInt();
				if(cevap3==1) {
				    hasta1.rand="09:50";
					kard.remove(0);}
				else if(cevap3==2) {
				    hasta1.rand="11:30";
					kard.remove(1);
				}
				else if(cevap3==3) {
				    hasta1.rand="14,30";
					kard.remove(2);
				}
				else if(cevap3==4) {
					hasta1.rand="17:30";
					kard.remove(3);
				}
				else if(cevap3==5) {
				    hasta1.rand="19:40";
				    kard.remove(4);
				}
				else if(cevap3==6) {
					hasta1.rand="20:00";
					kard.remove(5);
				}
				else {
					System.out.println("Uygun Secim Yapınız");
				}
				
		  }
              else if(cevap2==4) {
  				hasta1.pol="DİŞ";
  				System.out.println("Saat Seçimi yapınız...\n");
  				System.out.println("-----SAATLER-----\n");
  				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
  				cevap3=scan.nextInt();
  				if(cevap3==1) {
  				    hasta1.rand="09:50";
  					dis.remove(0);}
  				else if(cevap3==2) {
  				    hasta1.rand="11:30";
  					dis.remove(1);
  				}
  				else if(cevap3==3) {
  				    hasta1.rand="14,30";
  					dis.remove(2);
  				}
  				else if(cevap3==4) {
  					hasta1.rand="17:30";
  					dis.remove(3);
  				}
  				else if(cevap3==5) {
  				    hasta1.rand="19:40";
  				    dis.remove(4);
  				}
  				else if(cevap3==6) {
  					hasta1.rand="20:00";
  				    dis.remove(5);
  				}
  				else {
  					System.out.println("Uygun Secim Yapınız");
  				}
  				
  		  }
              else if(cevap2==5) {
  				hasta1.pol="ORTOPEDİ";
  				System.out.println("Saat Seçimi yapınız...\n");
  				System.out.println("-----SAATLER-----\n");
  				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
  				cevap3=scan.nextInt();
  				if(cevap3==1) {
  				    hasta1.rand="09:50";
  					ort.remove(0);}
  				else if(cevap3==2) {
  				    hasta1.rand="11:30";
  					ort.remove(1);
  				}
  				else if(cevap3==3) {
  				    hasta1.rand="14,30";
  					ort.remove(2);
  				}
  				else if(cevap3==4) {
  					hasta1.rand="17:30";
  					ort.remove(3);
  				}
  				else if(cevap3==5) {
  				    hasta1.rand="19:40";
  				    ort.remove(4);
  				}
  				else if(cevap3==6) {
  					hasta1.rand="20:00";
  					ort.remove(5);
  				}
  				else {
  					System.out.println("Uygun Secim Yapınız");
  				}
  				
  		  }
			  
			

}
		//
		
		if(id==hasta2.id)
		{
			System.out.println("Hangi Poliklinik İçin Randevu Almak İstersiniz?\n");
			System.out.println("1-Plastik Cerrahi");
			System.out.println("2-Nöroloji");
			System.out.println("3-Kardiyoloji");
			System.out.println("4-Diş");
			System.out.println("5-Ortopedi");
			
			cevap2=scan.nextInt();
			if(cevap2==1) {
			hasta2.pol="PLASTİK CERRAHİ";
			System.out.println("Saat Seçimi yapınız...\n");
			System.out.println("-----SAATLER-----\n");
			System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
			cevap3=scan.nextInt();
			if(cevap3==1) {
			    hasta2.rand="09:50";
				plastik.remove(0);}
			else if(cevap3==2) {
			    hasta2.rand="11:30";
				plastik.remove(1);
			}
			else if(cevap3==3) {
			    hasta2.rand="14,30";
				plastik.remove(2);
			}
			else if(cevap3==4) {
				hasta2.rand="17:30";
				plastik.remove(3);
			}
			else if(cevap3==5) {
			    hasta2.rand="19:40";
			    plastik.remove(4);
			}
			else if(cevap3==6) {
				hasta2.rand="20:00";
				plastik.remove(5);
			}
			else {
				System.out.println("Uygun Secim Yapınız");
			}
			
	  }
		
			else if(cevap2==2) {
				hasta2.pol="NÖROLOJİ";
				System.out.println("Saat Seçimi yapınız...\n");
				System.out.println("-----SAATLER-----\n");
				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
				cevap3=scan.nextInt();
				if(cevap3==1) {
				    hasta2.rand="09:50";
					noroloji.remove(0);}
				else if(cevap3==2) {
				    hasta2.rand="11:30";
					noroloji.remove(1);
				}
				else if(cevap3==3) {
				    hasta2.rand="14,30";
					noroloji.remove(2);
				}
				else if(cevap3==4) {
					hasta2.rand="17:30";
					noroloji.remove(3);
				}
				else if(cevap3==5) {
				    hasta2.rand="19:40";
				    noroloji.remove(4);
				}
				else if(cevap3==6) {
					hasta2.rand="20:00";
					noroloji.remove(5);
				}
				else {
					System.out.println("Uygun Secim Yapınız");
				}
				
		  }
              else if(cevap2==3) {
            	  hasta2.pol="KARDİYOLOJİ";
				
				System.out.println("Saat Seçimi yapınız...\n");
				System.out.println("-----SAATLER-----\n");
				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
				cevap3=scan.nextInt();
				if(cevap3==1) {
				    hasta2.rand="09:50";
					kard.remove(0);}
				else if(cevap3==2) {
				    hasta2.rand="11:30";
					kard.remove(1);
				}
				else if(cevap3==3) {
				    hasta2.rand="14,30";
					kard.remove(2);
				}
				else if(cevap3==4) {
					hasta2.rand="17:30";
					kard.remove(3);
				}
				else if(cevap3==5) {
				    hasta2.rand="19:40";
				    kard.remove(4);
				}
				else if(cevap3==6) {
					hasta2.rand="20:00";
					kard.remove(5);
				}
				else {
					System.out.println("Uygun Secim Yapınız");
				}
				
		  }
              else if(cevap2==4) {
  				hasta2.pol="DİŞ";
  				System.out.println("Saat Seçimi yapınız...\n");
  				System.out.println("-----SAATLER-----\n");
  				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
  				cevap3=scan.nextInt();
  				if(cevap3==1) {
  				    hasta2.rand="09:50";
  					dis.remove(0);}
  				else if(cevap3==2) {
  				    hasta2.rand="11:30";
  					dis.remove(1);
  				}
  				else if(cevap3==3) {
  				    hasta2.rand="14,30";
  					dis.remove(2);
  				}
  				else if(cevap3==4) {
  					hasta2.rand="17:30";
  					dis.remove(3);
  				}
  				else if(cevap3==5) {
  				    hasta2.rand="19:40";
  				    dis.remove(4);
  				}
  				else if(cevap3==6) {
  					hasta2.rand="20:00";
  				    dis.remove(5);
  				}
  				else {
  					System.out.println("Uygun Secim Yapınız");
  				}
  				
  		  }
              else if(cevap2==5) {
            	  hasta2.pol="ORTOPEDİ";
  				
  				System.out.println("Saat Seçimi yapınız...\n");
  				System.out.println("-----SAATLER-----\n");
  				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
  				cevap3=scan.nextInt();
  				if(cevap3==1) {
  				    hasta2.rand="09:50";
  					ort.remove(0);}
  				else if(cevap3==2) {
  				    hasta2.rand="11:30";
  					ort.remove(1);
  				}
  				else if(cevap3==3) {
  				    hasta2.rand="14,30";
  					ort.remove(2);
  				}
  				else if(cevap3==4) {
  					hasta2.rand="17:30";
  					ort.remove(3);
  				}
  				else if(cevap3==5) {
  				    hasta2.rand="19:40";
  				    ort.remove(4);
  				}
  				else if(cevap3==6) {
  					hasta2.rand="20:00";
  					ort.remove(5);
  				}
  				else {
  					System.out.println("Uygun Secim Yapınız");
  				}
  				
  		  }
			  
			

}
		
		
		
		
		//
		
		else if(id==hasta3.id)
		{
			System.out.println("Hangi Poliklinik İçin Randevu Almak İstersiniz?\n");
			System.out.println("1-Plastik Cerrahi");
			System.out.println("2-Nöroloji");
			System.out.println("3-Kardiyoloji");
			System.out.println("4-Diş");
			System.out.println("5-Ortopedi");
			
			cevap2=scan.nextInt();
			if(cevap2==1) {
			hasta3.pol="PLASTİK CERRAHİ";
			System.out.println("Saat Seçimi yapınız...\n");
			System.out.println("-----SAATLER-----\n");
			System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
			cevap3=scan.nextInt();
			if(cevap3==1) {
			    hasta3.rand="09:50";
				plastik.remove(0);}
			else if(cevap3==2) {
			    hasta3.rand="11:30";
				plastik.remove(1);
			}
			else if(cevap3==3) {
			    hasta3.rand="14,30";
				plastik.remove(2);
			}
			else if(cevap3==4) {
				hasta3.rand="17:30";
				plastik.remove(3);
			}
			else if(cevap3==5) {
			    hasta3.rand="19:40";
			    plastik.remove(4);
			}
			else if(cevap3==6) {
				hasta3.rand="20:00";
				plastik.remove(5);
			}
			else {
				System.out.println("Uygun Secim Yapınız");
			}
			
	  }
		
			else if(cevap2==2) {
				hasta3.pol="NÖROLOJİ";
				
				System.out.println("Saat Seçimi yapınız...\n");
				System.out.println("-----SAATLER-----\n");
				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
				cevap3=scan.nextInt();
				if(cevap3==1) {
				    hasta3.rand="09:50";
					noroloji.remove(0);}
				else if(cevap3==2) {
				    hasta3.rand="11:30";
					noroloji.remove(1);
				}
				else if(cevap3==3) {
				    hasta3.rand="14,30";
					noroloji.remove(2);
				}
				else if(cevap3==4) {
					hasta3.rand="17:30";
					noroloji.remove(3);
				}
				else if(cevap3==5) {
				    hasta3.rand="19:40";
				    noroloji.remove(4);
				}
				else if(cevap3==6) {
					hasta3.rand="20:00";
					noroloji.remove(5);
				}
				else {
					System.out.println("Uygun Secim Yapınız");
				}
				
		  }
              else if(cevap2==3) {
            	  hasta3.pol="KARDİYOLOJİ";
				
				System.out.println("Saat Seçimi yapınız...\n");
				System.out.println("-----SAATLER-----\n");
				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
				cevap3=scan.nextInt();
				if(cevap3==1) {
				    hasta3.rand="09:50";
					kard.remove(0);}
				else if(cevap3==2) {
				    hasta3.rand="11:30";
					kard.remove(1);
				}
				else if(cevap3==3) {
				    hasta3.rand="14,30";
					kard.remove(2);
				}
				else if(cevap3==4) {
					hasta3.rand="17:30";
					kard.remove(3);
				}
				else if(cevap3==5) {
				    hasta3.rand="19:40";
				    kard.remove(4);
				}
				else if(cevap3==6) {
					hasta3.rand="20:00";
					kard.remove(5);
				}
				else {
					System.out.println("Uygun Secim Yapınız");
				}
				
		  }
              else if(cevap2==4) {
            	  hasta3.pol="DİŞ";
  				
  				System.out.println("Saat Seçimi yapınız...\n");
  				System.out.println("-----SAATLER-----\n");
  				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
  				cevap3=scan.nextInt();
  				if(cevap3==1) {
  				    hasta3.rand="09:50";
  					dis.remove(0);}
  				else if(cevap3==2) {
  				    hasta3.rand="11:30";
  					dis.remove(1);
  				}
  				else if(cevap3==3) {
  				    hasta3.rand="14,30";
  					dis.remove(2);
  				}
  				else if(cevap3==4) {
  					hasta3.rand="17:30";
  					dis.remove(3);
  				}
  				else if(cevap3==5) {
  				    hasta3.rand="19:40";
  				    dis.remove(4);
  				}
  				else if(cevap3==6) {
  					hasta3.rand="20:00";
  				    dis.remove(5);
  				}
  				else {
  					System.out.println("Uygun Secim Yapınız");
  				}
  				
  		  }
              else if(cevap2==5) {
  				hasta3.pol="ORTOPEDİ";
  				System.out.println("Saat Seçimi yapınız...\n");
  				System.out.println("-----SAATLER-----\n");
  				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
  				cevap3=scan.nextInt();
  				if(cevap3==1) {
  				    hasta3.rand="09:50";
  					ort.remove(0);}
  				else if(cevap3==2) {
  				    hasta3.rand="11:30";
  					ort.remove(1);
  				}
  				else if(cevap3==3) {
  				    hasta3.rand="14,30";
  					ort.remove(2);
  				}
  				else if(cevap3==4) {
  					hasta3.rand="17:30";
  					ort.remove(3);
  				}
  				else if(cevap3==5) {
  				    hasta3.rand="19:40";
  				    ort.remove(4);
  				}
  				else if(cevap3==6) {
  					hasta3.rand="20:00";
  					ort.remove(5);
  				}
  				else {
  					System.out.println("Uygun Secim Yapınız");
  				}
  				
  		  }
			  
			

}
		
		
		
		//
		
		else if(id==hasta4.id)
		{
			System.out.println("Hangi Poliklinik İçin Randevu Almak İstersiniz?\n");
			System.out.println("1-Plastik Cerrahi");
			System.out.println("2-Nöroloji");
			System.out.println("3-Kardiyoloji");
			System.out.println("4-Diş");
			System.out.println("5-Ortopedi");
			
			cevap2=scan.nextInt();
			if(cevap2==1) {
			hasta4.pol="PLASTİK CERRAHİ";
			System.out.println("Saat Seçimi yapınız...\n");
			System.out.println("-----SAATLER-----\n");
			System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
			cevap3=scan.nextInt();
			if(cevap3==1) {
			    hasta4.rand="09:50";
				plastik.remove(0);}
			else if(cevap3==2) {
			    hasta4.rand="11:30";
				plastik.remove(1);
			}
			else if(cevap3==3) {
			    hasta4.rand="14,30";
				plastik.remove(2);
			}
			else if(cevap3==4) {
				hasta4.rand="17:30";
				plastik.remove(3);
			}
			else if(cevap3==5) {
			    hasta4.rand="19:40";
			    plastik.remove(4);
			}
			else if(cevap3==6) {
				hasta4.rand="20:00";
				plastik.remove(5);
			}
			else {
				System.out.println("Uygun Secim Yapınız");
			}
			
	  }
		
			else if(cevap2==2) {
				hasta4.pol="NÖROLOJİ";
				System.out.println("Saat Seçimi yapınız...\n");
				System.out.println("-----SAATLER-----\n");
				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
				cevap3=scan.nextInt();
				if(cevap3==1) {
				    hasta4.rand="09:50";
					noroloji.remove(0);}
				else if(cevap3==2) {
				    hasta4.rand="11:30";
					noroloji.remove(1);
				}
				else if(cevap3==3) {
				    hasta4.rand="14,30";
					noroloji.remove(2);
				}
				else if(cevap3==4) {
					hasta4.rand="17:30";
					noroloji.remove(3);
				}
				else if(cevap3==5) {
				    hasta4.rand="19:40";
				    noroloji.remove(4);
				}
				else if(cevap3==6) {
					hasta4.rand="20:00";
					noroloji.remove(5);
				}
				else {
					System.out.println("Uygun Secim Yapınız");
				}
				
		  }
              else if(cevap2==3) {
				hasta4.pol="KARDİYOLOJİ";
				System.out.println("Saat Seçimi yapınız...\n");
				System.out.println("-----SAATLER-----\n");
				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
				cevap3=scan.nextInt();
				if(cevap3==1) {
				    hasta4.rand="09:50";
					kard.remove(0);}
				else if(cevap3==2) {
				    hasta4.rand="11:30";
					kard.remove(1);
				}
				else if(cevap3==3) {
				    hasta4.rand="14,30";
					kard.remove(2);
				}
				else if(cevap3==4) {
					hasta4.rand="17:30";
					kard.remove(3);
				}
				else if(cevap3==5) {
				    hasta4.rand="19:40";
				    kard.remove(4);
				}
				else if(cevap3==6) {
					hasta4.rand="20:00";
					kard.remove(5);
				}
				else {
					System.out.println("Uygun Secim Yapınız");
				}
				
		  }
              else if(cevap2==4) {
            	  hasta4.pol="DİŞ";
  				
  				System.out.println("Saat Seçimi yapınız...\n");
  				System.out.println("-----SAATLER-----\n");
  				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
  				cevap3=scan.nextInt();
  				if(cevap3==1) {
  				    hasta4.rand="09:50";
  					dis.remove(0);}
  				else if(cevap3==2) {
  				    hasta4.rand="11:30";
  					dis.remove(1);
  				}
  				else if(cevap3==3) {
  				    hasta4.rand="14,30";
  					dis.remove(2);
  				}
  				else if(cevap3==4) {
  					hasta4.rand="17:30";
  					dis.remove(3);
  				}
  				else if(cevap3==5) {
  				    hasta4.rand="19:40";
  				    dis.remove(4);
  				}
  				else if(cevap3==6) {
  					hasta4.rand="20:00";
  				    dis.remove(5);
  				}
  				else {
  					System.out.println("Uygun Secim Yapınız");
  				}
  				
  		  }
              else if(cevap2==5) {
  				hasta4.pol="ORTOPEDİ";
  				System.out.println("Saat Seçimi yapınız...\n");
  				System.out.println("-----SAATLER-----\n");
  				System.out.println("1=  09:50\n2=  11:30\n3=  14:30\n4=  17:30\n5=  19:40\n6=  20:00");
  				cevap3=scan.nextInt();
  				if(cevap3==1) {
  				    hasta4.rand="09:50";
  					ort.remove(0);}
  				else if(cevap3==2) {
  				    hasta4.rand="11:30";
  					ort.remove(1);
  				}
  				else if(cevap3==3) {
  				    hasta4.rand="14,30";
  					ort.remove(2);
  				}
  				else if(cevap3==4) {
  					hasta4.rand="17:30";
  					ort.remove(3);
  				}
  				else if(cevap3==5) {
  				    hasta4.rand="19:40";
  				    ort.remove(4);
  				}
  				else if(cevap3==6) {
  					hasta4.rand="20:00";
  					ort.remove(5);
  				}
  				else {
  					System.out.println("Uygun Secim Yapınız");
  				}
  				
  		  }
			  
			

}
		
		//
	 while(1==1) {
     System.out.println("Mevcut randevuyu görüntülemek için 1, boş randevu saatleri için 2  ye basınız...\n");
     int cvpp=scan.nextInt();
     if(cvpp==1) {
    	 System.out.println("id giriniz");
    	 int id1=scan.nextInt();
    	 if(id1==hasta1.id)
    	 {
    		System.out.println(hasta1.id + "'e sahip kullanıcının randevu bilgileri\n");
    	    System.out.println("Poliklinik: " + hasta1.pol);
    		System.out.println("Randevu Saati:  "+ hasta1.rand);
    	 }
    	 if(id1==hasta2.id)
    	 {
    		System.out.println(hasta2.id + "'e sahip kullanıcının randevu bilgileri\n");
    	    System.out.println("Poliklinik: " + hasta2.pol);
    		System.out.println("Randevu Saati:  "+ hasta2.rand);
    	 }
    	 if(id1==hasta3.id)
    	 {
    		System.out.println(hasta3.id + "'e sahip kullanıcının randevu bilgileri\n");
    	    System.out.println("Poliklinik: " + hasta3.pol);
    		System.out.println("Randevu Saati:  "+ hasta3.rand);
    	 }
    	 if(id1==hasta4.id)
    	 {
    		System.out.println(hasta4.id + "'e sahip kullanıcının randevu bilgileri\n");
    	    System.out.println("Poliklinik: " + hasta4.pol);
    		System.out.println("Randevu Saati:  "+ hasta4.rand);
    	 }
    	 
    	 
     }
     else {
    	 System.out.println("Id Giriniz");
    	 int id1=scan.nextInt();
    	 if(id1==hasta11.id)
    	 {
    		System.out.println("Hangi Poliklinik İçin Randevu Saatlerini Öğrenmek İstersiniz?\n");
 			System.out.println("1-Plastik Cerrahi");
 			System.out.println("2-Nöroloji");
 			System.out.println("3-Kardiyoloji");
 			System.out.println("4-Diş");
 			System.out.println("5-Ortopedi");
 			
 			int cevap22=scan.nextInt();
 			if(cevap22==1) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<plastik.size();i++) {
 					System.out.println(plastik.get(i));
 				}
 			}
 			if(cevap22==2) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<noroloji.size();i++) {
 					System.out.println(noroloji.get(i));
 			  }
    	   }
 			if(cevap22==3) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<kard.size();i++) {
 					System.out.println(kard.get(i));
 			  }
    	   }
 			if(cevap22==4) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<dis.size();i++) {
 					System.out.println(dis.get(i));
 			  }
    	   }
 			if(cevap22==5) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<ort.size();i++) {
 					System.out.println(ort.get(i));
 			  }
    	   }
 			
 			
    	 if(id1==hasta2.id)
    	 {
    		 System.out.println("Hangi Poliklinik İçin Randevu Saatlerini Öğrenmek İstersiniz?\n");
  			System.out.println("1-Plastik Cerrahi");
  			System.out.println("2-Nöroloji");
  			System.out.println("3-Kardiyoloji");
  			System.out.println("4-Diş");
  			System.out.println("5-Ortopedi");
  			
  			 cevap22=scan.nextInt();
  			if(cevap22==1) {
  				System.out.println("Randevu Alınabilecek Saatler\n");
  				for(int i=0;i<plastik.size();i++) {
  					System.out.println(plastik.get(i));
  				}
  			}
  			if(cevap22==2) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<noroloji.size();i++) {
 					System.out.println(noroloji.get(i));
 			  }
    	   }
 			if(cevap22==3) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<kard.size();i++) {
 					System.out.println(kard.get(i));
 			  }
    	   }
 			if(cevap22==4) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<dis.size();i++) {
 					System.out.println(dis.get(i));
 			  }
    	   }
 			if(cevap22==5) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<ort.size();i++) {
 					System.out.println(ort.get(i));
 			  }
    	   }
  			
    	 }
    	 if(id1==hasta3.id)
    	 {
    		 System.out.println("Hangi Poliklinik İçin Randevu Saatlerini Öğrenmek İstersiniz?\n");
  			System.out.println("1-Plastik Cerrahi");
  			System.out.println("2-Nöroloji");
  			System.out.println("3-Kardiyoloji");
  			System.out.println("4-Diş");
  			System.out.println("5-Ortopedi");
  			
  			int cevap33=scan.nextInt();
  			if(cevap33==1) {
  				System.out.println("Randevu Alınabilecek Saatler\n");
  				for(int i=0;i<plastik.size();i++) {
  					System.out.println(plastik.get(i));
  				}
  			}
  			if(cevap22==2) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<noroloji.size();i++) {
 					System.out.println(noroloji.get(i));
 			  }
    	   }
 			if(cevap22==3) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<kard.size();i++) {
 					System.out.println(kard.get(i));
 			  }
    	   }
 			if(cevap22==4) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<dis.size();i++) {
 					System.out.println(dis.get(i));
 			  }
    	   }
 			if(cevap22==5) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<ort.size();i++) {
 					System.out.println(ort.get(i));
 			  }
    	   }
    	 }
    	 if(id1==hasta4.id)
    	 {
    		 System.out.println("Hangi Poliklinik İçin Randevu Saatlerini Öğrenmek İstersiniz?\n");
  			System.out.println("1-Plastik Cerrahi");
  			System.out.println("2-Nöroloji");
  			System.out.println("3-Kardiyoloji");
  			System.out.println("4-Diş");
  			System.out.println("5-Ortopedi");
  			
  			int cevap44=scan.nextInt();
  			if(cevap44==1) {
  				System.out.println("Randevu Alınabilecek Saatler\n");
  				for(int i=0;i<plastik.size();i++) {
  					System.out.println(plastik.get(i));
  				}
  			}
  			if(cevap22==2) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<noroloji.size();i++) {
 					System.out.println(noroloji.get(i));
 			  }
    	   }
 			if(cevap22==3) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<kard.size();i++) {
 					System.out.println(kard.get(i));
 			  }
    	   }
 			if(cevap22==4) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<dis.size();i++) {
 					System.out.println(dis.get(i));
 			  }
    	   }
 			if(cevap22==5) {
 				System.out.println("Randevu Alınabilecek Saatler\n");
 				for(int i=0;i<ort.size();i++) {
 					System.out.println(ort.get(i));
 			  }
    	   }
    	 }
    	 
    	 
    	 
     }
     
	}System.out.println("devam etmek istiyorsanız bire basın...");
	 int dongu=scan.nextInt();
	  
	  if(dongu!=1) {
		  break;
	 }
	 }
	 
		}}}
		
		
		
		
		
		
	
		
		
	


		
