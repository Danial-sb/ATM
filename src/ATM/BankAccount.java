package ATM;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class BankAccount {

    private String name;
    private String NationalID;
    private String account_number;
    private double balance;
    private String FamilyName;

    // constructor
    public BankAccount(String name,String FamilyName, String NationalID, String account_number, double balance) {
        this.name = name;
        this.NationalID = NationalID;
        this.account_number = account_number;
        this.balance = balance;
        this.FamilyName = FamilyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return NationalID;
    }

    public void setNationalID(String NationalID) {
        this.NationalID = NationalID;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws IOException, BankExceptions.NegativeAmountException { //bardasht
        if (amount > balance) {
            throw new BankExceptions.NegativeAmountException();   //in se khat age bardASHTI bishtar bashe az mojodi etefagh miofte
        }
        balance -= amount;
        update();

    }

    public void deposite(double amount) throws IOException {

        balance += amount;
        update();

    }

    void Trnasfer(String Destination_Account_Number, double amount) throws IOException, BankExceptions {
        if (amount > balance) {
            throw new BankExceptions.NegativeAmountException();
        }

        String[] data;

        boolean Account_found = false;

        Path FILE_PATH = FileSystems.getDefault().getPath("src\\accounts.txt");

        ArrayList<String> fileContent = new ArrayList<>(Files.readAllLines(FILE_PATH, StandardCharsets.UTF_8));

        for (int i = 0; i < fileContent.size(); i++) {
            data = fileContent.get(i).split(",");

            if (data[3].equals(Destination_Account_Number)) {

                fileContent.set(i, data[0] + "," + data[1] + "," + data[2] + ","  + data[3] + "," + (Double.parseDouble(data[4]) + amount));
                Account_found = true;
                break;
            }
        }

        if (!Account_found) {
            throw new BankExceptions.AcocuntNotFoundException();
        }

        Files.write(FILE_PATH, fileContent, StandardCharsets.UTF_8);
        withdraw(amount);

    }

    void update() throws IOException {
        String[] data;
        Path FILE_PATH = FileSystems.getDefault().getPath("src\\accounts.txt");
        ArrayList<String> fileContent = new ArrayList<>(Files.readAllLines(FILE_PATH, StandardCharsets.UTF_8));

        for (int i = 0; i < fileContent.size(); i++) {
            data = fileContent.get(i).split(",");
            if (data[2].equals(NationalID)) {
                fileContent.set(i, toString("formatted"));
                break;
            }
        }
        Files.write(FILE_PATH, fileContent, StandardCharsets.UTF_8);
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    public String toString(String format) {
        return name + ',' + FamilyName + ',' + NationalID + ',' + account_number + ',' + balance;
    }

    public String toString() {
        return "Name:" + name + "\nFamilyName: " + FamilyName + "\nNationalID: " + NationalID + "\nAccountNumber: " + account_number + "\nBalance: " + balance;
    }

}
