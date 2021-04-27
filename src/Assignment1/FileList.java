package Assignment1;
import java.io.File;
import java.util.Scanner;

public class FileList {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a directory to look into: ");
        String dirPath = input.nextLine();
        File path = new File(dirPath);
        File filesList[] = path.listFiles();
        System.out.println("These are the files and directories in the specified path");
        for (File file: filesList) {
            System.out.println("File name: " + file.getName());
        }

        input.close();
    }
}
