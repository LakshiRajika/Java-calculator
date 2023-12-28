
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}

class cal implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    TextField tf, tf2;

    String fv, sv, op;

    double fdv, sdv, tot;

    cal() {

        Frame f1 = new Frame();

        f1.setBackground(Color.BLACK);
        f1.addWindowListener(new close());
        f1.setBounds(500, 500, 500, 500);
        f1.setTitle("MY CALCULATOR");

        MenuBar mbar = new MenuBar();

        MenuItem mi1 = new MenuItem("Dark Theme");
        mi1.setActionCommand("Dark");

        MenuItem mi2 = new MenuItem("Light Theme");
        mi2.setActionCommand("Light");

        MenuItem mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("Paste");
        MenuItem mi5 = new MenuItem("Help");
        MenuItem mi6 = new MenuItem("About");

        MenuItemListener menuItemListener = new MenuItemListener();

        mi1.addActionListener(menuItemListener);
        mi2.addActionListener(menuItemListener);

        Menu m1 = new Menu("View");
        m1.add(mi1);
        m1.add(mi2);

        Menu m2 = new Menu("Edit");
        m2.add(mi3);
        m2.add(mi4);

        Menu m3 = new Menu("Option");
        m3.add(mi5);
        m3.add(mi6);

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);

        f1.setMenuBar(mbar);

        b1 = new Button("x2");
        b2 = new Button("√x");
        b3 = new Button("%");
        b4 = new Button("C");
        b5 = new Button("7");
        b6 = new Button("8");
        b7 = new Button("9");
        b8 = new Button("÷");
        b9 = new Button("4");
        b10 = new Button("5");
        b11 = new Button("6");
        b12 = new Button("*");
        b13 = new Button("1");
        b14 = new Button("2");
        b15 = new Button("3");
        b16 = new Button("-");
        b17 = new Button("0");
        b18 = new Button(".");
        b19 = new Button("=");
        b20 = new Button("+");

        Font font1 = new Font("Comic Sans MS", Font.BOLD, 30);

        Font font2 = new Font("Comic Sans MS", Font.BOLD, 30);

        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font1);
        b11.setFont(font2);
        b12.setFont(font2);
        b13.setFont(font2);
        b14.setFont(font2);
        b15.setFont(font2);
        b16.setFont(font2);
        b17.setFont(font2);
        b18.setFont(font2);
        b19.setFont(font2);
        b20.setFont(font2);

        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.white);

        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.white);

        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.white);

        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.white);

        b5.setBackground(Color.DARK_GRAY);
        b5.setForeground(Color.white);

        b6.setBackground(Color.DARK_GRAY);
        b6.setForeground(Color.white);

        b7.setBackground(Color.DARK_GRAY);
        b7.setForeground(Color.white);

        b8.setBackground(Color.BLUE);
        b8.setForeground(Color.white);

        b9.setBackground(Color.DARK_GRAY);
        b9.setForeground(Color.white);

        b10.setBackground(Color.DARK_GRAY);
        b10.setForeground(Color.white);

        b11.setBackground(Color.DARK_GRAY);
        b11.setForeground(Color.white);

        b12.setForeground(Color.white);
        b12.setBackground(Color.BLUE);

        b13.setForeground(Color.white);
        b13.setBackground(Color.DARK_GRAY);

        b14.setForeground(Color.white);
        b14.setBackground(Color.DARK_GRAY);

        b15.setForeground(Color.white);
        b15.setBackground(Color.DARK_GRAY);

        b16.setForeground(Color.white);
        b16.setBackground(Color.BLUE);

        b17.setForeground(Color.white);
        b17.setBackground(Color.DARK_GRAY);

        b18.setForeground(Color.white);
        b18.setBackground(Color.DARK_GRAY);

        b19.setForeground(Color.white);
        b19.setBackground(Color.red);

        b20.setForeground(Color.white);
        b20.setBackground(Color.BLUE);

        tf = new TextField(30);

        Font font = new Font("Cambria Math", Font.BOLD, 30);

        tf.setFont(font);
        tf.setEditable(false);
        tf.setForeground(Color.white);
        tf.setBackground(Color.darkGray);

        tf2 = new TextField(30);
        tf2.setForeground(Color.white);
        tf2.setFont(new Font("Arial", Font.BOLD, 20));
        tf2.setEditable(false);
        tf2.setBackground(Color.black);

        Panel p2 = new Panel();

        Panel p3 = new Panel();

        p2.add(tf2, BorderLayout.NORTH);

        p2.add(tf, BorderLayout.SOUTH);

        GridLayout g2 = new GridLayout(2, 0, 1, 1);
        p2.setLayout(g2);

        GridLayout g1 = new GridLayout(5, 4, 9, 9);

        p3.setLayout(g1);

        p3.setBackground(Color.black);

        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        p3.add(b10);
        p3.add(b11);
        p3.add(b12);
        p3.add(b13);
        p3.add(b14);
        p3.add(b15);
        p3.add(b16);
        p3.add(b17);
        p3.add(b18);
        p3.add(b19);
        p3.add(b20);

        f1.setLayout(new BorderLayout(15, 15));

        f1.add(p2, BorderLayout.NORTH);

        f1.add(p3, BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);

        f1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

        if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        } else if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals (b18)) {
            if (tf.getText().contains(".")) {
                return;
            } else {
                tf.setText(tf.getText() + ".");
            }
        }else if (o.equals(b4)) {
            tf.setText("");
            tf2.setText("");
        } else if (o.equals(b20)) {
            fv = tf.getText();
            tf.setText("");
            tf2.setText(fv + "+");

            op = b20.getLabel();

        } else if (o.equals(b16)) {
            fv = tf.getText();
            tf.setText("");
            tf2.setText(fv + "-");
            op = b16.getLabel();

        } else if (o.equals(b12)) {
            fv = tf.getText();
            tf.setText("");
            tf2.setText(fv + "*");
            op = b12.getLabel();

        } else if (o.equals(b8)) {
            fv = tf.getText();
            tf.setText("");
            tf2.setText(fv + "÷");
            op = b8.getLabel();

        } else if (o.equals(b3)) {
            fv = tf.getText();
            fdv = Double.parseDouble(tf.getText());
            tot = fdv / 100;
            tf.setText(Double.toString(tot));
            tf2.setText(fv + "%");
//            op = b3.getLabel();

        } else if (o.equals(b2)) {
            fv = tf.getText();
            fdv = Double.parseDouble(tf.getText());
            tot = Math.sqrt(fdv);
            tf.setText(Double.toString(tot));
            tf2.setText("√ " + fv);

        } else if (o.equals(b1)) {
            fv = tf.getText();
            fdv = Double.parseDouble(tf.getText());
            tot = Math.pow(fdv, 2);
            String string = Double.toString(tot);
            if (string.endsWith(".0")) {
                tf.setText(string.replace(".0", ""));
            } else {
                tf.setText(string);

            }
            tf2.setText("sqr" + "(" + fv + ")");

        } else if (o.equals(b19)) {
            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("-")) {

                tot = fdv - sdv;

                tf.setText(tot + "");

            } else if (op.equals("+")) {
                tot = fdv + sdv;

                tf.setText(tot + "");

            } else if (op.equals("*")) {
                tot = fdv * sdv;

                tf.setText(tot + "");

            } else if (op.equals("÷")) {
                tot = fdv / sdv;

                tf.setText(tot + "");

            } 
            tf2.setText(fv + op + sv);
            tot=fdv;

        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

    class MenuItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if ("Light".equals(e.getActionCommand())) {

                tf.setForeground(Color.black);
                tf.setBackground(Color.lightGray);

                b1.setBackground(Color.cyan);
                b1.setForeground(Color.black);

                b2.setBackground(Color.cyan);
                b2.setForeground(Color.black);

                b3.setBackground(Color.cyan);
                b3.setForeground(Color.black);

                b4.setBackground(Color.cyan);
                b4.setForeground(Color.black);

                b5.setBackground(Color.lightGray);
                b5.setForeground(Color.black);

                b6.setBackground(Color.lightGray);
                b6.setForeground(Color.black);

                b7.setBackground(Color.lightGray);
                b7.setForeground(Color.black);

                b8.setBackground(Color.cyan);
                b8.setForeground(Color.black);

                b9.setBackground(Color.lightGray);
                b9.setForeground(Color.black);

                b10.setBackground(Color.lightGray);
                b10.setForeground(Color.black);

                b11.setBackground(Color.lightGray);
                b11.setForeground(Color.black);

                b12.setForeground(Color.black);
                b12.setBackground(Color.cyan);

                b13.setForeground(Color.black);
                b13.setBackground(Color.LIGHT_GRAY);

                b14.setForeground(Color.black);
                b14.setBackground(Color.LIGHT_GRAY);

                b15.setForeground(Color.black);
                b15.setBackground(Color.lightGray);

                b16.setForeground(Color.black);
                b16.setBackground(Color.cyan);

                b17.setForeground(Color.black);
                b17.setBackground(Color.lightGray);

                b18.setForeground(Color.black);
                b18.setBackground(Color.lightGray);

                b19.setForeground(Color.black);
                b19.setBackground(Color.orange);

                b20.setForeground(Color.black);
                b20.setBackground(Color.cyan);

            } else if ("Dark".equals(e.getActionCommand())) {
                tf.setForeground(Color.white);
                tf.setBackground(Color.darkGray);

                b1.setBackground(Color.BLUE);
                b1.setForeground(Color.white);

                b2.setBackground(Color.BLUE);
                b2.setForeground(Color.white);

                b3.setBackground(Color.BLUE);
                b3.setForeground(Color.white);

                b4.setBackground(Color.BLUE);
                b4.setForeground(Color.white);

                b5.setBackground(Color.DARK_GRAY);
                b5.setForeground(Color.white);

                b6.setBackground(Color.DARK_GRAY);
                b6.setForeground(Color.white);

                b7.setBackground(Color.DARK_GRAY);
                b7.setForeground(Color.white);

                b8.setBackground(Color.BLUE);
                b8.setForeground(Color.white);

                b9.setBackground(Color.DARK_GRAY);
                b9.setForeground(Color.white);

                b10.setBackground(Color.DARK_GRAY);
                b10.setForeground(Color.white);

                b11.setBackground(Color.DARK_GRAY);
                b11.setForeground(Color.white);

                b12.setForeground(Color.white);
                b12.setBackground(Color.BLUE);

                b13.setForeground(Color.white);
                b13.setBackground(Color.DARK_GRAY);

                b14.setForeground(Color.white);
                b14.setBackground(Color.DARK_GRAY);

                b15.setForeground(Color.white);
                b15.setBackground(Color.DARK_GRAY);

                b16.setForeground(Color.white);
                b16.setBackground(Color.BLUE);

                b17.setForeground(Color.white);
                b17.setBackground(Color.DARK_GRAY);

                b18.setForeground(Color.white);
                b18.setBackground(Color.DARK_GRAY);

                b19.setForeground(Color.white);
                b19.setBackground(Color.red);

                b20.setForeground(Color.white);
                b20.setBackground(Color.BLUE);
            }
        }
    }

}

public class Calculator {

    public static void main(String[] args) {

        new cal();

    }

}
