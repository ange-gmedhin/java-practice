import java.util.Arrays;
public class ElementWiseArray {
    public static void main(String[] args){
        int[] first={1,3,5};
        int[] second={5,7,9,7};

        System.out.print(Arrays.toString(elementWise(first,second)));
    }

    static int[] elementWise(int[] num1, int[] num2){
        if(num1.length!=num2.length)return new int[0];
        int i=0;
        int[] newNumber=new int[num1.length];
        int k=0;

        while(i<num1.length){
            newNumber[k]=num1[i]+num2[i];
            k++;
            i++;
        }
        return newNumber;
    }
    
}
