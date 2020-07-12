/*
 * Created by JFormDesigner on Sun Jul 12 19:35:23 IRDT 2020
 */

package com.company;

import java.awt.*;
import javax.swing.*;

/**
 * @author Farzad
 */
public class Driving extends JFrame {

    public Driving() {

        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Farzad
        StartingField = new JLabel();
        IdField = new JTextField();
        ModelField = new JTextField();
        PelakField = new JTextField();
        button1 = new JButton();
        TakhalofDialog = new JDialog();
        TakhalofLabel = new JLabel();
        TakhalofField = new JTextField();
        DoneButton = new JButton();
        ErrorDialog = new JDialog();
        textField2 = new JTextField();
        SuccessDialog = new JDialog();
        SuccessfulField = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- StartingField ----
        StartingField.setText("Enter it");
        contentPane.add(StartingField);
        StartingField.setBounds(50, 20, 120, 40);

        //---- IdField ----
        IdField.setText("id:");
        contentPane.add(IdField);
        IdField.setBounds(20, 80, 270, IdField.getPreferredSize().height);

        //---- ModelField ----
        ModelField.setText("Model:");
        contentPane.add(ModelField);
        ModelField.setBounds(20, 130, 290, ModelField.getPreferredSize().height);

        //---- PelakField ----
        PelakField.setText("Pelak:");
        contentPane.add(PelakField);
        PelakField.setBounds(5, 185, 330, PelakField.getPreferredSize().height);

        //---- button1 ----
        button1.setText("Next:");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(165, 230), button1.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());

        //======== TakhalofDialog ========
        {
            var TakhalofDialogContentPane = TakhalofDialog.getContentPane();
            TakhalofDialogContentPane.setLayout(null);

            //---- TakhalofLabel ----
            TakhalofLabel.setText("Takhalof:");
            TakhalofDialogContentPane.add(TakhalofLabel);
            TakhalofLabel.setBounds(40, 10, 120, 35);
            TakhalofDialogContentPane.add(TakhalofField);
            TakhalofField.setBounds(20, 55, 194, 95);

            //---- DoneButton ----
            DoneButton.setText("Done");
            TakhalofDialogContentPane.add(DoneButton);
            DoneButton.setBounds(55, 185, 128, DoneButton.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < TakhalofDialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = TakhalofDialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = TakhalofDialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                TakhalofDialogContentPane.setMinimumSize(preferredSize);
                TakhalofDialogContentPane.setPreferredSize(preferredSize);
            }
            TakhalofDialog.pack();
            TakhalofDialog.setLocationRelativeTo(TakhalofDialog.getOwner());
        }

        //======== ErrorDialog ========
        {
            var ErrorDialogContentPane = ErrorDialog.getContentPane();
            ErrorDialogContentPane.setLayout(null);

            //---- textField2 ----
            textField2.setText("Fill it !");
            ErrorDialogContentPane.add(textField2);
            textField2.setBounds(45, 50, 105, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < ErrorDialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = ErrorDialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = ErrorDialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                ErrorDialogContentPane.setMinimumSize(preferredSize);
                ErrorDialogContentPane.setPreferredSize(preferredSize);
            }
            ErrorDialog.pack();
            ErrorDialog.setLocationRelativeTo(ErrorDialog.getOwner());
        }

        //======== SuccessDialog ========
        {
            var SuccessDialogContentPane = SuccessDialog.getContentPane();
            SuccessDialogContentPane.setLayout(null);

            //---- SuccessfulField ----
            SuccessfulField.setText("Successful");
            SuccessDialogContentPane.add(SuccessfulField);
            SuccessfulField.setBounds(25, 50, 114, SuccessfulField.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < SuccessDialogContentPane.getComponentCount(); i++) {
                    Rectangle bounds = SuccessDialogContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = SuccessDialogContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                SuccessDialogContentPane.setMinimumSize(preferredSize);
                SuccessDialogContentPane.setPreferredSize(preferredSize);
            }
            SuccessDialog.pack();
            SuccessDialog.setLocationRelativeTo(SuccessDialog.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Farzad
    private JLabel StartingField;
    private JTextField IdField;
    private JTextField ModelField;
    private JTextField PelakField;
    private JButton button1;
    private JDialog TakhalofDialog;
    private JLabel TakhalofLabel;
    private JTextField TakhalofField;
    private JButton DoneButton;
    private JDialog ErrorDialog;
    private JTextField textField2;
    private JDialog SuccessDialog;
    private JTextField SuccessfulField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
