import java.util.ArrayList;
import java.util.Arrays;

public class SortingAlgos {
	public static boolean isSorted(int[] a){    

	    if(a == null) {
	        return false;
	    }
	    else if(a.length == 0) {
	        return true;
	    }
	    for (int i = 0; i < a.length-1; i++) {
	        if(a[i] > a[i+1]) {
	            return false;
	        }           
	    }
	    return true;
	}

	public static void main(String args[])
	{
		System.out.println("Beginning to fill array");
		int numbers = 6;
		int[] arr = new int[numbers];
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*10000)%numbers;
		}	
		ArrayList<Sorting> algos = new ArrayList<Sorting>();
		algos.add(new BubbleSort());
		algos.add(new MergeSort());
		for(Sorting algo:algos)
		{
			int[] tmp = new int[arr.length];
			System.arraycopy( arr, 0, tmp, 0, arr.length );
			System.out.println(Arrays.toString(tmp));

			algo.sort(tmp);
			System.out.println(Arrays.toString(tmp));
			if(!isSorted(tmp))
			{
				System.out.println(algo.getName()+" doesn't seem to work!");
			}	
			

		}	
		
	}
}
