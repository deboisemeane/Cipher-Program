import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    JTextArea encrypted;
    JTextArea message;
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

        setSize(800, 300);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(1,2));
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(2,2));
        JPanel bottomLeft = new JPanel();
        bottomLeft.setLayout(new GridLayout(1,2));
        JPanel bottomRight = new JPanel();
        bottomRight.setLayout(new GridLayout(1,2));
        JPanel middle = new JPanel();
        middle.setLayout(new GridLayout(1,2,5,5));


        Encrypt = new JButton("Encrypt");
        Encrypt.setActionCommand("Encrypt");
        Decrypt = new JButton("Decrypt");
        Decrypt.setActionCommand("Decrypt");
        Encrypt.addActionListener(this);
        Decrypt.addActionListener(this);

        message = new JTextArea("");
        message.setLineWrap(true);
        encrypted = new JTextArea("");
        encrypted.setLineWrap(true);
        key = new JTextField("Key",10);
        mLabel = new JLabel("  Message ↓");
        emLabel = new JLabel("  Encrypted Message ↓");
        keyLabel = new JLabel("  Key/Step >");

        vignere = new JRadioButton("Vignere");
        caesar = new JRadioButton("Caesar");
        ButtonGroup codes =  new ButtonGroup() ;
        vignere.addActionListener(this);
        caesar.addActionListener(this);
        codes.add(vignere);
        codes.add(caesar);


        add(top, BorderLayout.PAGE_START);
        top.add(mLabel);
        top.add(emLabel);
        add(middle, BorderLayout.CENTER);
        middle.add(message);
        middle.add(encrypted);
        add(bottom, BorderLayout.PAGE_END);
        bottom.add(Encrypt);
        bottom.add(Decrypt);
        bottom.add(bottomLeft);
        bottom.add(bottomRight);
        bottomLeft.add(keyLabel);
        bottomLeft.add(key);
        bottomRight.add(vignere);
        vignere.setSelected(true);
        bottomRight.add(caesar);




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
