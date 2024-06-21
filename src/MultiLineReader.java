import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiLineReader {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        System.out.println("Enter lines of text (type 'quit' to exit):");
        
        try {
            while ((line = in.readLine()) != null) {
                if (line.equals("quit")) {
                    break;
                }

                StringTokenizer tokenizer = new StringTokenizer(line);
                int wordCount = tokenizer.countTokens();
                System.out.println("There are " + wordCount + " words in this line.");

                while (tokenizer.hasMoreTokens()) {
                    System.out.println(tokenizer.nextToken());
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}