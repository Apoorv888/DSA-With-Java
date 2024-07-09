import java.util.Scanner;

public class ArrayBubbleSort {

    public static void bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
               int flag = 0;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag==0){
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter No of Elements in Array-->");
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();


        int arr[] = new int[n];
        System.out.println("Enter Array Elements-->");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

sc.close();
bubbleSort(arr);
System.out.print("Sorted Array: ");
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
    }
    
}
}
