import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n-1];
        for (int i = 0; i < n-1; i++){
            int x=in.nextInt();
            arr[i]=x;
        }
        for (int i = 1; i <= n; i++){
            boolean check = true;
            for (int f =0;f<n-1; f++){
                if (i==arr[f]){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println(i);
                break;
            }
        }
    }
}
