package anket;
import java.util.ArrayList;
import java.util.Scanner;
public class anket1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		ArrayList veri= new ArrayList();
		int cvp1,cvp2,cvp3,cvp4,cvp5;
		int i=0;
		int dongu;
		String a= "Y";
		String b= "y";
		double ort1, ort2, ort3, ort4, ort5;
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
		int max = sum1;

		while (1 == 1) {
			i++;
			veri.add(i);
			System.out.printf("Teste Hosgeldiniz %d. kisi\n", i);
			System.out.println("Lutfen sorulara 1-5 arasi bir puan veriniz!!\n");
			System.out.println("Alim gücü problemini oylayiniz?\n");
			cvp1 = scan.nextInt();
			if (cvp1 <= 0 || cvp1 > 5) {
				System.out.println("1-5 arası oylayiniz\n");
				return;
			}
			veri.add(cvp1);
			System.out.println("Hava kirliliği problemini oylayiniz\n");
			cvp2 = scan.nextInt();
			if (cvp2 <= 0 || cvp2 > 5) {
				System.out.println("1-5 arası oylayiniz\n");
				return;
			}
			veri.add(cvp2);
			System.out.println("egitim kalitesizligini oylayiniz\n");
			cvp3 = scan.nextInt();
			if (cvp3 <= 0 || cvp3 > 5) {
				System.out.println("1-5 arası oylayiniz\n");
				return;
			}
			veri.add(cvp3);
			System.out.println("beyin gocu problemini oylayiniz\n");
			cvp4 = scan.nextInt();
			if (cvp4 <= 0 || cvp4 > 5) {
				System.out.println("1-5 arası oylayiniz\n");
				return;
			}
			veri.add(cvp4);
			System.out.println("gocmen problemini oylayiniz\n");
			cvp5 = scan.nextInt();
			if (cvp5 <= 0 || cvp5 > 5) {
				System.out.println("1-5 arası oylayiniz\n");
				return;
			}
			veri.add(cvp5);

			System.out.println("devam için bir,durmak icin herhangi bir tusu tuslayin");
			dongu = scan.nextInt();

			if (dongu!=1) {
				break;
			}
		}

		System.out.println("alim gücü-hava kirliligi-egitim-beyin gocu-gocmen");

		for (int j = 0; j < i * 6; j += 6) {
			System.out.printf("%d.kisi  |   %d    |   %d    |  %d   |   %d    |   %d     |", veri.get(j),
					veri.get(j + 1), veri.get(j + 2), veri.get(j + 3), veri.get(j + 4),
					veri.get(j + 5));
			System.out.println();
		}

		int alimgucu[] = new int[i];
		int havakirliligi[] = new int[i];
		int egitim[] = new int[i];
		int beyingocu[] = new int[i];
		int gocmen[] = new int[i];

		for (int k = 0; k < i * 6; k += 6) {
			alimgucu[k / 6] = (int) veri.get(k + 1);
			havakirliligi[k / 6] = (int) veri.get(k + 2);
			egitim[k / 6] = (int) veri.get(k + 3);
			beyingocu[k / 6] = (int) veri.get(k + 4);
			gocmen[k / 6] = (int) veri.get(k + 5);
		}

		for (int value : alimgucu) {
			sum1 = sum1 + value;
		}
		for (int value : havakirliligi) {
			sum2 = sum2 + value;
		}
		for (int value : egitim) {
			sum3 = sum3 + value;
		}
		for (int value : beyingocu) {
			sum4 = sum4 + value;
		}
		for (int value : gocmen) {
			sum5 = sum5 + value;
		}

		ort1 = (double) sum1 / alimgucu.length;
		ort2 = (double) sum2 / havakirliligi.length;
		ort3 = (double) sum3 / egitim.length;
		ort4 = (double) sum4 / beyingocu.length;
		ort5 = (double) sum5 / gocmen.length;

		if (max < sum2) {
			max = sum2;
		}
		if (max < sum3) {
			max = sum3;
		}
		if (max < sum4) {
			max = sum4;
		}
		if (max < sum5) {
			max = sum5;
		}

		int min = sum1;

		if (min > sum2) {
			min = sum2;
		}
		if (min > sum3) {
			min = sum3;
		}
		if (min > sum4) {
			min = sum4;
		}
		if (min > sum5) {
			min = sum5;
		}

		System.out.println("       -        -         -      -        -         \n  ");
		System.out.printf("Ortalama|  %.2f  |  %.2f  | %.2f |  %.2f  |  %.2f   |\n", ort1, ort2, ort3, ort4, ort5);
		System.out.println("       -        -        -       -       -         -" );
		if (max == sum1) {
			System.out.println("En Cok Oy Alan: Alım Gucu " + sum1);
		} else if (max == sum2) {
			System.out.println("En Cok Oy Alan: Hava Kirliligi " + sum2);
		} else if (max == sum3) {
			System.out.println("En Cok Oy Alan: Egitimsizlik " + sum3);
		} else if (max == sum4) {
			System.out.println("En Cok Oy Alan: Beyin Gocu " + sum4);
		} else if (max == sum5) {
			System.out.println("En Cok Oy Alan: Gocmen " + sum5);
		}

		if (min == sum1) {
			System.out.println("En Az Oy Alan: Alim Gucu " + sum1);
		} else if (min == sum2) {
			System.out.println("En Az Oy Alan: Hava Kirliligi " + sum2);
		} else if (min == sum3) {
			System.out.println("En Az Oy Alan: Egitimsizlik " + sum3);
		} else if (min == sum4) {
			System.out.println("En Az Oy Alan: Beyin Gocu " + sum4);
		} else if (min == sum5) {
			System.out.println("En Az Oy Alan: Gocmen " + sum5);
		}
	}

}
