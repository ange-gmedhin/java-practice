import java.util.Arrays;
public class CheckLetters{
    public static void main(String[] args){
        char[] letters={'a', 'b', 'c', 'd'};
        int start=2;
        int length=5;

        char[] result=(checkLetters(letters, start, length));

        if(result==null){
            System.out.print("null");
        }else{
           printArrayy(result);
        }
    }

    static char[] checkLetters(char[] letters, int start, int length){
        if(start<0||length<0||start+length>letters.length) return null;

        char[] newLetters=new char[length];

        for(int i=start,k=0;i<start+length;i++,k++){
            newLetters[k]=letters[i];
        }
        return newLetters;
    }
    static void printArrayy(char[] arr){
        if(arr==null){
            System.out.print("null");
            return;
        }
        if(arr.length==0){
            System.out.print("[]");
            return;
        }

        System.out.print("[");

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }

        System.out.print("]");

    }
}