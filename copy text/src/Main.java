import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        //write each line into arraylist
        ArrayList<String> textLine = new ArrayList<>();
        FileReader read = new FileReader("readtext.txt");
        BufferedReader bread = new BufferedReader(read);
        String aLine;
        while (((aLine = bread.readLine()) != null)) {
            textLine.add(aLine);
        }
        bread.close();
//print the arraylist(you can also try to put in specific index)
        for (int i = 0; i < textLine.size(); i++) {
            System.out.println(textLine.get(i));
        }

        //testing
        for (int num = 0; num < searchWord("when").length; num++) {
            System.out.println("Your word is in:" + (searchWord("when")[num]));
        }
    }

    //searchword method
    public static int[] searchWord(String words) throws IOException {
        Path path = Paths.get("readtext.txt");
        String content = Files.readString(path);
        String[] paragraph = content.split(" ");
//count how many are here to determine size of the array needed
        int size = 0;
        for (int a = 0; a < paragraph.length; a++) {
            if (paragraph[a].equals(words)) {
                size++;
            }
        }
            int[] indexes = new int[size];
            int num = 0;
            for (int i = 0; i < paragraph.length; i++) {
                if (paragraph[i].equals(words)) {
                    indexes[num] = i;
                    num++; } }
        return indexes;
        }


}