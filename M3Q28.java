import java .util.Scanner;
public class M3Q28{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int q = scn.nextInt();
        System.out.println(fun(p,q));
    }
    public static int fun(int p ,int q){
        int x =Math.max(p,q);
        int y =Math.min(p,q);
        if(x%y==0){
            return y;
        }
        else{
            return fun(y,x%y);
        }
    }
}
