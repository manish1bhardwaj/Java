import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element " + i + ":");
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Array Elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ":" + arr[i]);
            }
        }
    }
}
