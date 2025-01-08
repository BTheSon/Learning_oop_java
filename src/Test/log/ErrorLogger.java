package Test.log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ErrorLogger {
    private static BufferedWriter writer = null;

    public static void logAttributeError(int numLine, String attribute)  {
        try {
            if (writer == null)
                writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Dòng "+ numLine + ": Sai định dạng ở trường " + attribute + "\n");
        }
        catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    public  static void logDataRedundancy(int line) {
        try {
            if (writer == null)
                writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Dòng "+ line + ": dư thừa dữ liệu\n");
        }
        catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
