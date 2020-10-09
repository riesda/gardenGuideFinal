package com.garden;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlantMain {

    private JPanel panelMain;
    private JButton Home;
    private JButton Search;
    private JButton MyGarden;
    private JButton AddPlant;
    private JPanel panelButton;
    private JPanel panelDisplay;
    private JLabel information;

    public PlantMain()  {
        super();

        Home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                information.setText("TestH");
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "HOME TEST");
                information.setVisible(false);
            }
        });
        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                information.setVisible(true);
                information.setText("TestS");

          }
        });

        MyGarden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                information.setText("TestM");
            }
        });

        AddPlant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                information.setText("TestA");
            }
        });

       /* @Override
        protected JComponent createSearchPanel(){
            JPanel searchDialogue = new JPanel(new BorderLayout());

            JLabel label = new JLabel("TEST SEARCH");
            label.setPreferredSize(new Dimension(100,100));


            return searchDialogue;
        }*/

    }
    public static void main(String[]args){

        JFrame frameMain = createFameM();
        JPanel panelM = createPanelM();



        frameMain.setVisible(true);

    }

    private static JFrame createFameM() {
        JFrame mainF = new JFrame("Garden Guide");

        mainF.setLayout(new GridLayout(1,2));
        mainF.setContentPane(new PlantMain().panelMain);
        mainF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainF.setSize(800,600);

        return mainF;
    }

    private static JPanel createPanelM(){
        JPanel panelMain = new JPanel(){
            //@Override
            public boolean isOptomizedDrawingEnabled(){
                return true;
            }
        };
        panelMain.setLayout(new OverlayLayout(panelMain));

        return panelMain;



    }
}
