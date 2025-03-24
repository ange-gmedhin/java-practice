public class CheckPrime{
    public static void main(String[] args){
        int[] numbers = {1, 2, 4, 9,15, 3, 5, 7, 11, 13, 17, 19, 23};

        printArray(checkPrime(numbers));
    }

    static int[] checkPrime(int[] num){
        int[] primeNumbers = new int[num.length];
        int index = 0;
        for(int a:num){
            if(isPrime(a)){
                primeNumbers[index] = a;
                index++;
            }
        }

        int[] result = new int[index];
        for(int i=0;i<index;i++){
            result[i]=primeNumbers[i];
        }

        return result;
    }

    static boolean isPrime(int num){
        if(num<2) return false;

        for(int i=2;i*i<=num;i++){
            if(num%i==0)return false;
        }

        return true;
    }

    static void printArray(int[] arr){
        if(arr==null){
            System.out.println("Array is empty");
            return;
        }
        if(arr.length==0){
            System.out.print("[]");
            return;
        }

        System.out.print("[");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }
}