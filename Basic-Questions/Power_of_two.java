import java.util.*;
public class Power_of_two {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);{
            int n = sc.nextInt();
            if(n<1){
                System.out.println(true);
            }
            else if(n==1){
                System.out.println(true);
            }
            else{
                while(n%2==0){
                    n/=2;
                }
                if(n==1){
                    System.out.println(true);
                }
                else{
                    System.out.println(false);
                }
            }
            sc.close();
        }

    }
    
}
