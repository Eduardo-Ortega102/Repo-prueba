package UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Control.Interface;

public class OptionFrame extends JFrame {
    private final Interface atributo;

    public OptionFrame(Interface atributo) throws HeadlessException {
        this.atributo = atributo;
        this.setTitle("Options");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createToolbar(), BorderLayout.SOUTH);
        this.add(createPanel(), BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(createEasyCheckBox());
        panel.add(createIntermediateCheckBox());
        panel.add(createAdvancedCheckBox());
        return panel;
    }

    private JPanel createToolbar() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.add(createOkButton());
        panel.add(createCancelButton());
        return panel;
    }

    private JButton createOkButton() {
        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                atributo.execute("HOLA MUNDO");
            }
        });
        return button;
    }

    private JButton createCancelButton() {
        JButton button = new JButton("Cancel");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                atributo.execute("ADIOS MUNDO");
            }
        });
        return button;
    }

    private JRadioButton createEasyCheckBox() {
        JRadioButton box = new JRadioButton("Easy level (15 mines, 9x9 squares)");
        box.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                atributo.execute("Easy level");
            }
        });
        return box;
    }

    private JRadioButton createIntermediateCheckBox() {
        JRadioButton box = new JRadioButton("Intermediate level (45 mines, 16x16 squares)");
        return box;
    }

    private JRadioButton createAdvancedCheckBox() {
        JRadioButton box = new JRadioButton("Advanced level (105 mines, 16x30 squares)");
        return box;
    }
}
