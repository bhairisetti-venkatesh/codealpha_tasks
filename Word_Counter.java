
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class Word_Counter extends JFrame implements ActionListener {

        private JTextArea textArea;
        private JButton countButton;
        private JLabel countLabel;

        public Word_Counter() {
            super("Word Counter");

            textArea = new JTextArea(20, 40);
            textArea.setFont(new Font("Arial", Font.PLAIN, 22)); 
            countButton = new JButton("Count");
            countButton.setFont(new Font("Arial Black", Font.PLAIN, 18)); 

            countLabel = new JLabel("Word count: 0");
            countLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));

            JPanel panel = new JPanel();
            panel.add(new JScrollPane(textArea));
            panel.add(countButton);
            panel.add(countLabel);
            panel.setBackground(Color.lightGray);

            add(panel);

            countButton.addActionListener(this);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pack();
            setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {

            String text = textArea.getText();

            String[] words = text.split("\\s+");

            int count = words.length;
            countLabel.setText("Word count: " + count);
        }

        public static void main(String[] args) {
            new Word_Counter();
        }
    }


