import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int rey[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 309);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(150, 11, 279, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Stack Size :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(95, 62, 173, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBackground(new Color(224, 255, 255));
		length.setBounds(267, 63, 86, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Stack");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.valueOf(length.getText());
				rey = new int[size];
				String mes = "Stack of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane,mes );
			}
		});
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setBounds(188, 93, 111, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter An Element :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(95, 133, 149, 20);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBackground(new Color(224, 255, 255));
		element.setBounds(235, 134, 86, 20);
		contentPane.add(element);
		
		JButton PUSH = new JButton("PUSH");
		PUSH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "PUSH not possible");
				}
				else
				{
					top++;
					int ele = Integer.valueOf(element.getText());
					rey[top] = ele;
					JOptionPane.showMessageDialog(contentPane, "PUSH successful");
					element.setText("");
				}
			}
		});
		PUSH.setBackground(new Color(0, 100, 0));
		PUSH.setForeground(new Color(250, 240, 230));
		PUSH.setBounds(340, 133, 89, 23);
		contentPane.add(PUSH);
		
		JButton POP = new JButton("POP");
		POP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "POP not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,  "Element Deleted is "+rey[top]);
					top--;
				}
			}
		});
		POP.setForeground(new Color(250, 250, 210));
		POP.setBackground(new Color(255, 0, 0));
		POP.setBounds(210, 164, 89, 23);
		contentPane.add(POP);
		
		JButton Display_Button = new JButton("Display");
		Display_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				if(top==-1)
				{
					 JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						s=s+rey[i]+" ";
					}
					displaybox.setText(s);
				}
			}
		});
		Display_Button.setForeground(new Color(255, 0, 0));
		Display_Button.setBackground(new Color(255, 215, 0));
		Display_Button.setBounds(210, 198, 89, 23);
		contentPane.add(Display_Button);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(224, 255, 255));
		displaybox.setBounds(137, 239, 239, 20);
		contentPane.add(displaybox);
	}
}
