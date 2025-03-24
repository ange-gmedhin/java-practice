public class Poe {
    public static void main(String[] args){
        int[] numbers = {1, 8, 3, 7, 10, 2};

        System.out.print(checkPoe(numbers));
    }

    static int checkPoe(int[] num){
        if(num.length<3) return -1;

        int i=0;
        int j=num.length-1;
        int idx=1;
        int leftSum=num[i];
        int rightSum=num[j];

        for(int k=1; k<num.length-2;k++){
            if(leftSum<rightSum){
                i++;
                leftSum+=num[i];
                idx=i+1;
            }else{
                j--;
                rightSum+=num[j];
                idx=j-1;
            }
        }

        if(leftSum==rightSum)
        return idx;
        else
        return -1;

    }
    
}
