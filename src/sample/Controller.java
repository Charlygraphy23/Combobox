package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.beans.Observable;
import javafx.beans.value.ObservableListValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXComboBox<Gender> comboBoxList;

    @FXML
    private Label labelText;

    @FXML
    private JFXButton clickButton;

    public String opt;

    @FXML
    void initialize() {


        comboBoxList.getItems().addAll(Gender.M,Gender.F,Gender.O);
        comboBoxList.setOnAction(actionEvent -> {
            System.out.println(comboBoxList.getSelectionModel().getSelectedItem().getDescription());
            opt=comboBoxList.getSelectionModel().getSelectedItem().getDescription();

        });

        clickButton.setOnAction(actionEvent -> {
            labelText.setText(opt);
        });


    }
}
