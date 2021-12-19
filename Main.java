package SoftwareEngg;

import java.util.Scanner;

public class Main 
{

	static MergeSort mergeSort = new MergeSort();
	static Search search = new Search();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of companies");
		int comp = sc.nextInt();
		int[] array = new int[comp];
		
		double[] stock_price = new double[array.length];
		boolean[] rose = new boolean[array.length];
					
		for(int i = 0;i< (array.length); i++) 
		{
			int j = i+1;
			System.out.println("Enter current stock price of the company "+ j);
			stock_price[i] = sc.nextDouble();
			
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			rose[i] = sc.nextBoolean();
		}
		
		MergeSort ob = new MergeSort();
		ob.mergeSort(stock_price, 0, stock_price.length-1);
		
		boolean flag = true;
		while (flag) 
		{
			System.out.println();
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1.Display the companies stock prices in ascending order \n"
					+ "2.Display the companies stock prices in descending order \n"
					+ "3.Display the total no of companies for which stock prices rose today \n"
					+ "4.Display the total no of companies for which stock prices declined today \n"
					+ "5.Search a specific stock price \n"
					+ "6.press 0 to exit");
			int choice = sc.nextInt();
			
			switch(choice) 
			{
			   
				case 0:
					System.out.println("Exited successfully");
					flag = false;
					break;
				
				case 1: 
					MergeSort.display(stock_price);
					break;
		
				case 2:
					MergeSort.reverse(stock_price);
					break;
								
				case 3:
					int po = Search.linear(rose,true);
					System.out.println("Total no of companies whose stock price rose today : "+po);
					break;
					
				case 4:
					int pi = Search.linear(rose,false);
					System.out.println("Total no of companies whose stock price declined today : "+pi);
					break;
					
				case 5:
					System.out.println("enter the key value");
					double key = sc.nextDouble();
					
					double pp = Search.search(stock_price,key);
			        if(pp == 0.0)
			        {
			        	System.out.println("Value not found");
			        }
			        else
			        {
			        	System.out.println("Stock of value "+pp+ " is present");
			        }
			        break;
			     
			
			}
			
		}	
		sc.close();
		
	}

}
