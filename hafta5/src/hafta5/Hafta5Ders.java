package hafta5;

import java.util.ArrayList;

public class Hafta5Ders {

	public static void main(String[] args) {
		ArrayList<String> item=new ArrayList<String>();
		item.add("red");
		item.add("yellow");
		item.add(0,"green");
		for(String renk:item)
		{
			System.out.printf("%s ",renk);
		}
		item.remove("red");
		System.out.println("");
		for(String renk:item)
		{
			System.out.print(" "+renk);
		}
		System.out.println(" ");
		System.out.println(item.get(1));
		System.out.println(item.contains("red")?"evet var":"hayir yok");

	}

}
