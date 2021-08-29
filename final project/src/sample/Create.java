package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*
this class is used to load up all past records from the txt file and display them on the listviews
it reads from the document and uses them to create objects
 */
public class Create {
    private static FileReader fRead;
    private static BufferedReader bRead;
    private static ArrayList<Purchase> purchases = new ArrayList<>();
    private static ArrayList<Funding> funds = new ArrayList<>();
    private static ArrayList<Teacher> pays = new ArrayList<>();
//************************************** create school purchase records
    public static ArrayList createAllPurchase(String fileName) throws IOException {
        fRead = new FileReader(fileName);
        bRead = new BufferedReader(fRead);
        String line;
        String itemString = "";
        while ((line = bRead.readLine()) != null) {
            if (!line.equals(";")) {
                itemString += line;
            } else {
                parsePurchase(itemString);
                itemString = "";
            }
        }
        return purchases;
    }
    //parse contents in txt file to create purchase objects

    private static void parsePurchase(String string) {
        int pos = 0;
        String itemName = "";
        int cost = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                pos = i;
                itemName = string.substring(0, pos);
                cost = Integer.parseInt(string.substring(pos + 1));
            }
        }
        Purchase p = new Purchase(itemName, cost);
        purchases.add(p);
    }

    //**************************************************************** creates funding records
    public static ArrayList createAllFunds(String fileName) throws IOException {
        fRead = new FileReader(fileName);
        bRead = new BufferedReader(fRead);
        String line;
        String itemString = "";
        while ((line = bRead.readLine()) != null) {
            if (!line.equals(";")) {
                itemString += line;
            } else {
                parseFunds(itemString);
                itemString = "";
            }
        }
        return funds;
    }
    //parse contents in txt file to create funding objects
    private static void parseFunds(String string) {
        int pos = 0;
        String patronName = "";
        int amount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                pos = i;
                patronName = string.substring(0, pos);
                amount = Integer.parseInt(string.substring(pos + 1));
            }
        }
        Funding f = new Funding(patronName, amount);
        funds.add(f);
    }

    //*************************************************************** creates payment records
    public static ArrayList createAllPays(String fileName) throws IOException {
        fRead = new FileReader(fileName);
        bRead = new BufferedReader(fRead);
        String line;
        String itemString = "";
        while ((line = bRead.readLine()) != null) {
            if (!line.equals(";")) {
                itemString += line;
            } else {
                parsePays(itemString);
                itemString = "";
            }
        }
        return pays;
    }
    //parse contents in txt file to create teacher payment objects
    private static void parsePays(String string) {
        int pos = 0;
        String teachName = "";
        int cost = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                pos = i;
                teachName = string.substring(0, pos);
                cost = Integer.parseInt(string.substring(pos + 1));
            }
        }
        Teacher t = new Teacher(teachName, cost);
        pays.add(t);
    }
}





