import java.util.Scanner;

public class practical_1_2 {

//    public static void main(String[] args) {
//        int n1=0;
//        int n2=1;
//        int c=0;
//        for(int i=0;i<10;i++){
//            c=n1+n2;
//            System.out.println(c);
//            n1=n2;
//            n2=c;
//        }
//    }

//TIME COMPLEXITY: O(N)
//SPACE COMPLEXITY: O(1)
    public static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        int n=10;
        for(int i=2;i<=n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}