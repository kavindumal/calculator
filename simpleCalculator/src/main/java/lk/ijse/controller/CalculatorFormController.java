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
    private AnchorPane calculatorPane;

    @FXML
    private JFXButton backSpaceBtn, cBtn, ceBtn, decimalBtn, divideBtn, eightBtn, equalBtn, fiveBtn, fourBtn,
            historyBtn, multiplyBtn, nineBtn, oneBtn, oneDividedxBtn, percentageBtn, plusBtn, positiveOrNegativeBtn,
            reduceBtn, rootBtn, sevenBtm, sixBtn, squareRootOfXBtn, threeBtn, twoBtn, zeroBtn;

    @FXML
    private Label displayLbl;

    @FXML
    private ArrayList<JFXButton> buttons = new ArrayList<>();

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

    }

    @FXML
    void equalBtnOnAction(ActionEvent event) {

    }

    @FXML
    void historyBtnOnAction(MouseEvent event) {

    }

    @FXML
    void multiplyBtnOnAction(ActionEvent event) {

    }

    @FXML
    void oneDividedxBtnOnAction(ActionEvent event) {

    }

    @FXML
    void percentageBtnOnAction(ActionEvent event) {

    }

    @FXML
    void plusBtnOnAction(ActionEvent event) {

    }

    @FXML
    void positiveOrNegativeBtnOnAction(ActionEvent event) {

    }

    @FXML
    void reduceBtnOnAction(ActionEvent event) {

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
        displayLbl.setText(buttonText);
    }

    @FXML
    void initialize() {  //venama string ekak aram btn tika save krgnin
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