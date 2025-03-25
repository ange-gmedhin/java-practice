public class Palindrome {
    public static void main(String[] args){
        String words="A man, a plan, a canal, Panama!";
        System.out.print(checkPalindrome(words));
    }

    static String checkPalindrome(String words){
        String cleanWords="";

        for(int i=0; i<words.length();i++){
            if(words.charAt(i)>='A'&&words.charAt(i)<='Z'){
                cleanWords+=(char)(words.charAt(i)+32);
            }
            else if(words.charAt(i)>='a'&&words.charAt(i)<='z'){
                cleanWords+=words.charAt(i);
            }
        }

        int left=0;
        int right=cleanWords.length()-1;

        if(cleanWords.charAt(left)!=cleanWords.charAt(right))
        return "Not a Palindrome";
        else
        left++;
        right--;


        return "palindrome";
    }
}
