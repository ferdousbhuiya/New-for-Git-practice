package OopPrjct;

/*
What is Encapsulation:
Ans. Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.

Steps to achieve encapsulation:
1. Declare all the variables of a class as private.
2. Provide public setter and getter methods to modify and view the variable values.
 */

public class EncapsulationExmpl {

}
class Employee1
{
    private int empid;
    public void setEmpid (int eid) // uses the setter and getter method to hide data
    {
        empid= eid; // initiate the data of method.
    }

    public int getEmpid() {
        return empid;
    }


}
class Company
{
    public static void main(String [] args)
    {
        Employee1 e = new Employee1();
        e.setEmpid(101);// set the value to that method.
        System.out.println(e.getEmpid()); // calling method inside the print command.
    }
}