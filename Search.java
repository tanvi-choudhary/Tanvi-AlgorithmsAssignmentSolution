package SoftwareEngg;

public class Search 
{

	public static int linear(boolean[] rose, boolean key )
	{
		int counter = 0;
			for(int j=0; j< rose.length ;j++)
			{
				if(rose[j] == key)
				{
					++counter;
				}
			}
		return counter;
			
	}
	
	public static double search(double[] stock_price,double key)
	{
			for(int j=0; j< stock_price.length ;j++)
			{
				if(stock_price[j] == key)
				{
					return stock_price[j];
				}
			}
			return 0;
			
	}

/*
	public static void main(String [] args)
	{
	boolean rose[] = {true, true, false, true};
	int po = linear(rose,true);
	System.out.println(po);
	
	double stock_price[] = {12.3,45.7,88.4};
	double pp = search(stock_price,66.8);
	
	System.out.println(pp);
	}
*/

}
