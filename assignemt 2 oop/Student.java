public class Student extends Person
{
    private String status;
    public Student(String n, String a, int p, String e,String s)
    {
        super(n, a, p, e);
        status=s;
    }

    @Override
    public String toString() {
        return "Student,"+ getName();
    }
}