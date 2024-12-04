import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
 class window extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JLabel label;
    window(){
        JFrame frame=new JFrame();
        frame.setTitle("kuizu");
        frame.setSize(1280,720);
        label =new JLabel();
        ImageIcon imageIcon = new ImageIcon("bg.jpg");
        label.setIcon(imageIcon);
        JPanel panel = new JPanel();
        panel.add(label);
        panel.setLayout(new FlowLayout());
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        JLabel question = new JLabel();
        question.setText("新しくJR東海道線に駅ができます、その駅の名前はなんでしょう");
        question.setFont(new Font("メイリオ",Font.BOLD,20));
        frame.add(question);
        frame.setVisible(true);

        FlowLayout setLayout = (new FlowLayout());
        button1 = new JButton("1.きさらぎ駅");
        button1.setPreferredSize(new Dimension(150,40));
        button1.addActionListener(this);
        button2 = new JButton("2.村岡新駅");
        button2.setPreferredSize(new Dimension(150,40));
        button2.addActionListener(this);
        button3 = new JButton("3.新横浜駅");
        button3.setPreferredSize(new Dimension(150,40));
        button3.addActionListener(this);
        panel.add(button1,BorderLayout.SOUTH);
        panel.add(button2,BorderLayout.SOUTH);
        panel.add(button3,BorderLayout.SOUTH);
        frame.getContentPane().add(panel,BorderLayout.CENTER);;
    }

public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if(e.getSource() == button2){
        JFrame frame=new JFrame();
        frame.setTitle("win");
        frame.setSize(1280,720);
        JLabel question = new JLabel();
        question.setText("win");
        question.setFont(new Font("メイリオ",Font.BOLD,20));
        frame.add(question);
        frame.setVisible(true);
        } else {
            JFrame frame=new JFrame();
        frame.setTitle("lose");
        frame.setSize(1280,720);
        JLabel question = new JLabel();
        question.setText("lose");
        question.setFont(new Font("メイリオ",Font.BOLD,20));
        frame.add(question);
        frame.setVisible(true);
        }
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
public class kuizu {
    public static void main(String[] args) {
        window wind = new window();
    }
}