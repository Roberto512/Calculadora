/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Roberto
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Bocarando
 */
public class Pantalla extends JFrame implements ActionListener {

    private JTextField entrada;
    private JButton botones[] = new JButton[23];
    private String acumulador = "";

    public Pantalla() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(360, 650);
        this.setTitle("Calculadora Bocarando");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new java.awt.Color(16, 17, 17));
        entrada = new JTextField();
        this.add(entrada);
        entrada.setBounds(25, 25, 310, 70);
        Font f1 = new Font("Cambria", Font.ITALIC, 35);
        entrada.setFont(f1);
        entrada.setBackground(new java.awt.Color(216, 233, 231));
        entrada.setHorizontalAlignment(JTextField.RIGHT);
        entrada.setEnabled(false);
        entrada.setText("0");
        this.establecerBotones();
        this.acciones();
        this.setVisible(true);
    }

    private void acciones() {
        for (int i = 0; i < botones.length; i++) {
            this.botones[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    numerosactionPerformed(e);

                }
            });
        }
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void numerosactionPerformed(ActionEvent e) {
        if (e.getSource() == botones[0]) {
            String numero = "9";
            this.acumulador = acumulador + numero;
            entrada.setText(acumulador);
        } else {
            if (e.getSource() == botones[1]) {
                String numero = "8";
                this.acumulador = acumulador + numero;
                entrada.setText(acumulador);
            } else {
                if (e.getSource() == botones[2]) {
                    String numero = "7";
                    this.acumulador = acumulador + numero;
                    entrada.setText(acumulador);
                } else {
                    if (e.getSource() == botones[3]) {
                        String numero = "/";
                        this.acumulador = acumulador + numero;
                        entrada.setText(acumulador);
                    } else {
                        if (e.getSource() == botones[4]) {
                            String numero = "6";
                            this.acumulador = acumulador + numero;
                            entrada.setText(acumulador);
                        } else {
                            if (e.getSource() == botones[5]) {
                                String numero = "5";
                                this.acumulador = acumulador + numero;
                                entrada.setText(acumulador);
                            } else {
                                if (e.getSource() == botones[6]) {
                                    String numero = "4";
                                    this.acumulador = acumulador + numero;
                                    entrada.setText(acumulador);
                                } else {
                                    if (e.getSource() == botones[7]) {
                                        String numero = "+";
                                        this.acumulador = acumulador + numero;
                                        entrada.setText(acumulador);
                                    } else {
                                        if (e.getSource() == botones[8]) {
                                            String numero = "3";
                                            this.acumulador = acumulador + numero;
                                            entrada.setText(acumulador);
                                        } else {
                                            if (e.getSource() == botones[9]) {
                                                String numero = "2";
                                                this.acumulador = acumulador + numero;
                                                entrada.setText(acumulador);
                                            } else {
                                                if (e.getSource() == botones[10]) {
                                                    String numero = "1";
                                                    this.acumulador = acumulador + numero;
                                                    entrada.setText(acumulador);
                                                } else {
                                                    if (e.getSource() == botones[11]) {
                                                        String numero = "-";
                                                        this.acumulador = acumulador + numero;
                                                        entrada.setText(acumulador);
                                                    } else {
                                                        if (e.getSource() == botones[12]) {
                                                            String numero = "(";
                                                            this.acumulador = acumulador + numero;
                                                            entrada.setText(acumulador);
                                                        } else {
                                                            if (e.getSource() == botones[13]) {
                                                                String numero = ")";
                                                                this.acumulador = acumulador + numero;
                                                                entrada.setText(acumulador);
                                                            } else {
                                                                if (e.getSource() == botones[14]) {
                                                                    String numero = "0";
                                                                    this.acumulador = acumulador + numero;
                                                                    entrada.setText(acumulador);
                                                                } else {
                                                                    if (e.getSource() == botones[15]) {
                                                                        String numero = "*";
                                                                        this.acumulador = acumulador + numero;
                                                                        entrada.setText(acumulador);
                                                                    } else {
                                                                        if (e.getSource() == botones[16]) {
                                                                            String numero = "Sen ";
                                                                            this.acumulador = acumulador + numero;
                                                                            entrada.setText(acumulador);
                                                                        } else {
                                                                            if (e.getSource() == botones[17]) {
                                                                                String numero = "Cos ";
                                                                                this.acumulador = acumulador + numero;
                                                                                entrada.setText(acumulador);
                                                                            } else {
                                                                                if (e.getSource() == botones[18]) {
                                                                                    String numero = "Tan ";
                                                                                    this.acumulador = acumulador + numero;
                                                                                    entrada.setText(acumulador);
                                                                                } else {
                                                                                    if (e.getSource() == botones[19]) {
                                                                                        String numero = "^";
                                                                                        this.acumulador = acumulador + numero;
                                                                                        entrada.setText(acumulador);
                                                                                    } else {
                                                                                        if (e.getSource() == botones[20]) {
                                                                                            acumulador = acumulador.substring(0, acumulador.length() - 1);
                                                                                            entrada.setText(acumulador);
                                                                                        } else {
                                                                                            if (e.getSource() == botones[21]) {
                                                                                                entrada.setText("0");
                                                                                                acumulador = "";
                                                                                            } else {
                                                                                                if (e.getSource() == botones[22]) {
                                                                                                    Calculadora c1 = new Calculadora();
                                                                                                    String a;
                                                                                                    a = c1.operacion(c1.calcular(acumulador));
                                                                                                    entrada.setText(a);
                                                                                                    acumulador = "";
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void establecerBotones() {
        Integer x = 0, x2 = 0, y = 0;
        for (int i = 0; i < botones.length; i++) {

            switch (i) {
                case 3:
                    this.botones[i] = new JButton("/");
                    x2 = 1;
                    break;
                case 7:
                    this.botones[i] = new JButton("+");
                    x2 = 2;
                    break;
                case 11:
                    this.botones[i] = new JButton("-");
                    break;
                case 12:
                    this.botones[i] = new JButton("(");
                    break;
                case 13:
                    this.botones[i] = new JButton(")");
                    break;
                case 14:
                    this.botones[i] = new JButton("0");
                    break;
                case 15:
                    this.botones[i] = new JButton("*");
                    break;
                case 16:
                    this.botones[i] = new JButton("Sen");
                    break;
                case 17:
                    this.botones[i] = new JButton("Cos");
                    break;
                case 18:
                    this.botones[i] = new JButton("Tan");
                    break;
                case 19:
                    this.botones[i] = new JButton("^");
                    break;
                case 20:
                    this.botones[i] = new JButton("Del");
                    break;
                case 21:
                    this.botones[i] = new JButton("Ac");
                    break;
                case 22:
                    this.botones[i] = new JButton("=");
                    break;
                default:
                    Integer numero = 9 - i + x2;
                    String suma = numero + "";
                    this.botones[i] = new JButton(suma);
                    break;
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    x = x + 80;
                    break;
                case 4:
                    x = 0;
                    y = 80;
                    break;
                case 5:
                case 6:
                case 7:
                    x = x + 80;
                    break;
                case 8:
                    x = 0;
                    y = 160;
                    break;
                case 9:
                case 10:
                case 11:
                    x = x + 80;
                    break;
                case 12:
                    x = 0;
                    y = 240;
                    break;
                case 13:
                case 14:
                case 15:
                    x = x + 80;
                    break;
                case 16:
                    x = 0;
                    y = 320;
                    break;
                case 17:
                case 18:
                case 19:
                    x = x + 80;
                    break;
                case 20:
                    x = 0;
                    y = 400;
                    break;
                case 21:
                case 22:
                    x = x + 80;
                    break;

            }
            this.botones[i].setBounds(25 + x, 110 + y, 70, 70);
            this.add(botones[i]);

        }

    }
}
