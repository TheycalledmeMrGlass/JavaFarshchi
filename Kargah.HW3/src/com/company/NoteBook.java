/*
 * Created by JFormDesigner on Sun May 17 22:50:11 IRDT 2020
 */

package com.company;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.*;

/**
 * @author Farzad
 */
public class NoteBook extends JFrame {
    List<String >note=new ArrayList<>();
    public String notes,Data;
    public String getNotes(){return notes};
    public String getData(){return Data};
    public NoteBook(String notes,String Data) {
        Scanner input=new Scanner(System.in);
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.notes=notes;
        this.Data=Data;
    }
    public void setNotes(String notes){
        this.notes=notes;
    }
    public void setData(String Data){
        this.Data=Data;
    }

    private void JButton1MouseClicked(MouseEvent e) {
        // TODO add your code here

   System.exit(0);

    }

    private void textArea1KeyTyped(KeyEvent e) {
        System.out.println("enter the text");
        setNotes();
    }

    private void setNotes() {
        this.notes=notes;
    }

    private void Note1MouseClicked(MouseEvent e) {
        // TODO add your code here
        Note1.setText(getNotes());
        setNotes();
    }

    private void Note2MouseClicked(MouseEvent e) {

        System.out.println(getNotes());
        setNotes();
    }

    private void Note3MouseClicked(MouseEvent e) {

        System.out.println(getNotes());
        setNotes();
    }

    private void Note4MouseClicked(MouseEvent e) {
        // TODO add your code here
        System.out.println(getNotes());
        setNotes();
    }

    private void Note5MouseClicked(MouseEvent e) {

        System.out.println(getNotes());
        setNotes();
    }

    private void Data1MouseClicked(MouseEvent e) {
        System.out.println(getData());
        setData();
    }

    private void setData() {
    }

    private void Data2MouseClicked(MouseEvent e) {
        System.out.println(getData());
        setData();
    }

    private void Data3MouseClicked(MouseEvent e) {
        System.out.println(getData());
        setData();
    }

    private void Data4MouseClicked(MouseEvent e) {
        System.out.println(getData());
        setData();
    }

    private void Data5MouseClicked(MouseEvent e) {
        System.out.println(getData());
        setData();
    }



    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Farzad
        OkButton = new JButton();
        resultlabel = new JLabel();
        scrollPane1 = new JScrollPane();
        Note1 = new JTextArea();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        Note2 = new JTextField();
        Note3 = new JTextField();
        Note4 = new JTextField();
        Note5 = new JTextField();
        label1 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        Data1 = new JTextField();
        Data2 = new JTextField();
        Data3 = new JTextField();
        Data4 = new JTextField();
        Data5 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- OkButton ----
        OkButton.setText("OK");
        OkButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JButton1MouseClicked(e);
            }
        });
        contentPane.add(OkButton);
        OkButton.setBounds(625, 495, 123, 45);

        //---- resultlabel ----
        resultlabel.setText("FirstNote");
        resultlabel.setFont(resultlabel.getFont().deriveFont(resultlabel.getFont().getStyle() | Font.BOLD));
        contentPane.add(resultlabel);
        resultlabel.setBounds(0, 0, 85, 51);

        //======== scrollPane1 ========
        {

            //---- Note1 ----
            Note1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    textArea1KeyTyped(e);
                }
            });
            Note1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Note1MouseClicked(e);
                    Note1MouseClicked(e);
                }
            });
            scrollPane1.setViewportView(Note1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(110, 5, 190, 70);

        //---- label2 ----
        label2.setText("SecondNote");
        contentPane.add(label2);
        label2.setBounds(0, 80, 90, 65);

        //---- label3 ----
        label3.setText("ThirdNote");
        contentPane.add(label3);
        label3.setBounds(0, 155, 85, 60);

        //---- label4 ----
        label4.setText("ForthNote");
        contentPane.add(label4);
        label4.setBounds(0, 235, 85, 80);

        //---- label5 ----
        label5.setText("FifthNote");
        contentPane.add(label5);
        label5.setBounds(5, 360, 135, 85);

        //---- Note2 ----
        Note2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Note2MouseClicked(e);
            }
        });
        contentPane.add(Note2);
        Note2.setBounds(100, 85, 205, 55);

        //---- Note3 ----
        Note3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Note3MouseClicked(e);
            }
        });
        contentPane.add(Note3);
        Note3.setBounds(100, 150, 204, 80);

        //---- Note4 ----
        Note4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Note4MouseClicked(e);
            }
        });
        contentPane.add(Note4);
        Note4.setBounds(105, 240, 194, 85);

        //---- Note5 ----
        Note5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Note5MouseClicked(e);
            }
        });
        contentPane.add(Note5);
        Note5.setBounds(115, 340, 180, 90);

        //---- label1 ----
        label1.setText("Date&Writer");
        contentPane.add(label1);
        label1.setBounds(350, 5, 70, 70);

        //---- label6 ----
        label6.setText("Date&Writer");
        contentPane.add(label6);
        label6.setBounds(350, 160, 70, 70);

        //---- label7 ----
        label7.setText("Date&Writer");
        contentPane.add(label7);
        label7.setBounds(345, 75, 80, 70);

        //---- label8 ----
        label8.setText("Date&Writer");
        contentPane.add(label8);
        label8.setBounds(350, 245, 75, 70);

        //---- label9 ----
        label9.setText("Date&Writer");
        contentPane.add(label9);
        label9.setBounds(350, 350, 70, 70);

        //---- Data1 ----
        Data1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Data1MouseClicked(e);
            }
        });
        contentPane.add(Data1);
        Data1.setBounds(550, 15, 124, 65);

        //---- Data2 ----
        Data2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Data2MouseClicked(e);
            }
        });
        contentPane.add(Data2);
        Data2.setBounds(540, 105, 129, 45);

        //---- Data3 ----
        Data3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Data3MouseClicked(e);
            }
        });
        contentPane.add(Data3);
        Data3.setBounds(540, 175, 125, 55);

        //---- Data4 ----
        Data4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Data4MouseClicked(e);
            }
        });
        contentPane.add(Data4);
        Data4.setBounds(530, 255, 134, 60);

        //---- Data5 ----
        Data5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Data5MouseClicked(e);
            }
        });
        contentPane.add(Data5);
        Data5.setBounds(535, 340, 124, 75);

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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Farzad
    private JButton OkButton;
    private JLabel resultlabel;
    private JScrollPane scrollPane1;
    private JTextArea Note1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField Note2;
    private JTextField Note3;
    private JTextField Note4;
    private JTextField Note5;
    private JLabel label1;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextField Data1;
    private JTextField Data2;
    private JTextField Data3;
    private JTextField Data4;
    private JTextField Data5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
