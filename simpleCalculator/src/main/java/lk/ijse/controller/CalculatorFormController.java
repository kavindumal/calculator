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
    private JFXButton backSpaceBtn;

    @FXML
    private JFXButton cBtn;

    @FXML
    private AnchorPane calculatorPane;

    @FXML
    private JFXButton ceBtn;

    @FXML
    private JFXButton decimalBtn;

    @FXML
    private Label displayLbl;

    @FXML
    private JFXButton divideBtn;

    @FXML
    private JFXButton eightBtn;

    @FXML
    private JFXButton equalBtn;

    @FXML
    private JFXButton fiveBtn;

    @FXML
    private JFXButton fourBtn;

    @FXML
    private ImageView historyBtn;

    @FXML
    private JFXButton multiplyBtn;

    @FXML
    private JFXButton nineBtn;

    @FXML
    private JFXButton oneBtn;

    @FXML
    private JFXButton oneDividedxBtn;

    @FXML
    private JFXButton percentageBtn;

    @FXML
    private JFXButton plusBtn;

    @FXML
    private JFXButton positiveOrNegativeBtn;

    @FXML
    private JFXButton reduceBtn;

    @FXML
    private JFXButton rootBtn;

    @FXML
    private JFXButton sevenBtm;

    @FXML
    private JFXButton sixBtn;

    @FXML
    private JFXButton squareRootOfXBtn;

    @FXML
    private JFXButton threeBtn;

    @FXML
    private JFXButton twoBtn;

    @FXML
    private JFXButton zeroBtn;

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
    void eightBtnOnAction(ActionEvent event) {

    }

    @FXML
    void equalBtnOnAction(ActionEvent event) {

    }

    @FXML
    void fiveBtnOnAction(ActionEvent event) {

    }

    @FXML
    void fourBtnOnAction(ActionEvent event) {

    }

    @FXML
    void historyBtnOnAction(MouseEvent event) {

    }

    @FXML
    void multiplyBtnOnAction(ActionEvent event) {

    }

    @FXML
    void nineBtnOnAction(ActionEvent event) {

    }

    @FXML
    void oneBtnOnAction(ActionEvent event) {

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
    void sevenBtmOnAction(ActionEvent event) {

    }

    @FXML
    void sixBtnOnAction(ActionEvent event) {

    }

    @FXML
    void squareRootOfXBtnOnAction(ActionEvent event) {

    }

    @FXML
    void threeBtnOnAction(ActionEvent event) {

    }

    @FXML
    void twoBtnOnAction(ActionEvent event) {

    }

    @FXML
    void zeroBtnOnAction(ActionEvent event) {
        displayLbl.setText("" + 0);
    }

    private void buttonClicked(ActionEvent event) {
        JFXButton clickedButton = (JFXButton) event.getSource();
        String buttonText = clickedButton.getText();

        // Handle the button click based on buttonText
        // For example, update the displayLbl based on the button clicked.
        displayLbl.setText(buttonText);
    }

    @FXML
    void initialize() {  //venama string ekak aram btn tika save krgnin
        buttons.add(backSpaceBtn);
        buttons.add(cBtn);
        buttons.add(ceBtn);
        buttons.add(decimalBtn);
        buttons.add(divideBtn);
        buttons.add(eightBtn);
        buttons.add(equalBtn);
        buttons.add(fiveBtn);
        buttons.add(fourBtn);
        buttons.add(multiplyBtn);
        buttons.add(nineBtn);
        buttons.add(oneBtn);
        buttons.add(oneDividedxBtn);
        buttons.add(percentageBtn);
        buttons.add(plusBtn);
        buttons.add(positiveOrNegativeBtn);
        buttons.add(reduceBtn);
        buttons.add(rootBtn);
        buttons.add(sevenBtm);
        buttons.add(sixBtn);
        buttons.add(squareRootOfXBtn);
        buttons.add(threeBtn);
        buttons.add(twoBtn);
        buttons.add(zeroBtn);

        for (JFXButton button : buttons) {
            button.setOnAction(this::buttonClicked);
        }
    }
}