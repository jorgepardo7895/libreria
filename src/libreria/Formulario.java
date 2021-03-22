package libreria;

import javax.swing.*;

public class Formulario extends JFrame{
	private JLabel label1;
	
	public Formulario() {
		setLayout(null);
		label1=new JLabel("Hola Mundo");
		label1.setBounds(50, 50, 150, 100);
		add(label1);
	}
	
	public static void main(String[] args) {
		Formulario formulario1 =new Formulario();
		formulario1.setBounds(10, 20, 300, 200);
		formulario1.setVisible(true);
		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
