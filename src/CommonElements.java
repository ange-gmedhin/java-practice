public class CommonElements {
    public static void main(String[] args){
        int[] first={1, 8, 3, 2};
        int[] second={4, 2, 6, 1};

       printArray(common(first, second));
    }

    static int[] common(int[] first, int[] second){
        if(first==null || second==null)return null;

        if(first.length==0|| second.length==0)return new int[0];

        int[] newCommon=new int[first.length];
        int c=0;

        for(int i=0;i<first.length;i++){
            for(int j=0;j<second.length;j++){
                if(first[i]==second[j]){
                    newCommon[c]=first[i];
                    c++;
                }
            }
        }

        int[] finnalCommon=new int[c];
        for(int i=0,j=0; i<c;i++,j++){
            finnalCommon[i]=newCommon[j];
        }

        return finnalCommon;
    }

    static void printArray(int[] arr){
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
