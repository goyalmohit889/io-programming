package csvfilehandling.advanceproblem.validatecsv;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Mohit Goyal\\OneDrive\\Desktop\\io-program\\csv-file-handelling\\src\\main\\java\\advanceproblem\\validatecsv\\valid.csv"; // Update with your actual file path

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegex);

        String phoneRegex = "^[0-9]{10}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try {
            CSVReader csvReader = new CSVReader(new FileReader(filePath));
            String[] row;

            csvReader.readNext();

            while ((row = csvReader.readNext()) != null) {
                String id = row[0];
                String name = row[1];
                String email = row[2];
                String phone = row[3];

                boolean isValidEmail = emailPattern.matcher(email).matches();
                boolean isValidPhone = phonePattern.matcher(phone).matches();

                if (!isValidEmail || !isValidPhone) {
                    System.out.println("Invalid Record: " + String.join(", ", row));
                    if (!isValidEmail) System.out.println("   ❌ Invalid Email: " + email);
                    if (!isValidPhone) System.out.println("   ❌ Invalid Phone: " + phone);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

