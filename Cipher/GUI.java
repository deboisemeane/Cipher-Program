import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    JTextField encrypted;
    JTextField message;
    JTextField key;
    JButton Encrypt;
    JButton Decrypt;
    JLabel mLabel;
    JLabel emLabel;
    JLabel keyLabel;
    JRadioButton vignere;
    JRadioButton caesar;

    public static void main(String[] args)
    {
        new GUI().setVisible(true);
    }

    public GUI() {
        super("Cipher - by James");

        setSize(1200, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));

        Encrypt = new JButton("Encrypt");
        Encrypt.setActionCommand("Encrypt");
        Decrypt = new JButton("Decrypt");
        Decrypt.setActionCommand("Decrypt");
        Encrypt.addActionListener(this);
        Decrypt.addActionListener(this);

        message = new JTextField("",30);
        encrypted = new JTextField("",30);
        key = new JTextField("Key",10);
        mLabel = new JLabel("Message >");
        emLabel = new JLabel("Encrypted Message >");
        keyLabel = new JLabel("Key/Step >");

        vignere = new JRadioButton("Vignere");
        caesar = new JRadioButton("Caesar");
        ButtonGroup codes =  new ButtonGroup() ;
        vignere.addActionListener(this);
        caesar.addActionListener(this);
        codes.add(vignere);
        codes.add(caesar);



        add(Encrypt);
        add(Decrypt);
        add(mLabel);
        add(message);
        add(emLabel);
        add(encrypted);
        add(keyLabel);
        add(key);
        add(vignere);
        add(caesar);

    }


    @Override
    public void actionPerformed(ActionEvent e){
        String name = e.getActionCommand();
        System.out.println(name);
        boolean isVignere = vignere.isSelected();

        if(name.equals("Encrypt")){
            if (isVignere == true) {
                encrypted.setText(Varvill.encode(message.getText(), key.getText()));
            }
            else{
                encrypted.setText(Caesar.encode(message.getText(), Integer.parseInt(key.getText())));
            }
        }
        if(name.equals("Decrypt")) {
            if (isVignere == true) {
                message.setText(Varvill.decode(encrypted.getText(), key.getText()));
            } else {
                message.setText(Caesar.decode(encrypted.getText(), Integer.parseInt(key.getText())));
            }
        }

    }
}
