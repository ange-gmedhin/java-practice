import java.util.Arrays;
public class LeftRotation {
    public static void main(String[] args){
        int[] numbers={10,20,30,40};
        System.out.print(Arrays.toString(leftRotation(numbers)));
    }

    static int[] leftRotation(int[] numbers){
        int[] leftShifted=new int[numbers.length];

        for(int i=1;i<numbers.length;i++){
            leftShifted[i-1]=numbers[i];
        }
        leftShifted[numbers.length-1]=numbers[0];
        
        return leftShifted;
    }
}
