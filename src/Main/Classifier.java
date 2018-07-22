package Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Classifier {

    public static void main(String[] args) {
        Path path = Paths.get("TrainingSample.csv");

        List<String> listOfPixels = new ArrayList<>();
        try {
            listOfPixels = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Nie znaleziono pliku");
        }

        System.out.println(listOfPixels.get(0));
        System.out.println(listOfPixels.get(1));
        System.out.println(listOfPixels.get(2));
        System.out.println(listOfPixels.get(3));
        System.out.println(listOfPixels.get(9));

    }
}

/*
java.nio.file Files.readAllLines -> przeczyta plik i zwróci nam List<string> dla każdej lini/wiersza w pliku
    java.nio.file Paths.get
 */
