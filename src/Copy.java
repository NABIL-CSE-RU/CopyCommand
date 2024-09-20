import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        String inputFileName = "C:/Users/HP/Desktop/input.txt";
        String outputFileName = "C:/Users/HP/Desktop/output.txt";
        File inputFile = new File(inputFileName);
        try{
            Scanner in = new Scanner(inputFile);
            PrintWriter out = new PrintWriter(new File(outputFileName));
            while (in.hasNext()){
                if(in.hasNextLine()){
                    String value = in.nextLine();
                    out.println(value);
                }
            }
            System.out.println("File Copied Successfully.");
            in.close();
            out.close();
        }
        catch(Exception e){
            System.out.println("File Not Found: " + e.getMessage());
        }
    }
}
