import java.util.Scanner;
public class AddingByRecursion{
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Enter any number : ");
        int number=scanner.nextInt();

        int result = sumNum(number);
        System.out.print(result);
        }
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