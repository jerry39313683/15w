import java .util.Scanner;
public class M3Q6{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        for(int i = 0 ;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}
