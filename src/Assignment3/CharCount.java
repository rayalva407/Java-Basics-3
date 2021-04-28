package Assignment3;
import java.io.*;
import java.util.Scanner;

public class CharCount {


  public static void main(String[] args) throws FileNotFoundException {
    String file = "src/Assignment3/test.txt";
    String line;
    Scanner scnr = new Scanner(new FileReader(file));
    Scanner scnr1 = new Scanner(System.in);

    System.out.print("Enter the character you would like to count");
    char myChar = scnr1.nextLine().charAt(0);

    try {
      int count = 0;

      while (scnr.hasNextLine()) {
        line = scnr.nextLine();
        
        for (int i = 0; i < line.length(); i++) {
          if (line.charAt(i) == myChar) {
            count++;
          }
        }
      }
      System.out.println(count);
      
    } finally {
      scnr.close();
      scnr1.close();
    }

    
  }
}
