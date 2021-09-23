package InheritanceAssignment;

public class Features extends Car{
    int wheels;
    String gear;
    Features(int wheels,String gear)
    {
        this.wheels=wheels;
        this.gear=gear;
    }
    void add(int wheels)
    {
        wheels += this.wheels;
    }
    void changeGear(String gear)
    {
        gear=this.gear;
    }
    void get()
    {
        System.out.println("No.of wheels = "+wheels);
        System.out.println("type of gear = "+gear);
    }

}