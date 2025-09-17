import java.io.*;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new FileReader(Write.pubFileName));
            System.out.print("Guess the number typed in the file: ");
            String guess = sc.nextLine();
            String value = br.readLine();
            if (guess.equals(value)) {
                System.out.println("You guessed correctly! The value is " + guess);
            } else {
                System.out.println("You guessed incorrectly! The value is " + value);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
