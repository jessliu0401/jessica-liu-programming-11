package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriends {
    private static String name;
    private static int phoneNum;
    private static FileReader fRead;
    private static BufferedReader bRead;
    private static ArrayList<Friends> friends = new ArrayList<>();
//这个是公用的
    public static ArrayList createAllFriends(String fileName) throws IOException {
        fRead = new FileReader(fileName);
        bRead = new BufferedReader(fRead);
        String line;
        String friendString = "";
        while((line = bRead.readLine())!= null){
            if(!line.equals(";")){
                friendString += line;
            }else{
                parseFriends(friendString);
                friendString = "";
            }
        }
        return friends;
    }

    private static void parseFriends(String string){
    int pos = 0;
    String name = "";
    int phoneNum = 0;
    for ( int i = 0; i< string.length(); i++){
        if(string.substring(i, i+1).equals(",")){
            pos = i;
            name = string.substring(0, pos);
            phoneNum = Integer.parseInt(string.substring(pos + 1));
        } }
    friends.add(new Friends(name, phoneNum)); }


}


