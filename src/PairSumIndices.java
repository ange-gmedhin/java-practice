import java.util.Arrays;

public class PairSumIndices {
public static void main(String[] args){
    int[] numbers={2,11,7,15};
    int target=9;

    System.out.print(Arrays.toString(pairSum(numbers,target)));
}

static int[] pairSum(int[] numbers, int target){

for(int i=0;i<numbers.length;i++){
    for(int j=i+1; j<numbers.length;j++){
        if(numbers[i]+numbers[j]==target){
          return new int[] {i,j};
        }
    }
}
return null;
}
}
