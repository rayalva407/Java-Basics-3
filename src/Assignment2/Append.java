package Assignment2;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Append {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the path to the file you would like to append to");
    String path = input.nextLine();
    System.out.println("Enter the text you would like to append");
    String text = input.nextLine();

    try {
      FileWriter fw = new FileWriter(path, true);
      fw.write(text);
      fw.close();
    } catch (IOException e) {
    }
    input.close();
  }
}
