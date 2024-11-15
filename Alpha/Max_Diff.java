import java.util.Scanner;

public class Max_Diff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int n = arr[i + 1] - arr[i];
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Maximum difference between consecutive elements: " + max);

        scanner.close();
        }
    }
}