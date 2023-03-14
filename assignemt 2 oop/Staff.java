public class Staff extends Employee{
    private String title;

    public Staff(String n, String a, int p, String e, String o, double s, Date d, String t) {
        super(n, a, p, e, o, s, d);
        title=t;
    }

    public String toString() {
        return "Staff,"+ getName();
    }
}
