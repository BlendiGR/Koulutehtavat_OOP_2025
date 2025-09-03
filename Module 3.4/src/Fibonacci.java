import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Fibonacci{
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("fibo.csv", true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            long prev2 = 0;
            long prev1 = 1;


            bufferedWriter.write(prev2 + "\n");
            bufferedWriter.write(prev1 + "\n");


            for (int i = 2; i < 60; i++) {
                long current = prev1 + prev2;
                bufferedWriter.write(current + "\n");
                prev2 = prev1;
                prev1 = current;
            }

            bufferedWriter.flush();
            System.out.println("60 Fibonacci numbers written to fibo.csv");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
