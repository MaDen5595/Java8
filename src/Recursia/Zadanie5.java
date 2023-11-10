package Recursia;
import java.util.Scanner;
public class Zadanie5 {
    public static int summa(int N, int lenN, int summ){
        if(lenN == 0){
            return summ+N;
        }
        else{
            int ten = (int) Math.pow(10,lenN);
            int buf = N/ten;
            return summa(N-buf*ten,lenN-1,summ+buf);

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        while (!sc.hasNextInt()) {
            System.out.print("Введите заново: ");
            sc.nextLine();
        }
        int N = sc.nextInt();
        System.out.println(summa(N,String.valueOf(N).length()-1,0));
    }
}
