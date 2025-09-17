import java.io.*;
import java.util.Scanner;

public class Write {

    public static String pubFileName = "guess.txt";
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new FileWriter(pubFileName));
            System.out.print("Type in a number: ");
            String content = sc.nextLine();
            bw.write(content);
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Oh no it all went wrong!");
        }
    }


}
