package hafta5;

public class TimeTest {

	public static void main(String[] args) {
		/*Time1 saat=new Time1();
		saat.setTime(12, 12, 50);
		System.out.println(saat.saat());
		System.out.println("Set sayisi :"+Time1.getCount());*/
		Time2 saat2=new Time2();
		saat2.setSaatDakika(9,20);
		System.out.println(saat2.saat());
		Time2 saat3=new Time2(3,45,55);
		System.out.println(saat3.saat());
	}

}
