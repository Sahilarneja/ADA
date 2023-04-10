public class practical_2 {
    void insertion(int a[])
        {
            int i, j, temp;
            int n = a.length;
            for (i = 1; i < n; i++) {
                temp = a[i];
                j = i - 1;

                while(j>=0 && temp <= a[j])
                {
                    a[j+1] = a[j];
                    j = j-1;
                }
                a[j+1] = temp;
            }
        }
        void printArr(int a[])
        {
            int i;
            int n = a.length;
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");
        }

        public static void main(String[] args) {
            int a[] = { 60,40,20,10};
            practical_2 x = new practical_2();
            System.out.println("Before sorting array elements are - ");
            x.printArr(a);
            x.insertion(a);
            System.out.println();
            System.out.println();
            System.out.println("After sorting array elements are - ");
            x.printArr(a);
            System.out.println();
        }
    }

