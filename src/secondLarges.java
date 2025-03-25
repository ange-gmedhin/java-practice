public class secondLarges {
    public static void main(String[] args){
        int[] numbers={1,3,5,8,2,7};
        System.out.print("The second larges number is: "+checkSecondLarges(numbers));
    }

    static int checkSecondLarges(int[] numbers){
        int firstLargestNum=numbers[0];
        int secondLargestNum=0;

        for(int a:numbers){
            if(a>firstLargestNum){
                secondLargestNum=firstLargestNum;
                firstLargestNum=a;
            }
            if(a>secondLargestNum&&a<firstLargestNum){
                secondLargestNum=a;
            }
        }
        return secondLargestNum;
    }
    
}
