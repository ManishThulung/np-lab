//// Manish Rai
//package lab5;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io. PrintWriter;
//import java.net.Socket;
//public class Qn3 extends JFrame implements ActionListener {
//    private JTextField domainTextField;
//    private JTextArea resultTextArea;
//
//    public Qn3() {
//        setTitle("WHOIS Client");
//        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
//        setSize(400, 300);
//        setLocationRelativeTo (null);
//
//        JPanel mainPanel new JPanel (new BorderLayout());
//
//        JLabel domainLabel new JLabel ("Domain: ");
//        domainTextField = new JTextField();
//        JButton lookupButton = new JButton("Lookup");
//        lookupButton.addActionListener(this);
//
//        JPanel inputPanel = new JPanel (new BorderLayout());
//        inputPanel.add(domainLabel, BorderLayout.WEST);
//        inputPanel.add(domainTextField, BorderLayout.CENTER);
//        inputPanel.add(lookupButton,BorderLayout.EAST) ;
//
//        resultTextArea = new JTextArea ();
//        resultTextArea.setEditable (false);
//        JScrollPane scrollPane = new JScrollPane (resultTextArea);
//        mainPanel.add(inputPanel, BorderLayout. NORTH);
//        mainPanel.add(scrollPane, BorderLayout.CENTER);
//
//        add (mainPanel);
//    }
//
//    public void actionPerformed (ActionEvent e) { String domain domainTextField.getText().trim();
//        if (!domain.isEmpty()) ( lookupWhois (domain)
//
//        private void lookupWhois (String domain) (
//        try (
//                Socket socket new Socket ("whois.internic.net", 43);
//        BufferedReader reader = new BufferedReader (new InputStreamReader (socket.getInputStream()));
//        PrintWriter writer new PrintWriter(socket.getOutputStream(), true);
//
//        writer.println(domain);
//        String line;
//        StringBuilder response new StringBuilder();
//
//        while ((line-reader.readLine()) != null) {
//            response.append(line).append("\n");
//        }
//
//        resultTextArea.setText(response.toString());
//        reader.close();
//        writer.close();
//        socket.close();
//    } catch (Exception e) {
//        resultTextArea.setText("Error: " + e.getMessage());
//    }
//}
//    public static void main(String[] args) {
//        SwingUtilities.invokeLate (new Runnable() {
//            public void run() {
//                new Qn3 ().setVisible (true);
//            }
//        });
//    }
//}
//
