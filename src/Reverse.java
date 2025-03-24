public class Reverse {
    public static void main(String[] args){
        int numbers=12345;
        System.out.print(revese(numbers));
    }

    static int revese(int a){
        int reverse=0;
        while(a!=0){

            int reminder=a%10;
            reverse=reverse*10+reminder;
            a=a/10;
        }

        return reverse;
    }
    
}
