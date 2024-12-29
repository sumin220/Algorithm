import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String word = br.readLine();
        
        int index = 0, count = 0;
        while (index <= document.length() - word.length()) {
            if (document.substring(index, index + word.length()).equals(word)) {
                count++;
                index += word.length();
            } else {
                index++;
            }
        }
        
        System.out.println(count);
    }
}