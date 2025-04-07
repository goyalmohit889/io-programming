package csvfilehandling.intermediateproblems.sortcsv;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            String path = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\intermediateproblems\\sortcsv\\sort.csv";
            CSVReader csv = new CSVReader(new FileReader(path));
            String line[];
            ArrayList<Integer> al = new ArrayList<>() ;
            while ((line = csv.readNext())!=null){
                int a = Integer.parseInt(line[3]);
//                al.add(a);
//                System.out.println(a);
            }
//            System.out.println(al);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
