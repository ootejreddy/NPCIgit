package Association;

public class Main {
    public static void main(String[] args) {
        Project project = new Project(9000000);
        project.display();
        project.addEmployee("manager");
        project.addEmployee("developer");
        project.display();

    }
}