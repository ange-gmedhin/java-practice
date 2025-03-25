public class ReverseString {
    public static void main(String[] args){
        String word="Hello";
        System.out.println(reverse(word));
    }

    static String reverse(String word){
        String reversed="";
        for(int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
        }
        return reversed;
    }
    
}
