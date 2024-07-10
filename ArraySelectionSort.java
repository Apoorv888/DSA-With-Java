public class ArraySelectionSort {
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {   
            int small = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[small])
                {
                    small = j;
                }
            }
            if(small!=i)
            {
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
            }

        }
        System.out.print("Sorted Array-->");
        for(int p=0;p<arr.length;p++)
        {
            System.out.print(arr[p] + " ");
        }

    }
    public static void main(String[] args) {
        
       int arr[] = {1,16,54,23,18};
       selectionSort(arr);


    }
}
