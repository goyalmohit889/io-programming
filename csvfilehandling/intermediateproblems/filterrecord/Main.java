package csvfilehandling.intermediateproblems.filterrecord;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try{
            String path = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\intermediateproblems\\filterrecord\\record.csv";
            CSVReader csv = new CSVReader(new FileReader(path));
            String line[];

            csv.readNext();

            while ((line = csv.readNext())!=null){
                int mark = Integer.parseInt(line[3]);
                if(mark>80)
                System.out.println(line[0]+" "+line[1]+" "+line[2]+" "+mark);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
