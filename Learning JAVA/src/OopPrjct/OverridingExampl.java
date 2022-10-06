package OopPrjct;
/*
Method Overriding :



 */
public class OverridingExampl
{
    void show()
    {
        System.out.println("1");
    }

}
class A extends OverridingExampl
{
    void show()
    {
        System.out.println("2");
    }

    public static void main(String [] args)
    {
        A ob1 = new A();
        ob1.show();
        //ob2.show();
        OverridingExampl ob2 = new OverridingExampl();
        ob2.show();
    }
}