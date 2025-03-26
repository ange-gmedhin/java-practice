public class FactorialByRecursion {
    public static void main(String[] args){
        int number=5;
        System.out.print(factorial(number));
    }

    static int factorial(int n){
        if(n==0||n==1) return 1;

        return n*factorial(n-1);
    }
//effective way 

    // static int factorial(int n){
    //     int result=n;

    //     for(int i=n-1; i>=1;i--){
    //         result*=i;

    //     }
    //     return result;
    // }

    // static int factorial(int n) {
    //     int result = 1;
    //     for (int i = 2; i <= n; i++) {
    //         result *= i;
    //     }
    //     return result;
    // }
}
