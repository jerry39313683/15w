import java .util.Scanner;
public class M3Q27{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(long n){
        if(n<10){
            return 1;
        }
        else{
            return 1 + fun((long)n/10);
        }
    }
}
