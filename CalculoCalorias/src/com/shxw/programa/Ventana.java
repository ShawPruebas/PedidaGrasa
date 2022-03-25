package com.shxw.programa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Ventana extends JFrame {

	protected JPanel contentPane;
	protected JTextField Peso;
	protected JTextField grasa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Perdida de grasa corporal (Shxw)");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel peso = new JLabel("Peso: ");
		peso.setBounds(20, 11, 46, 14);
		contentPane.add(peso);
		
		Peso = new JTextField();
		Peso.setBounds(60, 8, 46, 20);
		contentPane.add(Peso);
		Peso.setColumns(10);
		
		JLabel actividad = new JLabel("Actividad:");
		actividad.setBounds(115, 11, 64, 14);
		contentPane.add(actividad);
		
		JComboBox Actividad = new JComboBox();
		Actividad.setModel(new DefaultComboBoxModel(new String[] {"1.2", "1.375", "1.55", "1.725", "1.9"}));
		Actividad.setBounds(179, 7, 62, 22);
		contentPane.add(Actividad);
		
		JLabel label = new JLabel("New label");
		label.setBounds(20, 49, 15, 1);
		contentPane.add(label);
		
		
		
		JLabel Grasa = new JLabel("Porcentaje de grasa");
		Grasa.setHorizontalAlignment(SwingConstants.CENTER);
		Grasa.setBounds(20, 42, 216, 35);
		contentPane.add(Grasa);
		
		grasa = new JTextField();
		grasa.setBounds(76, 69, 103, 20);
		contentPane.add(grasa);
		grasa.setColumns(10);
		

		
		JLabel lblNewLabel = new JLabel("(1.55) Moderada");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(310, 75, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblActividad = new JLabel("ACTIVIDAD");
		lblActividad.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividad.setBounds(286, 28, 138, 14);
		contentPane.add(lblActividad);
		
		JLabel lblActiva = new JLabel("(1.725) Activa");
		lblActiva.setHorizontalAlignment(SwingConstants.LEFT);
		lblActiva.setBounds(310, 88, 97, 14);
		contentPane.add(lblActiva);
		
		JLabel lblMuyActiva = new JLabel("(1.9) Muy activa");
		lblMuyActiva.setHorizontalAlignment(SwingConstants.LEFT);
		lblMuyActiva.setBounds(310, 100, 97, 14);
		contentPane.add(lblMuyActiva);
		
		JLabel lblLgera = new JLabel("(1.375) L\u00EDgera");
		lblLgera.setHorizontalAlignment(SwingConstants.LEFT);
		lblLgera.setBounds(310, 63, 97, 14);
		contentPane.add(lblLgera);
		
		JLabel lblMuyLigera = new JLabel("(1.2) Muy ligera");
		lblMuyLigera.setHorizontalAlignment(SwingConstants.LEFT);
		lblMuyLigera.setBounds(310, 49, 97, 14);
		contentPane.add(lblMuyLigera);
		
		JTextPane resultado = new JTextPane();
		resultado.setEditable(false);
		resultado.setText("");
		resultado.setBounds(10, 177, 397, 185);
		contentPane.add(resultado);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculo c = new Calculo();
				int act = Actividad.getSelectedIndex();
				resultado.setText(c.calculoCalorias(Peso.getText(),grasa.getText(),act));
			}
		});
		btnNewButton.setBounds(10, 131, 231, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
