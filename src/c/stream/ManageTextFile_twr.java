package c.stream;

import java.io.*;
import java.util.Scanner;

import static java.io.File.separator;

public class ManageTextFile_twr {
    public static void main(String[] args) {
        ManageTextFile_twr manager = new ManageTextFile_twr();
        String fullPath = "C:" + separator + "godofjava" + separator + "text" + separator + "numbers.txt";
        manager.writeFile(fullPath);
    }
    public void writeFile(String fileName) {
        try(Scanner sc = new Scanner(new File(fileName))) {
           System.out.println(sc.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
