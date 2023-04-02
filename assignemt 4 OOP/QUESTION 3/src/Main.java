import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter 5 intger numbers");
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<5;i++) {
            list.add(x.nextInt());
        }

        list.sort(Comparator.naturalOrder());

        for(int i=0;i<5;i++) {
            System.out.println(list.get(i));
        }


    }
}