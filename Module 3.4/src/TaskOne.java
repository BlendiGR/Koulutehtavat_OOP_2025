import java.io.*;
import java.net.*;

public class TaskOne {
    public static void main(String[] args) {
        try {
            URL myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
            InputStream istream = myUrl.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(istream));

            String line;
            double sum = 0.0;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length < 2) continue;

                String aika = parts[0];
                if (aika.startsWith("01.01.2023")) {
                    String ulkoRaw = parts[1];
                    try {
                        double ulko = Double.parseDouble(
                                ulkoRaw.trim().replace(',', '.'));
                        sum += ulko;
                        count++;
                    } catch (NumberFormatException nfe) {
                    }
                }
            }

            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average UlkoTalo on 01.01.2023: %.2f °C (%d rows)%n",
                        average, count);
            } else {
                System.out.println("No rows found for 01.01.2023");
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e);
        }
    }
}
