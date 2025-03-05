import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.security.PrivateKey;



public class MyJframe extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public MyJframe() {
        setTitle("Lista de Contactos");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 15)); // 3 rows, 2 columns



        // Text Fields
        textField1 = new JTextField();
        textField2 = new JTextField();

        // Buttons
        button1 = new JButton("Add Friend");
        button2 = new JButton("Search Friend");
        button3 = new JButton("Update Friend");
        button4 = new JButton("Delete");
        button5 = new JButton("Clear");

        // Resizing Buttons
        Dimension buttonSize = new Dimension(10, 60); // Set your desired width and height
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);


        // Add components to the frame
        add(new JLabel("Nombre persona"));
        add(textField1);
        add(new JLabel("Número persona"));
        add(textField2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);











        // Add action listeners (example for button1)
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                JOptionPane.showMessageDialog(MyJframe.this, "!\nText Field 1: " + text1 + "\nText Field 2: " + text2);

    
                    try {
                         // Define file paths
                        File file2 = new File("currentname.txt");
                        File file3 = new File("currentcode.txt");
                
                         // Create the files if they do not exist
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        if (!file3.exists()) {
                             file3.createNewFile();
                            }
                
                        // Write to the file
                        try (FileWriter writer = new FileWriter(file2)) { 
                             writer.write(text1);
                            System.out.println("File created successfully!");
                            }
                        try (FileWriter writer = new FileWriter(file3)) { 
                            writer.write(text2);
                            System.out.println("File created successfully!");
                            }
                
                    } catch (IOException ioe) { System.out.println("IO Exception: " + ioe.getMessage());
                    } catch (NumberFormatException nef) {System.out.println("Number Format Exception: " + nef.getMessage());
                }
                    
                Add.main(null);
                

            }



            
        });

        // Add action listeners for other buttons as needed
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           Search.main(null);}
                  
        });



        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text1 = textField1.getText();
                String text2 = textField2.getText();
                
                try {
                    // Define file paths
                   File file2 = new File("currentname.txt");
                   File file3 = new File("currentcode.txt");
           
                    // Create the files if they do not exist
                   if (!file2.exists()) {
                       file2.createNewFile();
                   }
                   if (!file3.exists()) {
                        file3.createNewFile();
                       }
           
                   // Write to the file
                   try (FileWriter writer = new FileWriter(file2)) { 
                        writer.write(text1);
                       System.out.println("File created successfully!");
                       }
                   try (FileWriter writer = new FileWriter(file3)) { 
                       writer.write(text2);
                       System.out.println("File created successfully!");
                       }}
           
                catch (IOException ioe) {System.out.println(ioe); }
        
                catch (NumberFormatException nef) {System.out.println(nef); }



                UpdateFriend.main(null); }


            
            });

        button4.addActionListener(new ActionListener() {
            @Override


            public void actionPerformed(ActionEvent e) {

                String text1 = textField1.getText();
                String text2 = textField2.getText();


                try {
                    // Define file paths
                   File file2 = new File("currentname.txt");
                   File file3 = new File("currentcode.txt");
           
                    // Create the files if they do not exist
                   if (!file2.exists()) {
                       file2.createNewFile();
                   }
                   if (!file3.exists()) {
                        file3.createNewFile();
                       }
           
                   // Write to the file
                   try (FileWriter writer = new FileWriter(file2)) { 
                        writer.write(text1);
                       System.out.println("File created successfully!");
                       }
                   try (FileWriter writer = new FileWriter(file3)) { 
                       writer.write(text2);
                       System.out.println("File created successfully!");
                       }
           
               } catch (IOException ioe) { System.out.println("IO Exception: " + ioe.getMessage());
               } catch (NumberFormatException nef) {System.out.println("Number Format Exception: " + nef.getMessage());
           }
               
           Delete.main(null);}


            
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                textField1.setText(""); // Clears the first text field
                textField2.setText(""); // Clears the second text field


     } });
    





        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyJframe();
            }
        });



        
    }
}