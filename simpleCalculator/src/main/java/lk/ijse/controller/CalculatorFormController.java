package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

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

    String labelTemp = "";
    String labelTemp2 = "";
    String allLabels = "";

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
        i = 1;
    }

    @FXML
    void equalBtnOnAction(ActionEvent event) {
        i = 0;

        displayLbl1.setText(allLabels + " = ");
        double valueOne = Integer.parseInt(labelTemp);
        double valueTwo = Integer.parseInt(labelTemp2);

        if (calculate.equals("+")) {
            total = valueOne + valueTwo;
        }

        if (total % 1 == 0) {
            displayLbl.setText("" + (int) total);
        } else {
            displayLbl.setText("" + total);
        }
    }

    @FXML
    void historyBtnOnAction(MouseEvent event) {

    }

    @FXML
    void multiplyBtnOnAction(ActionEvent event) {
        i = 1;
    }

    @FXML
    void oneDividedxBtnOnAction(ActionEvent event) {

    }

    @FXML
    void percentageBtnOnAction(ActionEvent event) {

    }

    @FXML
    void plusBtnOnAction(ActionEvent event) {
        i = 1;
        displayLbl.setText("+");
        calculate = "+";
    }

    @FXML
    void positiveOrNegativeBtnOnAction(ActionEvent event) {

    }

    @FXML
    void reduceBtnOnAction(ActionEvent event) {
        i = 1;
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

        if (i == 0){
            labelTemp = labelTemp + buttonText;
            displayLbl.setText(labelTemp);
        } else if (i == 1) {
            displayLbl.setText("");
            labelTemp2 = labelTemp2 + buttonText;
            displayLbl.setText(labelTemp2);
        }
        allLabels = labelTemp + " " + calculate + " " + labelTemp2 ;
        displayLbl1.setText(allLabels);
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