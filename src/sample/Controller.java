package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField inputText;

    public void sendMsg(){
        textArea.appendText(inputText.getText() + "\n");
        inputText.clear();
        inputText.requestFocus();
    }
}
