public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("youssef","cairo", 0123,"a@gmail.com");
        System.out.println(p1.toString());

        Student s1 = new Student("omar","aswan", 00123,"b@gmail.com","MANGER");
        System.out.println(s1.toString());

        Employee e1 = new Employee("assem","cairo", 10023,"c@gmail.com","office",5290000,new Date());
        System.out.println(e1.toString());

        Faculty f1 = new Faculty("fawzy","cairo", 1932623,"d@gmail.com","office", 290000, new Date(),12,"manger");
        System.out.println(f1.toString());

        Staff s = new Staff("nouran","alex", 1757523,"e@gmail.com","office",1200,new Date(),"CEO");
        System.out.println(s.toString());


    }
}