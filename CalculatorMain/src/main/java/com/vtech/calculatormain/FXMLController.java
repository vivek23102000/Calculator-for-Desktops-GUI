package com.vtech.calculatormain;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    public double fval = 0;
    public double lval = 0;
    public double res = 0;
    public char operation = 'N';
    @FXML
    public Alert s = new Alert(AlertType.NONE);
    public Label master;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    
    @FXML
    public void btn1(ActionEvent event) {
    master.setText(master.getText() + 1);
    System.out.print("\n1");
    }
    public void btn2(ActionEvent event) {
    master.setText(master.getText() + 2);
    System.out.print("\n2");
    }
    public void btn3(ActionEvent event) {
    master.setText(master.getText() + 3);
    System.out.print("\n3");
    }
    public void btn4(ActionEvent event) {
    master.setText(master.getText() + 4);
    System.out.print("\n4");
    }
    public void btn5(ActionEvent event) {
    master.setText(master.getText() + 5);    
    System.out.print("\n5");
    }
    public void btn6(ActionEvent event) {
    master.setText(master.getText() + 6);    
    System.out.print("\n6");
    }
    public void btn7(ActionEvent event) {
    master.setText(master.getText() + 7);    
    System.out.print("\n7");
    }
    public void btn8(ActionEvent event) {
    master.setText(master.getText() + 8);    
    System.out.print("\n8");
    }
    public void btn9(ActionEvent event) {
    master.setText(master.getText() + 9);    
    System.out.print("\n9");
    }
    public void btn0(ActionEvent event) {
    master.setText(master.getText() + 0);    
    System.out.print("\n0");
    }
    public void btnplus(ActionEvent event) {
    operation = '+';
    fval = Double.parseDouble(master.getText());
    master.setText("");
    System.out.print("\nOperation +");
    }  
    public void btnminus(ActionEvent event) {
    operation = '-';
    fval = Double.parseDouble(master.getText());
    master.setText("");
    System.out.print("\nOperation -");
    }  
    public void btnmul(ActionEvent event) {
    operation = '*';
    fval = Double.parseDouble(master.getText());
    master.setText("");
    System.out.print("\nOperation *");
    }  
    public void btndiv(ActionEvent event) {
    operation = '/';
    fval = Double.parseDouble(master.getText());
    master.setText("");
    System.out.print("\nOperation /");
    }  
    public void eq(ActionEvent event) {
    System.out.print("\nOperation =");
    lval = Double.parseDouble(master.getText());
        switch (operation) {
            case '+':
                System.out.println("Performing... +");
                res = fval + lval;
                master.setText(res+"");
                break;
            case '-':
                System.out.println("Performing... -");
                res = fval - lval;
                master.setText(res+"");
                break;
            case '*':
                System.out.println("Performing... *");
                res = fval * lval;
                master.setText(res+"");
                break;
            case '/':
                System.out.println("Performing... /");
                res = fval / lval;
                master.setText(res+"");
                break;
            default:
                s.setAlertType(AlertType.INFORMATION);
                s.setContentText("No operations set please choose an \noperation.");
                s.show();
                break;
        }
            
    }
    
    public void clearall(ActionEvent e){
        fval = 0;
        lval = 0;
        operation = 'N';
        res = 0;
        master.setText("0");
    }
    
    public void showAbout(ActionEvent e){
        s.setAlertType(AlertType.INFORMATION);
        s.setContentText("Developed By Vivek Tiwari \n Technology JavaFX \n Build 1.0 26122019");
        s.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
