package Hw;
import java.util.Random;

class order implements Runnable{
	static int ticket=10000;
	int buy;
	Thread t;
	order(String machine)
	{
		buy=0;
		t=new Thread(this,machine);
		t.start();
	}
	
	public void run()
	{
		while(grabGold()==true)
		{
			buy=(int)(Math.random()*4);
			buy++;//各台機台買到多少票
		}
		System.out.println(t.getName()+"買到"+buy+"張票");
	}
	
	private synchronized static boolean grabGold()//在要動到錢的地方,加上synchronized,即可進行同步
	{
		if(ticket>0)
		{
			ticket--;
			return true;
		}
		else
		{
			return false;
		}
	}
}


public class Week3Q1 {
	public static void main(String[] args)
	{
		
		order th1=new order("機台A");
		order th2=new order("機台B");
		order th3=new order("機台C");
		order th4=new order("機台D");


	}

}
