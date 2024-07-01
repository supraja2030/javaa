package Arrays;

public class binarySearch {
    public static int searchBinary(int[] array, int key){
        int low = 0;
        int high= array.length- 1 ;
        int mid = 0;
        while(low <= high){
            mid = low+ (high - low) /2;
            if(key == array[mid]){
                return mid;
            }
            else if(key <= array[mid]){
                high = mid - 1;
                low = low ;

            }else{
                low = mid + 1;
                high = high;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {12,17,28,34,39,42,47,52,59,67,69,75,79,85,99};
        int key = 39;
        System.out.println(searchBinary(array, key));
    }

}


