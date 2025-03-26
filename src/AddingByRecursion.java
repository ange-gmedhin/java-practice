public class AddingByRecursion{
    public static void main(String[] args) {
        int number=5;
        System.out.print(sumNum(number));
    }

    //using recursion
    static int sumNum(int n){
        if(n==0){
            return 0;
        }

        return n+sumNum(n-1);
    }
//effective
    // static int sumNum(int n){
    //     return (n*(n+1))/2;
    // }
}