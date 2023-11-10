package Recursia;

public class Zadanie3 {
    public static int vivod(int a,int b){
        if(a<b){
            System.out.println(b);
            return vivod(a,b-1);

        } else if(a==b){
            System.out.println(a);
            return 0;
        }
        else{
            System.out.println(a);
            return vivod(a-1,b);
        }
    }
    public static void main(String[] args){
        vivod(10,15);
    }
}
