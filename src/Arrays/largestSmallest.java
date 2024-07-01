package Arrays;

public class largestSmallest {
    public static void main(String[] args) {
        int[] numbers = {12, 88, 37, 39, 27, 93, 63, 8, 100};
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Largest number " + largest);
        System.out.println("smallest number " + smallest);
    }
}
