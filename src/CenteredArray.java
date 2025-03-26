import java.util.Scanner;
public class CenteredArray {
    public static void main(String[] args){
        try(Scanner scanner=new Scanner(System.in)){
            System.out.print("Enter the size of the array ");
            int size=scanner.nextInt();
            int[] arr=new int[size];

            System.out.println("Enter elemnts of the array : ");
            for(int i=0; i<size;i++){
                arr[i]=scanner.nextInt();
            }
            int result=checkIfCenter(arr);
        System.out.print(result);
        }
    }

    static int checkIfCenter(int[] num){
        if(num.length%2==0){
            return 0;
        }

        int center=num.length/2;
        int centerNumber=num[center];

        for(int a:num)
        if(a!=centerNumber&&a<centerNumber){
            return 0;
        }
        return 1;

    }
    
}
