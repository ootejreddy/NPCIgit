package InheritanceAssignment;

public class calculateCost extends Features{
    double costW,costG;
    String model;
    CalculateCost(String model,int wheels,String gear)
    {
        super(wheels,gear);
        this.model=model;

    }

    double calCostG()
    {
        if(gear.equalsIgnoreCase("Manual"))
        {
            costG=30000.50;
        }
        else if(gear.equalsIgnoreCase("Automatic"))
        {
            costG=50000.50;
        }
        return costG;
    }
    double calCostW()
    {
        if (model.equalsIgnoreCase("Bentley"))
        {
            costW=wheels*30000.00;
        }
        else
        {
            costW=wheels*10000.00;
        }
        return costW;
    }
    void get()
    {
        super.get();
        System.out.println("Cost of wheels: "+calCostW());
        System.out.println("Cost of gear: "+calCostG());
    }
}
