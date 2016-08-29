import java.util.Arrays;

public class MergeSort implements Sorting {
	public void sort(int[] arr)
	{
		doMergeSort(arr,0,arr.length-1);
	}
	
	private void doMergeSort(int[] arr,int lowerIndex, int higherIndex) {
        
       if (lowerIndex < higherIndex) {
           int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
           // Below step sorts the left side of the array
           doMergeSort(arr,lowerIndex, middle);
           // Below step sorts the right side of the array
           doMergeSort(arr,middle + 1, higherIndex);
           // Now merge both sides
           merge(arr,lowerIndex, middle, higherIndex);
       }
   }
	
	void merge(int[] array, int lowerIndex,int middle, int higherIndex)
	{
		int[] tempMergArr = new int[array.length];
		for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
		System.out.println(Arrays.toString(array));
	}
	
	public String getName()
	{
		return "Mergesort";
	}

}
