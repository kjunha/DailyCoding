import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockSquares {

    // Complete the squares function below.
    static int squares2(int a, int b) {
        int i = 1, j = 1;
        while ((i * i) < a) {
            i++;
        }
        while((j * j) <= b) {
            j++;
        }
        return j - i;
    }

    static int squares(int a, int b) {
        int a_sqrt = (int)Math.ceil(Math.sqrt((double)a));
        int b_sqrt = (int)Math.floor(Math.sqrt((double)b));
        return (b_sqrt - a_sqrt < 0) ? 0 : (b_sqrt - a_sqrt)+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
