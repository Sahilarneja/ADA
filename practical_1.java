class practical_1 {
    //iteratively
//    public static int factorial_iterator(int n){
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact=fact*i;
//        }
//        return fact;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Factorial of a number is:"+factorial_iterator(6));
//    }
//}
/*TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)
 */
    public static int fact(int n){
    if(n==0){
    return 1;
    }
    else {
        return n * fact(n - 1);
    }
    }

    public static void main(String[] args) {
        System.out.println("Factorial Recursively: "+fact(6));
    }
}
/*TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)
REASON: Due to the call stack
 */