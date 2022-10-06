package OopPrjct;

public class Employee {

    String name;
    int emp_id;

    Employee (String name, int emp_id) // This is the example of parameterized constructor.
    {
       this.name = name;
       this.emp_id = emp_id;
    }
    public static void main(String [] args)
    {
        Employee e1 = new Employee("Ferdous", 123906); // This is parameterized constructor, so, without any parameter it will show error,
        // we can provide the parameter name and emp_id.
        Employee e2 = new Employee("Ibrahim", 123837);

        System.out.println("Employee 1 :"+ e1.name + " "+ e1.emp_id);
        System.out.println("Employee 2 :"+ e2.name + " "+ e2.emp_id);
    }
}
