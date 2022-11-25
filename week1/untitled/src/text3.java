// ex3: HelloNameDialog.java
// hanhatquang20205116
import javax.swing.JOptionPane;
public class text3 {
    public static void main(String[] args){
        String result;
        result =JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
    }
}
