public class ArrayInsertionSort {

    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.print("Sorted Array:");
        for(int p=0;p<arr.length;p++)
        {
            System.out.print(" "+arr[p]);
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {14,53,2,55,89,1};

        insertionSort(arr);
    }
}

