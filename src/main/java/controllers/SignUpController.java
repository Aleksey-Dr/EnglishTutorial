/**
 * Sample Skeleton for 'signUp.fxml' Controller Class
 */

package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="authSignButton"
    private Button authSignButton; // Value injected by FXMLLoader

    @FXML // fx:id="login_field"
    private TextField login_field; // Value injected by FXMLLoader

    @FXML // fx:id="password_field"
    private TextField password_field; // Value injected by FXMLLoader

    @FXML // fx:id="signUpMail"
    private TextField signUpMail; // Value injected by FXMLLoader

    @FXML // fx:id="signUpName"
    private TextField signUpName; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert authSignButton != null : "fx:id=\"authSignButton\" was not injected: check your FXML file 'signUp.fxml'.";
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'signUp.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpMail != null : "fx:id=\"signUpMail\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpName != null : "fx:id=\"signUpName\" was not injected: check your FXML file 'signUp.fxml'.";

    }

}
