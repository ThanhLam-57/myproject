package Test;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        File input = new File("input.txt");

        try {
            Scanner lam = new Scanner(input);
            while (lam.hasNextLine()){
                String a = lam.nextLine();
                System.out.println(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
