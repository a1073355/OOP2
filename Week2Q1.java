package Hw;
import java.util.Random;
import java.util.TreeSet;

public class Week2Q1 {
	    public static void main(String[] args) {

	        TreeSet<Integer> numbers = new TreeSet<>();
	        TreeSet<Integer> numbers2 = new TreeSet<>();
	        TreeSet<Integer> numbers3 = new TreeSet<>();
	        
	        System.out.println("電腦從1~100中，亂數取出10個不重複的號碼....");
	        
	        for(int i=1;i<=10;i++)
	        {
	        	int num=(int)(Math.random()*100)+1;
	        	numbers.add(num);
	        	System.out.println("第"+i+"個號碼:"+num);
	        }
	        
	        numbers2=(TreeSet<Integer>) numbers.headSet(71);
	        numbers3=(TreeSet<Integer>) numbers2.tailSet(29);
	        
	        System.out.println("物件內的元素個數為:"+numbers.size());
	        System.out.println("物件內的元素內容為:"+numbers);
	        System.out.println("第一個元素內容為:"+numbers.first());
	        System.out.println("最後一個元素內容為:"+numbers.last());
	        System.out.println("內容介於30~70者:"+numbers3);
	    }
	}


