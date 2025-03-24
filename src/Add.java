
public class Add {
    public static void main(String[] args){
        int[] numbers={};
        System.out.print(evenOddSubtraction(numbers));
    }

    static int evenOddSubtraction(int[] num){
        int evenNumber=0;
        int oddNumber=0;

        for(int i=0; i<num.length;i++){
            if(num[i]%2==0){
                evenNumber+=num[i];
            }
            else{
                oddNumber+=num[i];
            }
        }

        return oddNumber-evenNumber;
    }
}
