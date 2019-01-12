package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    Button btn;

    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm:ss ");


    public void sendMsg() {
        if (textField.getText().length()!=0) {
            Date date = new Date();
            textArea.appendText(dateFormat.format(date) + textField.getText() + "\n");
            date = null;
            textField.clear();
            textField.requestFocus();
        }
    }

}
