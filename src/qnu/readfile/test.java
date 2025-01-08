package qnu.readfile;

import com.mysql.cj.exceptions.StreamingNotifiable;

import java.io.*;
import java.util.Scanner;


public class test {
    public static void writeFile(String filePath) {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Sử dung lớp BufferedWriter để ghi file\n");
            writer.write("Có thể sử dụng Scanner để đọc từng dòng file\n");
            writer.write("\t phải kết hơp với lớp File để mở file cần đọc");
//            writer.append("ad");
        }
        catch (IOException e) {
            System.out.println("write" + e.getLocalizedMessage());
        }
    }

    public static void readFile(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e) {
            System.out.println("read" + e.getLocalizedMessage());
        }
    }
    public static void testStringBuider() {
        StringBuilder builder = new StringBuilder("hell,1,true");
        Scanner scanner = new Scanner(String.valueOf(builder));

    }
    public static void main(String[] args) {
        StringBuilder stringBuilder;
        String filepath = "src\\resource\\text.txt";
        writeFile(filepath);
        readFile(filepath);
    }
}
