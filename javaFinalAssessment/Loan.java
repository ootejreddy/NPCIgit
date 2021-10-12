import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.exit;

class Loan {
    LinkedList<Double> t1 = new LinkedList<>();
    ArrayList<Float> t2 = new ArrayList<>();
    ArrayList<Float> t3 = new ArrayList<>();
    float xi;
    float p1;
    int y;
    float p;
    public float amount1() {

        System.out.print("Enter Your Amount For Loan =");
        Scanner sc = new Scanner(System.in);

        return sc.nextFloat();

    }
    public float income() {

        System.out.print("Enter Your Mothly Income=");
        Scanner sc = new Scanner(System.in);
        p= sc.nextFloat();
        xi=p;
        float x8 = expense(p);
        xi = xi - x8;
        System.out.println("Remaning Income After Expense=" + xi);

        if(xi<=0)
        {
            System.out.print("Sorry ! Insufficient Balance");
            exit(1);
        }


        System.out.println("**************************************************");
        return xi;


    }


    public float expense(float x) {
        float x7 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 to fill your monthly expense details:=");
        int x1 = sc.nextInt();
        if (x1 == 7) {
            System.out.print("Enter the Fooding Expense=");
            int x2 = sc.nextInt();
            if(x2>x)
            {
                System.out.println("Sorry! You Dont Have Enough Balance ");
                exit(1);
            }
            t3.add((float) x2);
            System.out.print("Enter the Travelling Expense=");
            int x3 = sc.nextInt();
            if(x3>x)
            {
                System.out.println("Sorry! You Dont Have Enough Balance ");
                exit(1);
            }
            t3.add((float) x3);

            System.out.print("Enter the Accomodation Expense=");
            int x4 = sc.nextInt();
            if(x4>x)
            {
                System.out.println("Sorry! You Dont Have Enough Balance ");
                exit(1);
            }
            t3.add((float) x4);

            Float[] a2 = new Float[t3.size()];

            t3.toArray(a2);
            for (Float i : a2) {
                x7 = x7 + i;

            }
            System.out.println("******************************************************");
            System.out.print("Your Total Monthly Expense =" + x7 + "\n");
            System.out.println("******************************************************");
        }
        else{
            System.out.println("WRONG INPUT");
            System.exit(0);
        }
        return x7;
    }
    public int Loan1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to see the types of loan available");


        int c = sc.nextInt();
        if (c == 1) {
            LinkedList<String> l = new LinkedList<>();
            l.add("HOME LOAN");
            l.add("CAR LOAN");
            System.out.println(l);
            System.out.println("***************************************************************");

        }

        System.out.println("Choose the type of loan from the following");
        System.out.println("Press 1 To Calculate Lac Per EMI  ");
        System.out.print("Enter :");
        return sc.nextInt();
    }
    public float choose() {
        System.out.println("Enter The Interest At Which PER LAC EMI Is To Be Calculated");
        Scanner sc=new Scanner(System.in);
        return sc.nextFloat();
    }
    public int print()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to see the types of loan available");
        int c = sc.nextInt();
        if (c == 1) {
            LinkedList<String> l = new LinkedList<>();
            l.add("HOME LOAN");
            l.add("CAR LOAN");

            System.out.println(l);
            System.out.println("********************************************************");
        }

        System.out.println("Choose the type of loan from the following");
        System.out.println("Press 1 for HOME LOAN");
        System.out.println("Press 2 for CAR LOAN");
        System.out.print("Enter :");
        return sc.nextInt();
    }
    public int choose1() {
        int t = print();
        int x = 0;
        if (t == 1) {
            System.out.print("The Intrest Rate Is ");
            x = 6;
            System.out.println(x);
        } else if (t == 2) {
            System.out.print("The Intrest Rate Is ");
            x = 7;
            System.out.println(x);
        }
        else {
            System.out.println("Sorry you have not enter any number");
            exit(1);

        }
        return x;
    }
    public int year() {

        System.out.print("Enter The Years Of Loan =");
        Scanner sc = new Scanner(System.in);

        y=sc.nextInt();
        return y;
    }
    public int year1() {
        System.out.print("Enter The Years Of Loan =");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public float PLE()
    {
        float y8= 0.0F;
        try {
            System.out.println("LAC PER EMI IS CALCULATED ON 1 LAC");
            System.out.println("***********************************************");
            float r = choose();
            int y = year();
            float r1 = r / (12 * 100);
            int y1 = y * 12;
            int m = 100000;
            y8 = (float) ((m * r1 * Math.pow(1 + r1, y1)) / (Math.pow(1 + r1, y1) - 1));
            System.out.println("LAC PER EMI =" + y8);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return y8;
    }
    public float amount() {
        double x2= 0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Total Number  Of The Existing EMI :: ");
        int size = sc.nextInt();
        System.out.println("************************************************");
        Float myArray[] = new Float[size];
        System.out.println("Enter The Value Of EMI : ");
        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextFloat();
        }
        ArrayList<Float> t4 = new ArrayList<Float>(Arrays.asList(myArray));
        for (Float i : myArray) {
            x2 = x2 + i;
        }
        System.out.println("***************************************************");
        myArray = t4.toArray(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("Your Total EMI is="+x2);

        float y8=PLE();
        float xi=income();
        System.out.print(xi);
        float c1= (float) (((xi*0.5)-x2)/y8);
        p1=c1*100000;
        System.out.println("You Are Eligible To Take Loan Upto The Amount="+p1);
        return p1;
    }
}
class Execute extends Loan{
    Loan obj1=new Loan();
    float c=obj1.amount();
    public void  emi_calculator() {
        double x=0.0 ;
        double x1=0.0;
        double emi ;
        try {
            float r2 = obj1.choose1();
            float p2=obj1.amount1();
            int y2=obj1.year1();
            r2 = r2 / (12 * 100);
            y2 = y2 * 12;
            emi = (p2 * r2 * Math.pow(1 + r2, y2)) / (Math.pow(1 + r2, y2) - 1);
            obj1.p *= 0.3;
            if (emi <= obj1.p) {

                System.out.println("***********************************************");

                t1.add(emi);
                Scanner sc=new Scanner(System.in);
                int q;

                t2.add(p2);

                System.out.println("Your Current Issued Loan is = " + t2 + "\n");
                System.out.println("**************************************************");
                System.out.print("Enter 2 to see your EMI based on Loan:");
                q=sc.nextInt();
                if(q==2) {
                    System.out.println("You Current EMI Based On Loan is =" +" "+emi+"\n");
                    System.out.println("Your Total EMI is= " + t1 + "\n");
                }
                else{
                    System.exit(0);
                }

                System.out.println("***************************************************");
                List<Double> U = new ArrayList<>(t1);


                Double[] a = new Double[U.size()];
                U.toArray(a);

                List<Float> U1 = new ArrayList<>(t2);


                Float[] a1 = new Float[U1.size()];

                U1.toArray(a1);



                for (Double i : a) {
                    x = x + i;
                }
                for (Float i : a1) {
                    x1 = x1 + i;
                }
                System.out.print("TOTAL LOAN ="+x1+"\n");

                System.out.println("Enter 9 to take more Loan ");
                System.out.print("Enter 10 to exit\n");
                System.out.print("Enter =");
                int v = sc.nextInt();
                if (v == 9) {


                    if (x <= obj1.p) {
                        emi_calculator();
                    } else {
                        System.out.println("Sorry you are exceeding the 30 percent of your income hence no  loan is allowed");
                        System.out.print("The loan issued to you on the basis of your income ===>\n" + t2);

                    }
                } else {
                    System.out.print("EXIT \n");
                    System.out.print("LOAN ISSUED ="+t2+"\n");
                    System.out.print("Thank You!");
                }

            } else {
                System.out.println("Sorry you are exceeding the 30 percent of your income hence no more loan is allowed");

            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }


}
class Test {
    public static void main(String[] args) {


        System.out.println("MENU:");
        System.out.println("***************************************************");
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose 1 To Find Loan");
        System.out.println("Choose 3 To Exit");
        System.out.println("*************************************************");
        System.out.print("Enter:=");
        int x = sc.nextInt();

        if (x == 1) {
            Execute t1 = new Execute();
            t1.emi_calculator();
        } else if (x == 3) {
            char ch1 = 'Y';
            char ch2 = 'N';
            System.out.println("Are You Sure You Want TO EXIT");
            System.out.println("Press Y For Yes");
            System.out.println("Press N For No");
            System.out.print("Enter:=");
            char y = sc.next().charAt(0);
            char ch = Character.toUpperCase(y);
            if (ch == ch1) {
                System.exit(0);
            } else if (ch == ch2) {
                Execute t1 = new Execute();
                t1.emi_calculator();
            }
        }
    }
}

