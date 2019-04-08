
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    float data = 0f;
    int operation = -1;
    
    @FXML
    private Label label;
    
    @FXML
    private Button btn9;

    @FXML
    private Button btn8;

    @FXML
    private Button btn7;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btn6;

    @FXML
    private Button btn5;

    @FXML
    private Button btn4;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btn3;

    @FXML
    private Button btn2;

    @FXML
    private Button btn1;

    @FXML
    private Button btnTimes;

    @FXML
    private Button btnClear;

    @FXML
    private Button btn0;

    @FXML
    private Button btnResult;

    @FXML
    private Button btnDivide;
    
    @FXML
    private TextField txtResult;

    @FXML
    void handleButtonAction(ActionEvent event) {
        /* Number 1 */
        if(event.getSource() == btn1) {
            txtResult.setText(txtResult.getText() + "1");
        }/* Number 2*/ 
        else if(event.getSource() == btn2) {
            txtResult.setText(txtResult.getText() + "2");
        }/* Number 3*/ 
        else if(event.getSource() == btn3) {
            txtResult.setText(txtResult.getText() + "3");
        }
        /* Number 4*/ 
        else if(event.getSource() == btn4) {
            txtResult.setText(txtResult.getText() + "4");
        }
        /* Number 5*/ 
        else if(event.getSource() == btn5) {
            txtResult.setText(txtResult.getText() + "5");
        }
        /* Number 6*/ 
        else if(event.getSource() == btn6) {
            txtResult.setText(txtResult.getText() + "6");
        }
        /* Number 7*/ 
        else if(event.getSource() == btn7) {
            txtResult.setText(txtResult.getText() + "7");
        }
        /* Number 8*/ 
        else if(event.getSource() == btn8) {
            txtResult.setText(txtResult.getText() + "8");
        }
        /* Number 9*/ 
        else if(event.getSource() == btn9) {
            txtResult.setText(txtResult.getText() + "9");
        }
        /* Number 0*/ 
        else if(event.getSource() == btn0) {
            txtResult.setText(txtResult.getText() + "0");
        }
        /* Button Clear*/ 
        else if(event.getSource() == btnClear) {
            txtResult.setText("");
        }
        /* Button Plus*/ 
        else if(event.getSource() == btnPlus) {
            data = Float.parseFloat(txtResult.getText());
            operation = 1; // Plus
            txtResult.setText("");
        }
        /* Button Minus*/ 
        else if(event.getSource() == btnMinus) {
            data = Float.parseFloat(txtResult.getText());
            operation = 2; // Minus
            txtResult.setText("");
        }
        /* Button Divide*/ 
        else if(event.getSource() == btnDivide) {
            data = Float.parseFloat(txtResult.getText());
            operation = 3; // Divide
            txtResult.setText("");
        }
        /* Button Multiply*/ 
        else if(event.getSource() == btnTimes) {
            data = Float.parseFloat(txtResult.getText());
            operation = 4; // Multiply
            txtResult.setText("");
        }
        /* Button Result*/ 
        else if(event.getSource() == btnResult) {
            Float secondOperand = Float.parseFloat(txtResult.getText());
            switch(operation) {
                case 1: // Plus
                    Float ans = data + secondOperand;
                    txtResult.setText(String.valueOf(ans));
                   break;
                case 2: // Minus
                     ans = data - secondOperand;
                    txtResult.setText(String.valueOf(ans));
                   break;
                case 3: // Divide
                    ans = 0f;
                    try {
                     ans = data / secondOperand; 
                    }catch(Exception e) { txtResult.setText("Error"); }
                    txtResult.setText(String.valueOf(ans));
                   break;
                   
                case 4: // Multiply
                     ans = data * secondOperand;
                    txtResult.setText(String.valueOf(ans)); 
                   break;
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
