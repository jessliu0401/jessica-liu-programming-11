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

    public static ArrayList createAllFriends(String fileName) throws IOException {
        fRead = new FileReader(fileName);
        bRead = new BufferedReader(fRead);
        String line;
        String friendString = "";
        while ((line = bRead.readLine()) != null) {
            if (!line.equals(";")) {
                friendString += line;
            } else {
                parseFriends(friendString);
                friendString = "";
            }
        }
        return friends;
    }

    private static void parseFriends(String string) {
        int pos = 0;
        String name = "";
        int phoneNum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                pos = i;
                name = string.substring(0, pos);
                phoneNum = Integer.parseInt(string.substring(pos + 1));
            }
        }
        Friends f = new Friends(name, phoneNum);
        if (friends.size() == 0) {
            friends.add(f);
        } else {
            int repeats = 0;
            for (int i = 0; i < friends.size(); i++) {
                    if (f.getName().equals(friends.get(i).getName())) {
                        repeats++; } }
            if (repeats == 0){
                friends.add(f);
                }

            }


        }
    }



