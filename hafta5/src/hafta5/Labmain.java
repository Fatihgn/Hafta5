package hafta5;

import java.util.ArrayList;
import java.util.Scanner;

public class Labmain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> sorunlar = new ArrayList<String>();
		sorunlar.add("sorun1");
		sorunlar.add("sorun2");
		sorunlar.add("sorun3");
		sorunlar.add("sorun4");
		sorunlar.add("sorun5");
		int[][] cevaplar= {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		int donmesayisi=0;
		System.out.println("************");
		System.out.println("Hosgeldiniz");
		System.out.println("************");
		while(true)
		{
		System.out.println("1-ankete gir 2-Cıkıs yap");
		int kontrol=0;
		kontrol=scanner.nextInt();
		if(kontrol==1)
		{
			donmesayisi=donmesayisi+1;
			for(int i=0;i<5;i++)
			{
				
				System.out.println(sorunlar.get(i)+"sizin için ne kadar önemli");
				int sayac=scanner.nextInt();
				if(sayac==1)
				{
					cevaplar[i][0]=cevaplar[i][0]+1;
				}
				else if(sayac==2)
				{
					cevaplar[i][1]=cevaplar[i][1]+1;
				}
				else if(sayac==3)
				{
					cevaplar[i][2]=cevaplar[i][2]+1;
				}
				else if(sayac==4)
				{
					cevaplar[i][3]=cevaplar[i][3]+1;
				}
				else if(sayac==5)
				{
					cevaplar[i][4]=cevaplar[i][4]+1;
				}
				else if(sayac==6)
				{
					cevaplar[i][5]=cevaplar[i][5]+1;
				}
				else if(sayac==7)
				{
					cevaplar[i][6]=cevaplar[i][6]+1;
				}
				else if(sayac==8)
				{
					cevaplar[i][7]=cevaplar[i][7]+1;
				}
				else if(sayac==9)
				{
					cevaplar[i][8]=cevaplar[i][8]+1;
				}
				else 
				{
					cevaplar[i][9]=cevaplar[i][9]+1;
				}
				
			}
			for(int i=0;i<5;i++)
			{
				System.out.println(sorunlar.get(i));
				for(int j=0;j<10;j++)
				System.out.print(cevaplar[i][j]+"  ");
				System.out.println("\n");
			}
			
			int toplam1 =0;
			toplam1=toplam1+cevaplar[0][0]+2*cevaplar[0][1]+3*cevaplar[0][2]+4*cevaplar[0][3]+5*cevaplar[0][4]+6*cevaplar[0][5]+7*cevaplar[0][6]+8*cevaplar[0][7]+9*cevaplar[0][8]
					+10*cevaplar[0][9];
			int toplam2 =0;
			toplam2=toplam2+cevaplar[1][0]+2*cevaplar[1][1]+3*cevaplar[1][2]+4*cevaplar[1][3]+5*cevaplar[1][4]+6*cevaplar[1][5]+7*cevaplar[1][6]+8*cevaplar[1][7]+9*cevaplar[1][8]
					+10*cevaplar[1][9];
			int toplam3 =0;
			toplam3=toplam3+cevaplar[2][0]+2*cevaplar[2][1]+3*cevaplar[2][2]+4*cevaplar[2][3]+5*cevaplar[2][4]+6*cevaplar[2][5]+7*cevaplar[2][6]+8*cevaplar[2][7]+9*cevaplar[2][8]
					+10*cevaplar[2][9];
			int toplam4 =0;
			toplam4=toplam4+cevaplar[3][0]+2*cevaplar[3][1]+3*cevaplar[3][2]+4*cevaplar[3][3]+5*cevaplar[3][4]+6*cevaplar[3][5]+7*cevaplar[3][6]+8*cevaplar[3][7]+9*cevaplar[3][8]
					+10*cevaplar[3][9];
			int toplam5 =0;
			toplam5=toplam5+cevaplar[4][0]+2*cevaplar[4][1]+3*cevaplar[4][2]+4*cevaplar[4][3]+5*cevaplar[4][4]+6*cevaplar[4][5]+7*cevaplar[4][6]+8*cevaplar[4][7]+9*cevaplar[4][8]
					+10*cevaplar[4][9];
			
			System.out.println(toplam1+"  ilk sorunun toplami");
			System.out.println(toplam1/donmesayisi+"  ilk sorunun ortalamasi\n");
			System.out.println(toplam2+"  ikinci sorunun toplami");
			System.out.println(toplam2/donmesayisi+"  iikinci sorunun ortalamasi\n");
			System.out.println(toplam3+"  ucuncu sorunun toplami");
			System.out.println(toplam3/donmesayisi+"  ucuncu sorunun ortalamasi\n");
			System.out.println(toplam4+" dorduncu sorunun toplami");
			System.out.println(toplam4/donmesayisi+" dorduncu sorunun ortalamasi\n");
			System.out.println(toplam5+" besinci sorunun toplami");
			System.out.println(toplam5/donmesayisi+" besinci sorunun ortalamasi\n");
			
		}
		if(kontrol==2)
		{
			break;
		}
		}
		
		
		
	}

}
