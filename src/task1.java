import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n>0){
            System.out.print(n%2+"");
            n/=2;
        }

    }
}
