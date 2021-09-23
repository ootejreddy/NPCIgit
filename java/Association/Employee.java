package Association;

public class Employee {
    String department;
    long salary;
    //Double perks;
    Employee(String department)
    {
        //this.level=level;
        this.department=department;
    }
    void setSalary()
    {
        if(department.equalsIgnoreCase("manager"))
        {
            salary=1000000;
        }
        else
        {
            salary=600000;
        }

    }
    long getSalary()
    {
        setSalary();
        return salary;
    }

}