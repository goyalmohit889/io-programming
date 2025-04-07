package csvfilehandling.advanceproblem.merge;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList <String> a  = new ArrayList<>();
            ArrayList <String> a1  = new ArrayList<>();

            String path = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\advanceproblem\\merge\\first.csv";
            String path2 = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\advanceproblem\\merge\\sec.csv";
            String read = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\advanceproblem\\merge\\merged.csv";

            CSVReader csv = new CSVReader(new FileReader(path));
            CSVReader csv2 = new CSVReader(new FileReader(path2));
            CSVWriter writer = new CSVWriter(new FileWriter(read));

            String line;
            String line2;

            while ((line = Arrays.toString(csv.readNext()))!=null){
                String data[] = line.split(",");
                a.add(data[0]+" "+data[1]+" "+data[2]);
//                for(String l : line){
//                    System.out.print(l+" ");
//                }
//                System.out.println();


            }
            System.out.println();
            while ((line2 = Arrays.toString(csv2.readNext()))!=null) {
                String data1[] = line2.split(",");
                a1.add(data1[0]+" "+data1[1]+" "+data1[2]);
//                for(String l : line2){
//                    System.out.print(l+" ");
//                }
//                System.out.println();
            }
            writer.writeNext(new String[]{"ID,Name,Age,Marks,Grade\n"});





        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
