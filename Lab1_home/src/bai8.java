package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bai8 {
	public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("input8.1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("input8.2.txt"));
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();
        int lineNumber = 1;

        while (line1 != null || line2 != null) {
            if ((line1 == null && line2 != null) || (line1 != null && line2 == null) || (!line1.equals(line2))) {
                System.out.print(lineNumber + "// ");
                if (line1 != null) {
                    System.out.print(line1);
                }
                System.out.print("\t");
                if (line2 != null) {
                    System.out.print(line2);
                }
                System.out.println("\\");
            }

            line1 = reader1.readLine();
            line2 = reader2.readLine();
            lineNumber++;
        }

        reader1.close();
        reader2.close();
    }
}
