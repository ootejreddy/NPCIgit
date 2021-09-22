import java.util.Scanner;

public class Tower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[n][n];
        int sum=1;
        for (int i = 0; i < arr.length; i++) {

            int sum1=0;
            for (int j = 0; j < arr[0].length; j++) {

                if(j== (int)i/2) {
                    for (int k = i + 1; k > 0; k--) {
                        System.out.print(sum);
                        sum1 = sum1 + sum;
                    }
                }


            }
            System.out.println("");
            sum=sum+sum1;
        }

    }
}