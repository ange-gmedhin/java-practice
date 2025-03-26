import java.util.Scanner;
public class Add {
    public static void main(String[] args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Enter size of the array : ");
            int size=scanner.nextInt();

            int[] arr=new int[size];
            System.out.println("Enter elements of the arrayy");
            for(int i=0;i<size;i++){
                arr[i]=scanner.nextInt();
            }

            int result=evenOddSubtraction(arr);
            System.out.println("Final result is : "+result);
        }
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
