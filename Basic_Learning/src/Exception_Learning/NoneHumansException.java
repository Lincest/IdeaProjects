package Exception_Learning;

import javax.swing.*;

public class NoneHumansException extends Exception {
    String message;

    public NoneHumansException(String message) {
        super(message);
        this.message=message;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        JOptionPane.showMessageDialog(null,message,"发生异常",JOptionPane.ERROR_MESSAGE);
    }
}
