package csvfilehandling.basic_problems.writecsv;

import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\basic_problems\\writecsv\\write.csv";
        try{
            CSVWriter write = new CSVWriter(new FileWriter(path));
            String[][] employees = {
                    {"ID", "Name", "Department", "Salary"},
                    {"101", "Alice Johnson", "HR", "50000"},
                    {"102", "Bob Smith", "Engineering", "75000"},
                    {"103", "Charlie Brown", "Finance", "65000"},
                    {"104", "David Wilson", "Marketing", "55000"},
                    {"105", "Emma Davis", "Sales", "60000"}
            };
            for (String[] employee : employees) {
                write.writeNext(employee); // Write each row
            }
            System.out.println("CSV file created successfully: " + path);
            write.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try{
            String read = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\basic_problems\\writecsv\\write.csv";
            CSVReader csv = new CSVReader(new FileReader(read));
            String[] nextLine;
            while ((nextLine = csv.readNext()) != null) {
                for(String l : nextLine){
                    System.out.print(l+" ");
                }
                System.out.println();
            }
            System.out.println("hii");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
