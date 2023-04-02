import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File filename = new File("filepath");

        Scanner input = new Scanner(filename);
        String remove = "youssef";
        String s = "";
        while (input.hasNext()) {
            s = s + input.nextLine();
        }

        s = s.replaceAll(remove, "");
        PrintWriter output = new PrintWriter(filename);
        output.write(s);
        output.close();
    }

    }
}