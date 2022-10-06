package Inheritance;

public class SuperVrblExmpl {
    int i=10;
}
class B extends SuperVrblExmpl{
    int i=20;
    void show(int i)
    {
        System.out.println(i);// this i will be from object B, we set i=30 in object B, so the value will be 30
        System.out.println(this.i); // this is belongs to instance variable from line no. 7. will be 20.
        System.out.println(super.i); // this is belongs to parent class SuperVrbExmpl , so the value will be 10.
    }
    public static void main(String [] ljlkj)
    {
        B ob = new B();
        ob.show(30);
    }
}