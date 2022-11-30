package Modulo08;

import javax.swing.JOptionPane;

public class Aula11 {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
		
		int carrosNumero = Integer.parseInt(carros);
		int pessoasNumero = Integer.parseInt(pessoas);
		
		int divisao = carrosNumero / pessoasNumero;
		int resto = carrosNumero % pessoasNumero;
		
		JOptionPane.showMessageDialog(null, "Dividindo " + carrosNumero + " carros para "
				+ pessoasNumero + " pessoas, cada pessoa fica com " + divisao +
				" carros e sobram "		+ resto + " carros.");
		
		
	}
	
}
