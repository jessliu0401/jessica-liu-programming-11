package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public static int schoolBalance = 80000;
    //purchase tab
    public TextField itemName;//item name
    public TextField totalCost;//cost
    //receive funding tab
    public TextField patronName;
    public TextField patronDonate;
    //pay teacher tab
    public TextField teachName;
    public TextField teachSalary;
    //view balance tab
    public ListView teachPay= new ListView<>();//displays records of payment
    public ListView fundReceived= new ListView<>();//displays records of funds received
    public ListView transactionList = new ListView<>();//displays records of school purchases
    public Label balance;//set to display balance
    public Button initializeButton;//initializes system
    public Button payButton;
    public Button purchaseButton;

    public void getMinistryFund(ActionEvent actionEvent) throws IOException {
        //request to receive 3000$ fund from the ministry of education
        Funding mf = new Funding("Ministry of Ed", 3000);
        fundReceived.getItems().add(mf);
        schoolBalance = schoolBalance + mf.amount;
        balance.setText(Integer.toString(schoolBalance));
        mf.writeToFile("fundRecord.txt");
        //the section below is use to disable ability to buy stuff if necessary
            payButton.setDisable(false);//after a fund is added to school account, we first assume that the school has a positive balance, so we enables the purchase buttons first
            purchaseButton.setDisable(false);
        if(schoolBalance <= 0){//we check again. If after adding the fund the school balance is still on negative, the purchase button would be disabled so the balance will not go more negative
            payButton.setDisable(true);
            purchaseButton.setDisable(true);
        }



    }
//for purchase tab where you buy stuff for the school and spend money

    public void purchaseItem(ActionEvent actionEvent) throws IOException {
        Purchase p = new Purchase(itemName.getText(),Integer.parseInt(totalCost.getText()));
        transactionList.getItems().add(p);
        schoolBalance = schoolBalance - Integer.parseInt(totalCost.getText());
        balance.setText(Integer.toString(schoolBalance));
        p.writeToFile("purchaseRecord.txt");
        itemName.clear();
        totalCost.clear();
        //if after purchase the school is in dept, then the school would need to request more money first before purchasing
        if(schoolBalance <= 0){
            payButton.setDisable(true);
            purchaseButton.setDisable(true);
        }
    }
//a tab to pay teachers
    public void sendPay(ActionEvent actionEvent) throws IOException {
        Teacher t = new Teacher(teachName.getText(), Integer.parseInt(teachSalary.getText()));
        teachPay.getItems().add(t);
        schoolBalance = schoolBalance - Integer.parseInt(teachSalary.getText());
        balance.setText(Integer.toString(schoolBalance));
        t.writeToFile("payRecord.txt");
        teachName.clear();
        teachSalary.clear();
        //if after purchase the school is in dept, we disable purchase buttons. Then the school would need to request more money first before purchasing
        if(schoolBalance <= 0){
            payButton.setDisable(true);
            purchaseButton.setDisable(true);
        }
    }

//a tab to receive donations from individuals to the school
    public void addDonation(ActionEvent actionEvent) throws IOException {
        Funding f = new Funding(patronName.getText(), Integer.parseInt(patronDonate.getText()));
        fundReceived.getItems().add(f);
        schoolBalance = schoolBalance + Integer.parseInt(patronDonate.getText());
        balance.setText(Integer.toString(schoolBalance));
        f.writeToFile("fundRecord.txt");
        patronName.clear();
        patronDonate.clear();
            payButton.setDisable(false);
            purchaseButton.setDisable(false);
        //if after purchase the school is in dept, we disable purchase buttons. Then the school would need to request more money first before purchasing
        if(schoolBalance <= 0){
            payButton.setDisable(true);
            purchaseButton.setDisable(true);
        }

    }

//before using this system, we MUST use this method to load up all past records of purchase
    public void initialize(ActionEvent actionEvent) throws IOException {
        transactionList.getItems().clear();
        fundReceived.getItems().clear();
        teachPay.getItems().clear();
        ArrayList<Purchase> purchases = Create.createAllPurchase("purchaseRecord.txt");
        for (Purchase p : purchases){
            transactionList.getItems().add(p);
            schoolBalance = schoolBalance - p.getCost();
        }
        ArrayList<Funding> funds = Create.createAllFunds("fundRecord.txt");
        for (Funding f : funds){
            fundReceived.getItems().add(f);
            schoolBalance=schoolBalance + f.getAmount();
        }
        ArrayList<Teacher> teachPay = Create.createAllPays("payRecord.txt");
        for (Teacher t : teachPay){
            this.teachPay.getItems().add(t);
            schoolBalance=schoolBalance - t.getSalary();
        }
        balance.setText(Integer.toString(schoolBalance));

        initializeButton.setDisable(true);
    }
}
