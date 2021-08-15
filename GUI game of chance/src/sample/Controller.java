package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
//labels in the display

//field
    public int p1Move;
    public int p2Move;
    public int p1point;
    public int p2point;

    public Label p1Roll;
    public Label p2roll;
    public Label p1Score;
    public Label p2Score;
    public Label p1Status;
    public Label p2status;
    public Button rollButton;


    public void roll(ActionEvent actionEvent) {
        //p1 move(math random)
        p1Move = 1 + (int)(Math.random() * ((6 - 1) + 1));
        String a = Integer.toString(p1Move);
        p1Roll.setText(a);

        //p2 move(random)
        p2Move = 1 + (int)(Math.random() * ((6 - 1) + 1));
        String b = Integer.toString(p2Move);
        p2roll.setText(b);

        if (p1Move > p2Move){
            p1point ++; }
        else if (p1Move == p2Move){
            p1point ++;
            p2point ++;}
        else {p2point ++;}
        // put it into score board
        p1Score.setText(Integer.toString(p1point));
        p2Score.setText(Integer.toString(p2point));
        if (p1point == 10){
            p1Status.setText("p1 win!");
            rollButton.setDisable(true);
        }
        else if (p2point== 10)
        {p2status.setText("p2 win!");
        rollButton.setDisable(true);}
        }
    }


//every time you change the big box add controller at the end(fx:controller="sample.Controller")