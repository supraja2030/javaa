package Arrays;

public class sumOfNumbers {
    public static void main(String[] args) {
        int[] arr = {12,55,38,94,89,63};
        int sum = 0;
        for(int numbers : arr){
            sum = sum + numbers;
        }
        System.out.println(sum);
    }
}
