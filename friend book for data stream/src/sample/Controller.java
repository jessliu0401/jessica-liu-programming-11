package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Controller {
    public TextField enterName;
    public TextField enterPhone;
    public ListView<Friends> friendList = new ListView<>();
    // label for displaying friends
    public Label disName;
    public Label disPhone;
    public Button deleteButton;
    public Button saveButton;
    public Button loadButton;


    public void oneFriend(ActionEvent actionEvent) {
        Friends friends = new Friends(enterName.getText(), Integer.parseInt(enterPhone.getText()));
        friendList.getItems().add(friends);
        enterName.clear();
        enterPhone.clear();
        deleteButton.setDisable(true);

    }


    public void showFriend(MouseEvent mouseEvent) {
        Friends friends;
        friends = friendList.getSelectionModel().getSelectedItem();
        if(friendList.getSelectionModel().getSelectedItem() == null){
            deleteButton.setDisable(true);
            return;}
        disName.setText(friends.getName());
        disPhone.setText(Integer.toString(friends.getPhoneNum()));
        deleteButton.setDisable(false);

    }


    public void deleteFriend(ActionEvent actionEvent) {
        Friends friends;
        friends = friendList.getSelectionModel().getSelectedItem();
        if(friendList.getSelectionModel().getSelectedItem() == null){
            deleteButton.setDisable(true);
            return;}
        else{ int i = friendList.getSelectionModel().getSelectedIndex();
            friendList.getItems().remove(i);
            disName.setText("");
            disPhone.setText("");
            deleteButton.setDisable(true);


        }
    }
//for save to friend button
    public void saveFriends(ActionEvent actionEvent) throws IOException {
        ObservableList<Friends> saveList = friendList.getItems();
        String s = "friends.txt";
        for (Friends friends : saveList) {
            friends.writeToFile(s); }
        String af ="allFriends.txt";
    for (Friends friends : saveList) {
        friends.writeToFile(af); }
            friendList.getItems().clear(); }

        // for load friends button
        public void loadFriend(ActionEvent actionEvent) throws IOException {
            friendList.getItems().clear();
            ArrayList<Friends> friends = CreateFriends.createAllFriends("friends.txt");
            for (Friends g : friends) {
                    friendList.getItems().add(g);
                }
            }

// for save to best friend button
public void saveBf(ActionEvent actionEvent) throws IOException {
    ObservableList<Friends> saveList = friendList.getItems();
    String s = "bestFriend.txt";
    for (Friends friends : saveList) {
        friends.writeToFile(s); }
    String af ="allFriends.txt";
    for (Friends friends : saveList) {
        friends.writeToFile(af); }
    friendList.getItems().clear();}

    // for load best friends button
    public void loadBf(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList<Friends> friends = CreateFriends.createAllFriends("bestFriend.txt");
        for (Friends f : friends) {
            friendList.getItems().add(f);
        }
    }
    //for load all friend button
    public void loadAll(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList<Friends> friends = CreateFriends.createAllFriends("allFriends.txt");
        for (Friends f : friends) {
            friendList.getItems().add(f); }
    }
    }












