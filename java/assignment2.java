import java.util.*;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int l=n.length();
        if (l%2==0){
            System.out.println(l+","+l*l);
        }
        else if (l%3==0)
        {
            System.out.println(l+","+l*l*l);
        }
        else if(l==1)
        {
            System.out.println("1");
        }
        else
        {
            int l1=l;
            while(!( l%2==0 || l%3 ==0))
            {
                l--;
            }
            if (l%2==0){
                System.out.println(l1+"["+l+"]"+","+l*l);
            }
            else if (l%3==0)
            {
                System.out.println(l1+"["+l+"]"+","+l*l*l);
            }
        }


    }
}