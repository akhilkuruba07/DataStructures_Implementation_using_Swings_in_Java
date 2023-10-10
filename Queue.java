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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField Displaybox;
	private int front=0;
	private int rer=-1;
	private int rey[];
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(94, 11, 262, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Queue Size : ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(53, 57, 149, 20);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBackground(new Color(0, 255, 255));
		length.setBounds(194, 58, 86, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createQueue = new JButton("Create Queue");
		createQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.valueOf(length.getText());
				rey = new int[size];
				JOptionPane.showMessageDialog(contentPane, "Queue of size "+size+" created");
			}
		});
		createQueue.setForeground(new Color(107, 142, 35));
		createQueue.setBackground(new Color(240, 248, 255));
		createQueue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		createQueue.setBounds(145, 88, 156, 25);
		contentPane.add(createQueue);
		
		JLabel lblNewLabel_2 = new JLabel("Enter An Element : ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(40, 127, 149, 20);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBackground(Color.CYAN);
		element.setBounds(177, 128, 86, 20);
		contentPane.add(element);
		
		JButton Insert = new JButton("INSERT");
		Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rer==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insert not  Possible");
				}
				else
				{
					int ele = Integer.valueOf(element.getText());
					rer++;
					rey[rer] = ele;
					JOptionPane.showMessageDialog(contentPane, "Insert Successful");
				}
				element.setText("");
			}
		});
		Insert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Insert.setForeground(new Color(240, 248, 255));
		Insert.setBackground(new Color(153, 50, 204));
		Insert.setBounds(290, 126, 89, 23);
		contentPane.add(Insert);
		
		JButton Delete = new JButton("DELETE");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rer==-1 || front>rer)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element "+rey[front]+" deleted ");
					front++;
				}
			}
		});
		Delete.setForeground(new Color(240, 248, 255));
		Delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Delete.setBackground(new Color(255, 0, 0));
		Delete.setBounds(177, 159, 106, 23);
		contentPane.add(Delete);
		
		JButton Display = new JButton("DISPLAY");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rer==-1 || front>rer)
				{
					Displaybox.setText("");
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					String s = "";
					for(int i=front;i<=rer;i++)
					{
						s=s+rey[i]+" ";
					}
					Displaybox.setText(s);
				}
			}
		});
		Display.setForeground(new Color(240, 248, 255));
		Display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Display.setBackground(new Color(64, 224, 208));
		Display.setBounds(177, 193, 106, 23);
		contentPane.add(Display);
		
		Displaybox = new JTextField();
		Displaybox.setColumns(10);
		Displaybox.setBackground(Color.CYAN);
		Displaybox.setBounds(99, 230, 268, 20);
		contentPane.add(Displaybox);
	}

}
