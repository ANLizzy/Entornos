import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	
	public float primernumero;
	public float segundonumero;
	public String operador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		caja = new JTextField();
		caja.setBounds(10, 21, 353, 46);
		contentPane.add(caja);
		caja.setColumns(10);
		
		
		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"7");
			}
		});
		siete.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		siete.setBounds(29, 170, 61, 58);
		contentPane.add(siete);

		
		
		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"8");
			}
		});
		ocho.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		ocho.setBounds(114, 170, 61, 58);
		contentPane.add(ocho);
		
		
		
		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"9");
			}
		});
		nueve.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		nueve.setBounds(198, 170, 61, 58);
		contentPane.add(nueve);
		
		
		
		JButton mas = new JButton("+");
		mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero=Float.parseFloat(caja.getText());
				operador="+";
				caja.setText("");
			}
		});
		mas.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		mas.setBounds(285, 170, 61, 143);
		contentPane.add(mas);
		
		
		
		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"4");
			}
		});
		cuatro.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		cuatro.setBounds(29, 255, 61, 58);
		contentPane.add(cuatro);
		
		
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"5");
			}
		});
		cinco.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		cinco.setBounds(114, 255, 61, 58);
		contentPane.add(cinco);
		
		
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"6");
			}
		});
		seis.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		seis.setBounds(198, 255, 61, 58);
		contentPane.add(seis);
		
		
		
		JButton por = new JButton("*");
		por.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero=Float.parseFloat(caja.getText());
				operador="*";
				caja.setText("");
			}
		});
		por.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		por.setBounds(198, 92, 61, 58);
		contentPane.add(por);
		
		
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"1");
			}
		});
		uno.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		uno.setBounds(29, 340, 61, 58);
		contentPane.add(uno);
		
		
		
		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"2");
			}
		});
		dos.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		dos.setBounds(114, 340, 61, 58);
		contentPane.add(dos);
		
		
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"3");
			}
		});
		tres.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		tres.setBounds(198, 340, 61, 58);
		contentPane.add(tres);
		
		
		
		JButton menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero=Float.parseFloat(caja.getText());
				operador="-";
				caja.setText("");
			}
		});
		menos.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		menos.setBounds(285, 92, 61, 58);
		contentPane.add(menos);
		
		
		
		JButton cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText()+"0");
			}
		});
		cero.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		cero.setBounds(29, 424, 151, 58);
		contentPane.add(cero);
		
		
		
		JButton coma = new JButton(".");
		coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(caja.getText().contains("."))) {
					caja.setText(caja.getText()+".");
				}
			}
		});
		coma.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		coma.setBounds(198, 424, 61, 58);
		contentPane.add(coma);
		
		
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundonumero=Float.parseFloat(caja.getText());
				switch(operador) {
				case "+":
					caja.setText(Float.toString(primernumero+segundonumero));
				break;
				case "-":
					caja.setText(Float.toString(primernumero-segundonumero));
				break;
				case "/":
					caja.setText(Float.toString(primernumero/segundonumero));
				break;
				case "*":
					caja.setText(Float.toString(primernumero*segundonumero));
				break;
				}
			}
		});
		igual.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		igual.setBounds(285, 340, 61, 142);
		contentPane.add(igual);
		
		
		
		JButton dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero=Float.parseFloat(caja.getText());
				operador="/";
				caja.setText("");
			}
		});
		dividir.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		dividir.setBounds(114, 92, 61, 58);
		contentPane.add(dividir);
		
		
		
		JButton borrar = new JButton("C");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText("");
			}
		});
		borrar.setFont(new Font("Arial Nova Cond", Font.BOLD, 22));
		borrar.setBounds(29, 92, 61, 58);
		contentPane.add(borrar);

	}
}
