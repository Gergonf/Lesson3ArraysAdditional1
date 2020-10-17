import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int mainarr[][]= new int[n][n];
        int j=0;

        for(int i=1; i<n*n; i+=n){
            int[] arr = new int[n];
            int c=0;
            for (int f=i; f<i+n; f++){
                arr[c]=f;
                c++;

            }
            mainarr[j]=arr;
            j++;
        }

        //for (int i=0; i<n; i++){
          //  for (int f=0; f<n; f++){
            //    System.out.print(mainarr[i][f]+" ");
            //}
            //System.out.println();
        //}
        //System.out.println();
        j=0;
        int mainarr2[][]= new int[n][n];
        for(int i=1; i<n+1; i++){
            int[] arr = new int[n];
            int c=0;
            for (int f=i; f<=n*n; f+=n){
                arr[c]=f;
                c++;

            }
            mainarr2[j]=arr;
            j++;
        }
        //for (int i=0; i<n; i++){
          //  for (int f=0; f<n; f++){
                //System.out.print(mainarr2[i][f]+" ");
           // }
            //System.out.println();
        //}
        for (int i=0; i<n; i++){
            for (int f=0; f<n; f++){
               if(mainarr[i][f]==mainarr2[i][f]){
                   System.out.print(mainarr[i][f]+" ");
               }
            }

        }

    }
}
