
public class BubbleSort implements Sorting{
	public void sort(int arr[])
	{
		for(int i = arr.length-1;i>=0;i--)
		{
			for(int j = 0;j<i;j++)
			{

				if(arr[j] > arr[j+1])
				{
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}	
			}	
		}	
	}
	
	public String getName()
	{
		return "Bubble Sort";
	}
}
