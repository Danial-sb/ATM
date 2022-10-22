package ATM;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveDataInFile {

    static ArrayList<BankAccount> accounts;

    public static void main(String[] args) throws IOException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });


        Scanner input = new Scanner(System.in);
        String choise;
        boolean end = false;
        while (!end) {
            System.out.println("Choose operation :\n1.Add user\n2.Search user by national ID\n3.Exit");
            choise = input.next();
            switch (choise) {
                case "1":
                    System.out.println("Enter Name :");
                    String Name = input.next();
                    System.out.println("Enter Family Name :");
                    String FamilyName = input.next();
                    System.out.println("Enter NationalID :");
                    String NationalID = input.next();
                    System.out.println("Enter AccountNumber :");
                    String AccountNumber = input.next();
                    System.out.println("Enter Balance :");
                    double Balance = input.nextDouble();
                    BankAccount BA = new BankAccount(Name, FamilyName, NationalID, AccountNumber, Balance);
                    addData(BA);
                    break;
                case "2":
                    System.out.println("Enter your NationalID :");
                    String ID = input.next();
                    System.out.println(searchAccount(ID).toString() + "\n");
                    break;
                case "3":
                    end = true;
                    break;
            }

        }
    }

    static void addData(BankAccount account) throws IOException {
        File file = new File("src\\accounts.txt");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter Bw = new BufferedWriter(fr);
        Bw.write(account.toString("TXT FORMAT"));
        Bw.newLine();
        Bw.close();
    }

    static BankAccount searchAccount(String NationalID) throws IOException {
        FileReader Fr = new FileReader("src\\accounts.txt");
        BufferedReader my_reader = new BufferedReader(Fr);
        String Line;
        BankAccount result = null;
        while ((Line = my_reader.readLine()) != null) {
            String[] data = Line.split(",");
            if (data[2].equals(NationalID)) {
                result = new BankAccount(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
            }
        }
        my_reader.close();
        return result;
    }

}
