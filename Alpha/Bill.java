import java.util.Scanner;
public class Bill {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);{
            int Pencil = sc.nextInt();
            int Pen = sc.nextInt();
            int Eraser = sc.nextInt();
            int Total = Pencil + Pen + Eraser;
            System.out.println(Total);
            int new_total = (int) (Total + (0.18f*Total));
            System.out.println(new_total);
            sc.close();

        }
    }
    
}
