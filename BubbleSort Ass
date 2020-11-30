class BubbleSort
{
	
	static void sort(int ar[])
	{
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				if(ar[i]>ar[j])
				{
				 temp=ar[i];
				 ar[i]=ar[j];
				 ar[j]=temp;
				 
				}
			}
		}
			for(int j=0;j<ar.length;j++)
			{
			System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	      
	static void insertionSort(int a[])
	{
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp = a[i];
			j = i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	static int QuickSort(int a[])
	{
		int leng=a.length;
		
		 int partition(int []arr,int low,int high)
		{
			int pivot=arr[(low+high)/2];
			while(low<=high)
			{
				while(arr[low]<pivot)
				{
					low++;
				}
				while(arr[high]>pivot)
				{
					high--;
				}
				if(low<= high)
				{
					int temp=arr[low];
					arr[low]=arr[high];
					arr[high]=temp;
					low++;
					high--;
				}
				return low;
			}
		}    
	}
	void QuickSortRecursion(int []arr,int low,int high)
	{    QuickSort qs=new QuickSort();
		int pi=qs.partition(arr,low,high);
		if(low<pi-1)
		{
			QuickSortRecursion(arr,low,pi-1);	
		}
		if(pi<high)
		{
			QuickSortRecursion(arr,pi,high);	
		}
	}
	void print(int arr[])
	{
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}
		
	
	public static void main(String [] args)
	{
		int arr[]= {23,12,45,23,32,21,56,};
		BubbleSort.sort(arr);
		int ar[]= {23,12,45,32,21,56,12};
		BubbleSort.insertionSort(ar);
		int ad[]= {15,9,7,13,12,16,4,18,11};
		BubbleSort.QuickSort(ad);
		 
	}
}