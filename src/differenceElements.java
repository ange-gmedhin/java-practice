import java.util.Arrays;
public class differenceElements {
    public static void main(String[] args){
        int[] num1={1,2,3,4,5};
        int[] num2={1,7,3,4,6};

        System.out.print(Arrays.toString(checkDifference(num1,num2)));
    }

    static int[] checkDifference(int[] num1, int[] num2){
        int[] tempStore=new int[num1.length];
        int k=0;
        for(int i=0;i<num1.length;i++){
            boolean found=false;
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                tempStore[k]=num1[i];
                k++;
            }
        }

        for(int i=0;i<num1.length;i++){
            boolean found=false;
            for(int j=0;j<num2.length;j++){
                if(num2[i]==num1[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                tempStore[k]=num2[i];
                k++;
            }
        }

        int[] finalResult=new int[k];
        for(int t=0;t<k;t++)
        finalResult[t]=tempStore[t];

        return finalResult;
    }
}
