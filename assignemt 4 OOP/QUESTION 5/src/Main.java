import java.net.MalformedURLException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");

            Scanner input = new Scanner(url.openStream());
            int c = 0;
            while (input.hasNext())
            {
                if (Character.isLetter((input.next()).charAt(0)))
                {
                    c++;
                }
            }
            System.out.println("Number of words = " + c);
        }
        catch (java.net.MalformedURLException e) {
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException e) {
            System.out.println("I0 Errors");
        }
    }
}