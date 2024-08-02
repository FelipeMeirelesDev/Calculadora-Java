import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculadora {

    private Double total1 = 0.0;
    private Double total2 = 0.0;
    private char math_operator;

    private JPanel JavaCalculadora;
    private JTextField textoTela;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnZero;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPoint;

    private void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textoTela.getText());
        textoTela.setText("");
    }

    public JavaCalculadora() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textoTela.getText() + btnOne.getText();
                textoTela.setText(btnOneText);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textoTela.getText() + btnTwo.getText();
                textoTela.setText(btnTwoText);
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textoTela.getText() + btnThree.getText();
                textoTela.setText(btnThreeText);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textoTela.getText() + btnFour.getText();
                textoTela.setText(btnFourText);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textoTela.getText() + btnFive.getText();
                textoTela.setText(btnFiveText);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textoTela.getText() + btnSix.getText();
                textoTela.setText(btnSixText);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textoTela.getText() + btnSeven.getText();
                textoTela.setText(btnSevenText);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textoTela.getText() + btnEight.getText();
                textoTela.setText(btnEightText);
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textoTela.getText() + btnNine.getText();
                textoTela.setText(btnNineText);
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textoTela.getText() + btnZero.getText();
                textoTela.setText(btnZeroText);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);

            }
        });

        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textoTela.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textoTela.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textoTela.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textoTela.getText());
                        break;
                }

                textoTela.setText( Double.toString(total2));
                total1 = 0.0;
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0.0;
                textoTela.setText("");
            }
        });

        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textoTela.getText().equals("")) {
                    textoTela.setText("0.");
                } else if (textoTela.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = textoTela.getText() + btnPoint.getText();
                        textoTela.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculadora");
        frame.setContentPane(new JavaCalculadora().JavaCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
