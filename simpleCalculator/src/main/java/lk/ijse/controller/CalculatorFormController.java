package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Date;

public class CalculatorFormController {

    @FXML
    private JFXButton backSpaceBtn, cBtn, ceBtn, decimalBtn, divideBtn, eightBtn, equalBtn, fiveBtn, fourBtn,
            multiplyBtn, nineBtn, oneBtn, oneDividedxBtn, percentageBtn, plusBtn, positiveOrNegativeBtn,
            reduceBtn, rootBtn, sevenBtm, sixBtn, squareRootOfXBtn, threeBtn, twoBtn, zeroBtn;

    @FXML
    private AnchorPane calculatorPane;

    @FXML
    private Label displayLbl;

    @FXML
    private ImageView historyBtn;

    @FXML
    private ArrayList<JFXButton> buttons = new ArrayList<>();

    @FXML
    private Label displayLbl1;

    ArrayList<Double> arrayList = new ArrayList<>();
    ArrayList<Double> totalArray = new ArrayList<>();

    String labelTemp = "";
    String labelTemp2 = "";
    String allLabels = "";

    double changeValue = 0;
    int i = 0;
    String calculate = "";

    double total = 0;

    @FXML
    void backSpaceBtnOnAction(ActionEvent event) {

    }

    @FXML
    void cBtnOnAction(ActionEvent event) {

    }

    @FXML
    void ceBtnOnAction(ActionEvent event) {

    }

    @FXML
    void decimalBtnOnAction(ActionEvent event) {

    }

    @FXML
    void divideBtnOnAction(ActionEvent event) {
        changeValue = Double.parseDouble(labelTemp);
        arrayList.add(changeValue);
        displayLbl.setText("/");
        calculate = "/";
        labelTemp = "";
    }

    @FXML
    void equalBtnOnAction(ActionEvent event) {
        changeValue = Double.parseDouble(labelTemp);
        arrayList.add(changeValue); //array list ekata gtta

        displayLbl1.setText(allLabels + " = ");

        if (calculate.equals("+")) {
            if (arrayList.size() == 2) {
                total = arrayList.get(arrayList.size() - 1) + arrayList.get(arrayList.size() - 2);
                totalArray.add(total);
                if (totalArray.size() >= 2) {
                    totalArray.add(totalArray.get(totalArray.size() - 1) + totalArray.get(totalArray.size() - 2));
                } else {
                    totalArray.add(total);
                }
            } else if (arrayList.size() > 2){
                totalArray.add(totalArray.get(totalArray.size() - 1) + arrayList.get(arrayList.size() - 1));
            }
        } else if (calculate.equals("-")) {
            if (arrayList.size() == 2) {
                total = arrayList.get(arrayList.size() - 1) - arrayList.get(arrayList.size() - 2);
                totalArray.add(total);
                if (totalArray.size() >= 2) {
                    totalArray.add(totalArray.get(totalArray.size() - 1) - totalArray.get(totalArray.size() - 2));
                } else {
                    totalArray.add(total);
                }
            } else if (arrayList.size() > 2){
                totalArray.add(totalArray.get(totalArray.size() - 1) - arrayList.get(arrayList.size() - 1));
            }
        } else if (calculate.equals("*")) {
            if (arrayList.size() == 2) {
                total = arrayList.get(arrayList.size() - 1) * arrayList.get(arrayList.size() - 2);
                totalArray.add(total);
                if (totalArray.size() >= 2) {
                    totalArray.add(totalArray.get(totalArray.size() - 1) * totalArray.get(totalArray.size() - 2));
                } else {
                    totalArray.add(total);
                }
            } else if (arrayList.size() > 2){
                totalArray.add(totalArray.get(totalArray.size() - 1) * arrayList.get(arrayList.size() - 1));
            }
        } else if (calculate.equals("/")) {
            if (arrayList.size() == 2) {
                total = arrayList.get(arrayList.size() - 1) / arrayList.get(arrayList.size() - 2);
                totalArray.add(total);
                if (totalArray.size() >= 2) {
                    totalArray.add(totalArray.get(totalArray.size() - 1) / totalArray.get(totalArray.size() - 2));
                } else {
                    totalArray.add(total);
                }
            } else if (arrayList.size() > 2){
                totalArray.add(totalArray.get(totalArray.size() - 1) / arrayList.get(arrayList.size() - 1));
            }
        }

        //total eka double ekkda int ekakda blala print krnaw
        if (totalArray.get(totalArray.size() - 1) % 1 == 0) {
            displayLbl.setText("" + totalArray.get(totalArray.size() - 1).intValue());
        } else {
            displayLbl.setText("" + totalArray.get(totalArray.size() - 1));
        }
    }

    @FXML
    void historyBtnOnAction(MouseEvent event) {

    }

    @FXML
    void multiplyBtnOnAction(ActionEvent event) {
        changeValue = Double.parseDouble(labelTemp);
        arrayList.add(changeValue);
        displayLbl.setText("*");
        calculate = "*";
        labelTemp = "";
    }

    @FXML
    void oneDividedxBtnOnAction(ActionEvent event) {

    }

    @FXML
    void percentageBtnOnAction(ActionEvent event) {

    }

    @FXML
    void plusBtnOnAction(ActionEvent event) {
        changeValue = Double.parseDouble(labelTemp);
        arrayList.add(changeValue);
        displayLbl.setText("+");
        calculate = "+";
        labelTemp = "";
    }

    @FXML
    void positiveOrNegativeBtnOnAction(ActionEvent event) {

    }

    @FXML
    void reduceBtnOnAction(ActionEvent event) {
        changeValue = Double.parseDouble(labelTemp);
        arrayList.add(changeValue);
        displayLbl.setText("-");
        calculate = "-";
        labelTemp = "";
    }

    @FXML
    void rootBtnOnAction(ActionEvent event) {

    }

    @FXML
    void squareRootOfXBtnOnAction(ActionEvent event) {

    }

    private void buttonClicked(ActionEvent event) {
        JFXButton clickedButton = (JFXButton) event.getSource();
        String buttonText = clickedButton.getText();

        labelTemp = labelTemp + buttonText;
        displayLbl.setText(labelTemp);

//        allLabels = labelTemp + " " + calculate + " " + labelTemp2 ;
//        displayLbl1.setText(allLabels);
    }

    @FXML
    void initialize() {
        buttons.add(eightBtn);
        buttons.add(fiveBtn);
        buttons.add(fourBtn);
        buttons.add(nineBtn);
        buttons.add(oneBtn);
        buttons.add(sevenBtm);
        buttons.add(sixBtn);
        buttons.add(threeBtn);
        buttons.add(twoBtn);
        buttons.add(zeroBtn);

        for (JFXButton button : buttons) {
            button.setOnAction(this::buttonClicked);
        }
    }
}