import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (
                PrintWriter s = new PrintWriter(new FileOutputStream(new File("joee.txt")));
        ) {
            for (int i=0;i<100;i++) {
                s.print((int)(Math.random()*100) + " ");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File error");

        }

        System.out.println("Done!");
    }
}