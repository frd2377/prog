package Ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejemplo7_varibalesArgs.Promedio;
import patron_generico.Generica;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Generica<Promedio> datosEstudiantes =new Generica<Promedio>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estudiante:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(25, 44, 86, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Notas:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(25, 109, 86, 32);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textEstudiante = new JTextPane();
		textEstudiante.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textEstudiante.setBounds(106, 44, 312, 32);
		contentPane.add(textEstudiante);
		
		JTextPane textNotas = new JTextPane();
		textNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNotas.setBounds(106, 109, 312, 32);
		contentPane.add(textNotas);
		
		JList listEstudiantes = new JList();
		listEstudiantes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listEstudiantes.setBounds(466, 63, 270, 327);
		contentPane.add(listEstudiantes);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(313, 179, 105, 41);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_2 = new JLabel("Estudiante Promedio");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(495, 29, 208, 23);
		contentPane.add(lblNewLabel_2);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datosEstudiantes.addElemntos(new Promedio(textEstudiante.getText(),textNotas.getText()));
				listEstudiantes.setModel(datosEstudiantes.listarElementosList(datosEstudiantes.getElementos()));
			}
		});
	}
}
