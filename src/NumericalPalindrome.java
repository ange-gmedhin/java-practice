public class NumericalPalindrome {
    public static void main(String[] args){
        int numbers=12321;
        System.out.print(checkPalindrome(numbers));
    } 

    static int checkPalindrome(int num){
        int reverseNumber=0;
        int temp=num;

        while(temp!=0){
            int reminder=temp%10;
            reverseNumber=reverseNumber*10+reminder;
            temp=temp/10;
        }

        if(reverseNumber!=num){
            return 0;
        }
        return 1;
    }
}
