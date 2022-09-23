    /**
     * Sample Skeleton for 'helloWord.fxml' Controller Class
     */

package controllers;

    import javafx.fxml.FXML;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.control.Button;
    import javafx.scene.control.TextField;
    import javafx.stage.Stage;

    import java.io.IOException;
    import java.net.URL;
    import java.util.ResourceBundle;

    public class WordController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="authSignButton"
    private Button authSignButton; // Value injected by FXMLLoader

    @FXML // fx:id="loginSignUpButton"
    private Button loginSignUpButton; // Value injected by FXMLLoader

    @FXML // fx:id="login_field"
    private TextField login_field; // Value injected by FXMLLoader

    @FXML // fx:id="password_field"
    private TextField password_field; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        authSignButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String loginPassword = password_field.getText().trim();

            if(!loginText.equals("") && !loginPassword.equals(""))
                loginUser(loginText, loginPassword);
            else
                System.out.println("Login and/or password is empty");
        });

        loginSignUpButton.setOnAction(event -> {
            loginSignUpButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/example/word_4/signUp.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            /*
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
             */

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });
    }

        private void loginUser(String loginText, String loginPassword) {

        }

    }