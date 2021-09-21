import java.util.*;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int c=0;
        //int t= Integer.parseInt(n);
        double t1= Double.parseDouble(n);
        int t=(int)t1;
        if(String.valueOf(t).equals(n))
        {
            if (t>=Byte.MIN_VALUE && t<=Byte.MAX_VALUE)
            {
                c=c+1;
                System.out.print("Byte ");
            }
            if(t>=Short.MIN_VALUE && t<=Short.MAX_VALUE)
            {
                c=c+2;
                System.out.print("Short ");

            }
            if(t>=Integer.MIN_VALUE && t<=Integer.MAX_VALUE)
            {
                c=c+3;
                System.out.print("Int ");

            }
            System.out.println("");
            if(c==6)
            {
                System.out.print("Recommended:  Byte");

            }
            else if(c==5)
            {
                System.out.print("Recommended:  short");
            }
            else
            {
                System.out.print("Recommended:  int");
            }

        }
        else // decimal no.
        {
            if (t1>=Float.MIN_VALUE && t1<=Float.MAX_VALUE)
            {
                c=c+1;
            }
            if(t1>=Double.MIN_VALUE && t1<=Double.MAX_VALUE)
            {
                c=c+2;
            }
            System.out.println("");
            if(c==3)
            {
                System.out.print("Recommended:  float");

            }
            else
            {
                System.out.print("Recommended:  double");
            }


        }
    }
}