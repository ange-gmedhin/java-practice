import java.util.Arrays;
import java.util.Scanner;
public class FibonacciSquence {
    public static void main(String[] args) {
        try (Scanner numbers = new Scanner(System.in)) {
            System.out.println("Enter the length of the sequence:");
            int length=numbers.nextInt();
            System.out.println(Arrays.toString(fibonacciSquence(length)));
        }
    }
    
    static int[] fibonacciSquence(int length){
        if (length < 2) {
            throw new IllegalArgumentException("Length must be at least 2");
        }
        int[] fibSequence = new int[length];
        fibSequence[0]=0;
        fibSequence[1]=1;
        for(int j=2;j<length;j++){
            fibSequence[j]=fibSequence[j-2]+fibSequence[j-1];
        }
        return fibSequence;
    }
}
