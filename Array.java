import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField number;
	private JTextField position;
	private JTextField deletepos;
	private JTextField display;
	private int rey[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(122, 11, 303, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Array Length :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(61, 49, 131, 17);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		length.setBackground(new Color(135, 206, 250));
		length.setBounds(202, 47, 86, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton CREATE_ARR_B = new JButton("Create Array");
		CREATE_ARR_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(length.getText());
				rey = new int[len];
				String mes = "Array of length "+len+" created";
				JOptionPane.showMessageDialog(contentPane, mes);
			}
		});
		CREATE_ARR_B.setBackground(new Color(169, 169, 169));
		CREATE_ARR_B.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		CREATE_ARR_B.setBounds(138, 77, 139, 29);
		contentPane.add(CREATE_ARR_B);
		
		JLabel element = new JLabel("Enter an integer Element : ");
		element.setFont(new Font("Times New Roman", Font.BOLD, 14));
		element.setBounds(2, 116, 190, 17);
		contentPane.add(element);
		
		number = new JTextField();
		number.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		number.setColumns(10);
		number.setBackground(new Color(135, 206, 250));
		number.setBounds(176, 117, 49, 19);
		contentPane.add(number);
		
		JLabel lblNewLabel_2 = new JLabel("Position : ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(244, 116, 69, 17);
		contentPane.add(lblNewLabel_2);
		
		position = new JTextField();
		position.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		position.setColumns(10);
		position.setBackground(new Color(135, 206, 250));
		position.setBounds(312, 114, 42, 20);
		contentPane.add(position);
		
		JButton INSERT_B = new JButton("INSERT");
		INSERT_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele = Integer.valueOf(number.getText());
				int pos =  Integer.valueOf(position.getText());
				rey[pos] = ele;
				String mes = "Element "+ele+" inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, mes);
				number.setText("");
				position.setText("");
			}
		});
		INSERT_B.setBackground(new Color(154, 205, 50));
		INSERT_B.setFont(new Font("Times New Roman", Font.BOLD, 16));
		INSERT_B.setBounds(377, 112, 103, 24);
		contentPane.add(INSERT_B);
		
		JLabel lblNewLabel_3 = new JLabel("Enter The Position : ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(47, 155, 145, 17);
		contentPane.add(lblNewLabel_3);
		
		JButton DELETE_B = new JButton("DELETE");
		DELETE_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = Integer.valueOf(deletepos.getText());
				String mes = "Element deleted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, mes);
				rey[pos] = 0;
				deletepos.setText("");
			}
		});
		DELETE_B.setFont(new Font("Times New Roman", Font.BOLD, 16));
		DELETE_B.setBackground(new Color(255, 0, 0));
		DELETE_B.setBounds(273, 153, 124, 21);
		contentPane.add(DELETE_B);
		
		deletepos = new JTextField();
		deletepos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		deletepos.setColumns(10);
		deletepos.setBackground(new Color(135, 206, 250));
		deletepos.setBounds(186, 153, 57, 20);
		contentPane.add(deletepos);
		
		JButton DISPLAY_B = new JButton("DISPLAY");
		DISPLAY_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s ="";
				for(int i=0;i<=rey.length-1;i++)
				{
					s = s+ String.valueOf(rey[i])+"  ";
				}
				display.setText(s);
			}
		});
		DISPLAY_B.setFont(new Font("Times New Roman", Font.BOLD, 16));
		DISPLAY_B.setBackground(new Color(255, 255, 0));
		DISPLAY_B.setBounds(149, 183, 128, 29);
		contentPane.add(DISPLAY_B);
		
		display = new JTextField();
		display.setBackground(new Color(240, 255, 255));
		display.setFont(new Font("Times New Roman", Font.BOLD, 12));
		display.setBounds(100, 230, 242, 20);
		contentPane.add(display);
		display.setColumns(10);
	}
}
