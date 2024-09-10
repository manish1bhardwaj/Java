import java.util.Scanner;
public class Arraytest2 {
    public static void main(String[] args) {
        int list[] = new int[5];
        Scanner sc = new Scanner(System.in);{
        System.out.println("enter 5 element in array : ");
        for(int x=0;x<list.length;x++){
            list[x]=sc.nextInt();

        }
        System.out.println("Array elements :");
        for(int v : list){
            System.out.print(v+" ");
        }

        System.out.println("\nArray element in reverse :");
        for(int x=list.length-1;x>=0;x--)
            list[x]=sc.nextInt();
        
        System.out.println("Array elements :");
        for(int v : list){
            System.out.print(v+" ");
            }
       sc.close(); 
    }
    
}
}
