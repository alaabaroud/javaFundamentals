package linter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;



public class App {
    public static void main(String[] args) {
        String Path = "C:\\Users\\LTUC\\javaFund\\javaFundamentals\\linter\\app\\src\\test\\gates.js";
        linter(Path);
        System.out.println(Path);


    }

    public static ArrayList<String> linter(String StringPath) {
        ArrayList<String> newArr = new ArrayList<String>();
        Path Path = Paths.get(StringPath);
        try {
            List<String> fileLines = Files.readAllLines(Path);
            int value = 1;
            for (String line : fileLines) {
                if (!line.endsWith(";") && !line.endsWith("}") && !line.endsWith("{") && !line.contains("else") && !line.contains("if") && !line.equals("")) {
                    String errLine = "Line" + value + " : Missing semiColon";
                    newArr.add(errLine);
                }
                value++;
                System.out.println(newArr);
            }
        } catch (IOException exception) {
            System.out.println("error");

        }


        
        return newArr;

    }
}

