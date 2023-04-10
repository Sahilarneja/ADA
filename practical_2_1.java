public class practical_2_1 {
        void sorting(int arr[])
        {
            int n = arr.length;

            for (int i = 0; i < n-1; i++)
            {
                int min = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min])
                        min = j;

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

        public static void main(String args[])
        {
            practical_2_1 p = new practical_2_1();
            int arr[] = {15,17,10,12,20,9};
            System.out.println("Sorted array");
            p.printArray(arr);
        }

}
