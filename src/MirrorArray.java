public class MirrorArray {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 3, 2, 1};  // Example input

        System.out.println(isMirrorArray(numbers));  // Expected output: 1
    }

    static int isMirrorArray(int[] num){
        if (num == null || num.length == 0) return 0; // Handle empty array case

        int i = 0, j = num.length - 1;
        
        while (i < j) {  // Loop until pointers meet in the middle
            if (num[i] != num[j]) {
                return 0;
            }
            i++;
            j--;
        }
        return 1; // If all elements match, return 1
    }
}
