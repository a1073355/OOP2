package Hw;
import java.util.HashMap;
import java.util.Scanner;
public class Week2Q2 {
    public static void main(String[] args) {
    	var Hmap=new HashMap<>();
		Hmap.put("1","January");
		Hmap.put("2","February");
		Hmap.put("3","March");
		Hmap.put("4","April");
		Hmap.put("5","May");
		Hmap.put("6","June");
		Hmap.put("7","July");
		Hmap.put("8","August");
		Hmap.put("9","September");
		Hmap.put("10","October");
		Hmap.put("11","November");
		Hmap.put("12","December");


		Scanner sc=new Scanner(System.in);
		
		
		for(;;)
		{
			System.out.println("請輸入1~12?");
			String s=sc.next();
			int s2=Integer.parseInt(s);
			if(s2>=1 && s2<=12)
			{
				System.out.println(Hmap.get(s));
				break;
			}
			else
			{
				System.out.println("範圍錯誤!");
			}
		}
		
		
    	
    }

}
