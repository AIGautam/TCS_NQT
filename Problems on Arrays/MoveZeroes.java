public class MoveZeroes {
    public static void moveZeroesToEnd(int arr[]){
        int insertPos = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        while(insertPos < arr.length){
            arr[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,4,2,0,9,87,0};
        moveZeroesToEnd(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
