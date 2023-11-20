package faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Fakedata {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

        //Kunden

        try {
            FileWriter myWriter = new FileWriter("filename.txt");

            for (int i = 1; i <= 100; i++) {
                String firstName = faker.name().firstName(); // Emory
                String lastName = faker.name().lastName(); // Barton
                String email = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@example.com"; // Constructing email from first name and last name

                String record = "insert into Kunden(KundenID,Vorname,Nachname,Email) values(" + i + ",'" + firstName + "','" + lastName + "','" + email + "');";
                System.out.println(record);

                myWriter.write(record + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Produkte

        try {
            FileWriter myWriter = new FileWriter("filename2.txt");

            for (int i = 1; i <= 100; i++) {
                String productName = faker.commerce().productName();
                double price = faker.number().randomDouble(2, 1, 1000); // Generating a random price between 1 and 1000
                String category = faker.commerce().material();

                String record = "insert into Produkte(ProduktID,Name,Preis,Kategorie) values(" + i + ",'" + productName + "'," + price + ",'" + category + "');";
                System.out.println(record);

                myWriter.write(record + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Bestellungen

        try {
            FileWriter myWriter = new FileWriter("filename3.txt");

            for (int i = 1; i <= 100; i++) {
                String firstName = faker.name().firstName(); // Emory
                String lastName = faker.name().lastName(); // Barton
                String email = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@example.com"; // Constructing email from first name and last name
                String orderDate = new SimpleDateFormat("yyyy-MM-dd").format(faker.date().birthday()); // Generating a random order date

                String record = "insert into Bestellungen(BestellID, KundenID, Bestelldatum) values("
                        + i + "," + i + ",'" + orderDate + "');";
                System.out.println(record);

                myWriter.write(record + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();


        }

        //Lieferanten

        try {
            FileWriter myWriter = new FileWriter("filename4.txt");

            for (int i = 1; i <= 100; i++) {
                String companyName = faker.company().name(); // Generating a random company name
                String contactName = faker.name().fullName(); // Generating a random contact name
                String record = "insert into Lieferanten(LieferantenID, Name, Kontakt) values("
                        + i + ",'" + companyName + "','" + contactName + "');";
                System.out.println(record);

                myWriter.write(record + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Lagerbestand

        try {
            FileWriter myWriter = new FileWriter("filename5.txt");

            for (int i = 1; i <= 100; i++) {
                int productID = i; // Assuming ProduktID is an integer field
                int quantity = faker.number().numberBetween(1, 1000); // Generating a random quantity
                int lieferantenID = i; // Assuming LieferantenID is an integer field

                String record = "insert into Lagerbestand(ProduktID, Menge, LieferantenID) values("
                        + productID + "," + quantity + "," + lieferantenID + ");";
                System.out.println(record);

                myWriter.write(record + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
