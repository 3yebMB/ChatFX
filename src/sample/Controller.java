package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class Controller {
    @FXML
    WebView webView;

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    TextField nickName;

    @FXML
    Button btn;

    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm:ss ");
    String path = "..\\log\\2019-01-12.html";

    public void sendMsg() {

        WebEngine webEngine = webView.getEngine();

        if (textField.getText().length()!=0) {
            Date date = new Date();
            //textArea.appendText(dateFormat.format(date) + textField.getText() + "\n");
            // проверяем текущую дату и открываем соответствующий файл,
            // если его нет, значит начался новый день и надо создать новый файл.
            path = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<title>Заголовок страницы</title>\n" +
                    "</head>\n" +
                    "  <body>\n" +
                    "    <div align=\"right\">" +
                    //<img src="URL" alt="альтернативный текст">

                    "       <h2><img src=\"..\\img\\avatar.png\" width=\"50\" height=\"50\">"+dateFormat.format(date)+ nickName.getText()+"</h2>\n" +
                    "    </div>" +
                    "    <div align=\"right\">" +
                    "       <p>"+textField.getText()+"</p>\n" +
                    "    </div>" +
                    "  </body>\n" +
                    "</html>";
            webEngine.loadContent(path);

            date = null;
            textField.clear();
            textField.requestFocus();
        }
    }

}
