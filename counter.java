import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class counter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your file path");
        String filepath = sc.nextLine();
        File f1 = new File(filepath);
        ArrayList<String> words = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String l1;
            while ((l1 = reader.readLine()) != null) {
                String[] Lwords = l1.split(" ");
                for (String word : Lwords) {
                    words.add(word);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] wordsArray = words.toArray(new String[0]);
        System.out.println("Number of words in the mentioned file is : " + wordsArray.length);
    }

}
