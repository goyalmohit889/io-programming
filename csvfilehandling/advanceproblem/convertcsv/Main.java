package csvfilehandling.advanceproblem.convertcsv;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\advanceproblem\\convertcsv\\convert.csv"; // Update with actual CSV path
               List<Student> studentList = new ArrayList<>();

        try  {
            CSVReader csvReader = new CSVReader(new FileReader(filePath));
            String[] row;

            csvReader.readNext();

            while ((row = csvReader.readNext()) != null) {
                int id = Integer.parseInt(row[0]);
                String name = row[1];
                String email = row[2];
                int marks = Integer.parseInt(row[3]);

                Student student = new Student(id, name, email, marks);
                studentList.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print the Student list
        System.out.println("List of Students:");
        studentList.forEach(System.out::println);
    }
}

