package SoftwareEngg;


public class MergeSort {
	
	static void display(double arr[])
	{
		System.out.println("Stock prices in ascending order are :");
		for(int i= 0;i< arr.length;++i)
		{
			System.out.print(arr[i] + " ");
		}
	}

	void merge(double arr[],int left,int mid, int right)
	{
		int len1 = mid- left+1;
		int len2 = right -mid;
		double leftarr[] = new double[len1];
		double rightarr[] = new double[len2];
		
		for(int i=0;i<len1;i++)
		leftarr[i]=arr[left+i];

		
		for(int j=0;j<len2;j++)
		rightarr[j]=arr[mid+1+j];
		
		
		
		int i,j,k;
		i=0;
		j=0;
		k=left;
		
		while(i<len1 && j<len2)
		{
			if(leftarr[i]<= rightarr[j])
			{
				arr[k]= leftarr[i];
				i++;
			}
			else
			{
				arr[k] = rightarr[j];       
				j++;
			}
			k++;
		}
		
		while(i<len1)
			
		{
			arr[k]= leftarr[i];         
			i++;
			k++;
		}
		
		while(j<len2)
		{
			arr[k]= rightarr[j];
			j++;
			k++;
		}
		
	}
	

	
	public void mergeSort(double[] arr,int left, int right)
	{
		if(left<right) 
		{
		int mid = (left + right)/2;
	
		mergeSort(arr,left,mid);
		mergeSort(arr, mid+1, right);
		
		merge(arr, left,mid, right);
		}
	}
	
	static  void reverse(double arr[])
	{
		System.out.println("Stock prices in descending order are :");
		for(int k= arr.length-1;k>=0;k--)
		{
			System.out.print(arr[k] + " ");
		}
		
		
	
	}
	
/*

public static void main(String [] args)
{
	double arr[]  = {10.25,85.25,52.25};
	MergeSort ob = new MergeSort();
	
	ob.mergeSort(arr, 0, arr.length-1);
	
	display(arr);
	System.out.println();
	ob.reverse(arr);
	
	
}
	
*/

}
