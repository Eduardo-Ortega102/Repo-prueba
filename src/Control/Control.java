package Control;

import UI.OptionFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Control {
    
    public static void execute(){
        OptionFrame option = new OptionFrame(new Interface() {
            @Override
            public void execute(String mensaje) {
                mensaje(mensaje);
            }
        });
    }
    
    private static void mensaje(String mensaje){
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, mensaje);
    }
}
