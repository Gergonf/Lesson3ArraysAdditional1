import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int proiz=1;
        for(int i=1; i<n+1;i++){
            proiz*=i;
        }
        System.out.println(proiz);
    }
}
