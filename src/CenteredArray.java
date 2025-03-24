public class CenteredArray {
    public static void main(String[] args){
        int[] numbers={0, 2, 1, 4, 5};
        System.out.print(checkIfCenter(numbers));
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
