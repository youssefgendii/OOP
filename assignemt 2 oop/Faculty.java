public class Faculty extends Employee{
    private int officeHours;
    private String rank;

    public Faculty(String n, String a, int p, String e, String o, double s, Date d, int h, String r) {
        super(n, a, p, e, o, s, d);
        officeHours=h;
        rank=r;
    }
    public String toString() {
        return "Faculty," + getName();
    }
}
