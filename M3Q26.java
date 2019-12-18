import java.util.Scanner;
public class M3Q26{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(a,n));
    }
    public static long power(int a , int n){
        if(n==1){
            return a;
        }
        else{
            return a*power(a,n-1);
        }
    }
}
