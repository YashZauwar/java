public class sonic
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
     void print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
   public static void main(String args[])
    {
        sonic ob = new sonic();
        int arr[] = {1, 7, 2, 8, 4, 0, 9};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.print(arr);
    }
}