package calc;

/**
 * 
 * @author Silvio S. Silva.
 * @versão 0.1
 */


// IMPORTS BÁSICOS
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
public class Calculadora extends JFrame {
	
	private JTextField display;
	private JButton numero1, numero2, numero3, numero4, numero5,numero6, numero7, numero8, numero9, numero0;
	private JButton dividir, multiplicar, subtrair, somar, igual, limpar;
	
	private int leitura; 
	private int memoria;
	private char operacao;
		
	public Calculadora() {
		
		Color cinza_escuro = new Color(59,59,59);
		Color cinza = new Color(32,32,32);
		
		//LAYOUT CALCULADORA
		this.setTitle("CALCULADORA");
		this.setBounds(402, 655, 485, 580);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(cinza);
	
        //PARTE ME QUE APARECE O TEXTO
        display = new JTextField();
        display.setHorizontalAlignment(leitura);
        display.setFont(new Font("Segoe", Font.BOLD, 40) );
        display.setForeground(Color.white);
        display.setBackground(cinza);
        display.setBounds(3, 30, 462, 159);
        this.add(display);
        
        // PRIMEIRA LINHA
        numero7 = new JButton();
        numero7.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero7.setText("7");
        numero7.setBounds(10, 200, 104, 70);
        numero7.setBackground(cinza_escuro);
        numero7.setForeground(Color.white);
        this.add(numero7);
        
        numero8 = new JButton();
        numero8.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero8.setText("8");
        numero8.setBounds(125, 200, 104, 70);
        numero8.setBackground(cinza_escuro);
        numero8.setForeground(Color.white);
        this.add(numero8);
        
        numero9 = new JButton();
        numero9.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero9.setText("9");
        numero9.setBounds(240, 200, 104,70);
        numero9.setBackground(cinza_escuro);
        numero9.setForeground(Color.white);
        this.add(numero9);
        
        multiplicar = new JButton();
        multiplicar.setFont(new Font("Segoe", Font.BOLD, 15));
        multiplicar.setText("*");
        multiplicar.setBounds(355, 200, 104,70);
        multiplicar.setBackground(cinza_escuro);
        multiplicar.setForeground(Color.white);
        this.add(multiplicar);
        // SEGUNDA LINHA
        
        numero4 = new JButton();
        numero4.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero4.setText("4");
        numero4.setBounds(10, 285, 104, 70);
        numero4.setBackground(cinza_escuro);
        numero4.setForeground(Color.white);
        this.add(numero4);
        
        numero5 = new JButton();
        numero5.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero5.setText("5");
        numero5.setBounds(125, 285, 104, 70);
        numero5.setBackground(cinza_escuro);
        numero5.setForeground(Color.white);
        this.add(numero5);
        
        numero6 = new JButton();
        numero6.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero6.setText("6");
        numero6.setBounds(240, 285, 104, 70);
        numero6.setBackground(cinza_escuro);
        numero6.setForeground(Color.white);
        this.add(numero6);
        
        subtrair = new JButton();
        subtrair.setFont(new Font("Segoe", Font.BOLD, 15));
        subtrair.setText("-");
        subtrair.setBounds(355, 285, 104,70);
        subtrair.setBackground(cinza_escuro);
        subtrair.setForeground(Color.white);
        this.add(subtrair);
        
        // TERCEIRA LINHA
        
        numero1 = new JButton();
        numero1.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero1.setText("1");
        numero1.setBounds(10, 365, 104, 70);
        numero1.setBackground(cinza_escuro);
        numero1.setForeground(Color.white);
        this.add(numero1);
        
        numero2 = new JButton();
        numero2.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero2.setText("2");
        numero2.setBounds(125, 365, 104, 70);
        numero2.setBackground(cinza_escuro);
        numero2.setForeground(Color.white);
        this.add(numero2);
        
        numero3 = new JButton();
        numero3.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero3.setText("3");
        numero3.setBounds(240, 365, 104, 70);
        numero3.setBackground(cinza_escuro);
        numero3.setForeground(Color.white);
        this.add(numero3);
        
        somar = new JButton();
        somar.setFont(new Font("Segoe", Font.BOLD, 15) );
        somar.setText("+");
        somar.setBounds(355, 365, 104, 70);
        somar.setBackground(cinza_escuro);
        somar.setForeground(Color.white);
        this.add(somar);
        
        // QUARTA LINHA
        
        numero0 = new JButton();
        numero0.setFont(new Font("Segoe", Font.BOLD, 15) );
        numero0.setText("0");
        numero0.setBounds(125, 445, 104, 70);
        numero0.setBackground(cinza_escuro);
        numero0.setForeground(Color.white);
        this.add(numero0);
        
        dividir = new JButton();
        dividir.setFont(new Font("Segoe", Font.BOLD, 15) );
        dividir.setText("/");
        dividir.setBounds(240, 445, 104, 70);
        dividir.setBackground(cinza_escuro);
        dividir.setForeground(Color.white);
        this.add(dividir);
        
        igual = new JButton();
        igual.setFont(new Font("Segoe", Font.BOLD, 15) );
        igual.setText("=");
        igual.setBounds(355, 445, 104, 70);
        igual.setBackground(cinza_escuro);
        igual.setForeground(Color.white);
        this.add(igual);
        
        limpar = new JButton();
        limpar.setFont(new Font("Segoe", Font.BOLD, 15) );
        limpar.setText("<-");
        limpar.setBounds(10, 445, 104, 70);
        limpar.setBackground(cinza_escuro);
        limpar.setForeground(Color.white);
        this.add(limpar);
        
        
        // FUNCÕES PRA IMPRIMIR O NÚMERO NO TEXTO
        numero7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 7;
                display.setText(display.getText() + "7");
        	}
        });
	
        numero8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 8;
                display.setText(display.getText() + "8");
        	}
        });
	
        numero9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 9;
                display.setText(display.getText() + "9");
        	}
        });
	
        numero4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 4;
                display.setText(display.getText() + "4");
        	}
        });
        
        numero5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 5;
                display.setText(display.getText() + "5");
        	}
        });
        
        numero6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 6;
                display.setText(display.getText() + "6");
        	}
        });
	
        numero1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 1;
                display.setText(display.getText() + "1");
        	}
        });
        
        numero2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 2;
                display.setText(display.getText() + "2");
        	}
        });
        
        numero3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 3;
                display.setText(display.getText() + "3");
        	}
        });
        
        numero0.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		leitura *= 10;
                leitura += 0;
                display.setText(display.getText() + "0");
        	}
        });
	
        // OPERAÇÕES MATEMÁTICAS
        
        somar.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent evt) {
        		operacao = '+';
        		memoria += memoria;
        		leitura = 0;
        		display.setText(memoria + " + ");
        	}
        });
	
        subtrair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		operacao = '-';
        		memoria += memoria;
        		leitura = 0;
        		display.setText(memoria + "-");
        	}
        });
        
        multiplicar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		operacao = 'X';
        		memoria += leitura;
        		leitura = 0;
        		display.setText(memoria + "*");
        	}
        });
        
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '/';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + "/");
            }
        });
        
        limpar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		operacao = '<';
        		leitura = 0;
        		display.setText(" ");
        		memoria = 0;
        	}
        });
        
        //FUNÇÃO QUE RESULTA AS OPERAÇÃO
        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case '.': {
                        memoria = memoria + '.';
                        break;
                    }
                    case '<': {
                    	memoria = 0;
                    	break;
                    }
                    case '+': {
                        memoria += leitura;
                        break;
                    }
                    
                    case '-': {
                        memoria -= leitura;
                        break;
                    }
                    
                    case 'X': {
                        memoria *= leitura;
                        break;
                    }
                    
                    case '/': {
                        memoria /= leitura;
                        break;
                    }
                }
                leitura = 0;
                display.setText(" " + memoria);
            }
        });
	}

	public static void main(String[] args) {
	        Calculadora exemplo = new Calculadora();
	        exemplo.setVisible(true);
	}
}
