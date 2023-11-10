package Recursia;
import java.util.Scanner;
public class Zadanie2 {
    public static int vivod(int n, int n1){
        if(n1==0){
            System.out.println(n-n1);
            return 0;
        }
        else{
            System.out.println(n-n1);
            return vivod(n, n1-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        while (!sc.hasNextInt()) {
            System.out.print("Введите заново: ");
            sc.nextLine();
        }
        int n = sc.nextInt();
        vivod(n,n-1);
    }
}
