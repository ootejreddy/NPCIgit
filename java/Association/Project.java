package Association;

public class Project {
    int manager;
    int developer;
    long totalCost;
    int extras;
    long totalSalary;
    long profit;
    Employee m;
    Employee d;
    Project(long totalCost)
    {
        this.totalCost=totalCost;
        m=new Employee("Manager");
        d=new Employee("developer");
        extras= (int) ((totalCost*20)/100);

    }
    void addEmployee(String department)
    {
        if (department.equalsIgnoreCase("Manager")){
            if(manager!=0)
            {
                System.out.println("There can only be one manager please add a developer");
            }
            else{
                if((totalSalary+extras)<totalCost)
                {
                    manager++;
                }
            }
        }
        if (department.equalsIgnoreCase(("developer")) && ((totalSalary+extras)<totalCost))
        {
            developer++;
        }
        else
        {
            System.out.println("Too costly to add developer");
        }
    }
    long employeeCost()
    {
        totalSalary=manager*(m.getSalary())+developer*(d.getSalary());
        return totalSalary;
    }
    long profit()
    {
        return totalCost-(employeeCost()+extras);
    }
    void employeeDetails()
    {
        manager=1;
        long s=(totalCost-extras)-m.getSalary();
        developer= (int) ( s/d.getSalary());
        System.out.println("no of managers"+manager);
        System.out.println("no of developers"+developer);
    }
    void display()
    {
        employeeDetails();
        System.out.println("profit: "+profit());
        System.out.println("extras: "+extras);
    }

}