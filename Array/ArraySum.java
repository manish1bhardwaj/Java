import java.util.Scanner;
public class ArraySum {
public static void main(String[] args) {
        int list[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);{
        System.out.println("enter 5 element in array : ");
        for(int x=0;x<list.length;x++){
            list[x]=sc.nextInt();

        }
        System.out.println("Array elements :");
        for(int v : list){
            System.out.print(v+" ");
            sum=sum+v;
        }
        System.out.println("\nSum of all element : "+sum);
       sc.close(); 
    }
    
}
}

    

