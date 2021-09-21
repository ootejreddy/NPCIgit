import java.util.*;

class assignment1{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int f=sc.nextInt();
        int s=sc.nextInt();

        if (( s%f==0) && (s== f*f) )
        {
            System.out.println(f+" is a multiple and square of "+s);
        }
        else if( s%f==0)
        {
            System.out.println(f+"is a multiple of "+s);

        }
        else if(s== f*f)
        {
            System.out.println(f+"is a square of "+s);
        }
        else{
            System.out.println(f+"is neither a multiple nor a square of "+s);
        }
    }
}