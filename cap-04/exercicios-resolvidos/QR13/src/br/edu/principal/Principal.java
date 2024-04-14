package br.edu.principal;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] choices = {"1", "2", "3"};
		int escolha = JOptionPane.showOptionDialog(
                null
              , "1. Imposto" + "\r\n" + "2. Novo salário" + "\r\n" + "3. Classificação"       
              , "MENU"              
              , JOptionPane.YES_NO_CANCEL_OPTION  
              , JOptionPane.PLAIN_MESSAGE                               
              , null 
              , choices
              , "" 
            );
		if (escolha == JOptionPane.YES_OPTION ) {
			
			String resposta = JOptionPane.showInputDialog(
		            null, "Digite seu salário", "MENU -> IMPOSTO", 1);
			float salário = Float.valueOf(resposta);
			if(salário < 500) {
				double imposto = 0.05*salário;
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"O valor do seu imposto é de "+imposto);
			}
			else if(salário>=500 && salário<=850) {
				double imposto = 0.01*salário;
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"O valor do seu imposto é de "+imposto);
			}
			else {
				double imposto = 0.15*salário;
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"O valor do seu imposto é de "+imposto);
			}
		}
		else if(escolha == JOptionPane.NO_OPTION ) {
			String resposta = JOptionPane.showInputDialog(
		            null, "Digite seu salário", "MENU -> NOVO_SALÁRIO", 1);
			float salário = Float.valueOf(resposta);
			if(salário>1500) {
				double n_salário = salário+25;
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"O valor do seu novo salário é de "+n_salário);
			}
			else if(salário>=750 && salário<=1500) {
				double n_salário = salário+50;
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"O valor do seu novo salário é de "+n_salário);
			}
			else if(salário>=450 && salário<750) {
				double n_salário = salário+75;
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"O valor do seu novo salário é de "+n_salário);
			}
			else {
				double n_salário = salário+100;
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"O valor do seu novo salário é de "+n_salário);
			}
		}
		else {
			String resposta = JOptionPane.showInputDialog(
		            null, "Digite seu salário", "MENU -> CLASSIFICAÇÃO", 1);
			float salário = Float.valueOf(resposta);
			if(salário<=750) {
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"Classificação: Mal remunerado");
			}
			else {
				JFrame frame = new JFrame("JOptionPane showMessageDialog example");
				JOptionPane.showMessageDialog(frame,
						"Classificação: Bem remunerado");
			}
		}
		sc.close();
	}
}


