package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        FileWriter fileWriter = new FileWriter("song.txt");
        fileWriter.write("Nothing else matters \n");
        fileWriter.write("Mettalica \n");
        fileWriter.write("""
                """);
        fileWriter.close();

        String title = null;
        String author = null;
        String text = null;

        FileReader fileReader = new FileReader("song.txt");
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNextLine()){

            title = scanner.nextLine();
            author = scanner.nextLine();
            text = scanner.nextLine();
        }
        Song song = new Song(title,author,text);
        System.out.println(song);
    }
}
