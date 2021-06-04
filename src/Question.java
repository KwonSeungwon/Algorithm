import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Question {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        final String originalValue = bufferedReader.readLine();
        String[] spliceValue = originalValue.split("");

        while(true) {


            if(spliceValue.equals("1")) {
                break;
            }

        }

        bufferedWriter.write(originalValue);
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
