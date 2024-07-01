package Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {20, 16, 53, 29, 96, 37, 1};
        int i, j;
        System.out.print("array before sorting: ");
        for (i = 1; i < arr.length; i++) {
            System.out.print( arr[i] + " " );

        }
        System.out.println();
        int temp = 0;
        for (i = 1; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("array after sorting: ");
        for (i = 1; i < arr.length; i++) {
            System.out.print(   arr[i] +" " );

        }
    }
}
