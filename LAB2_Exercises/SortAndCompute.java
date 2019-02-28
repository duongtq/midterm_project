package sort_and_compute;

public class SortAndCompute
{
	public static void Sort(int arr[])
	{
		int i, j;
		int min;
		
		for ( i = 0; i < arr.length - 1; i++ )
		{
			min = i;
			for ( j = i + 1; j < arr.length; j++ )
			{
				if ( arr[i] > arr[j] )
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i]   = temp;
		}
	}
	
	public static void Calculate(int arr[])
	{
		int sum = 0;
		float average = 0;
		
		for ( int i = 0; i < arr.length; i++ )
		{
			sum+= arr[i];
		}
		
		average = (float)(sum) / arr.length;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
	
	public static void printArray(int arr[])
	{
		for ( int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {30, 1, 5, 8, 7};
		
		Sort(arr);
		
		printArray(arr);
		
		Calculate(arr);
	}

}
