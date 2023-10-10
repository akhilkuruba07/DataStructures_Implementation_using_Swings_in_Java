import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField relement;
	private JTextField felement;
	private JTextField displaybox;
	private Node first;
	public class Node{
		int d;
		Node l;
	}
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(87, 11, 354, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Element : ");
		lblNewLabel_1.setForeground(new Color(153, 50, 204));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(40, 81, 162, 20);
		contentPane.add(lblNewLabel_1);
		
		relement = new JTextField();
		relement.setBounds(200, 82, 86, 20);
		contentPane.add(relement);
		relement.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter The Element : ");
		lblNewLabel_1_1.setForeground(new Color(153, 50, 204));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(40, 126, 162, 20);
		contentPane.add(lblNewLabel_1_1);
		
		felement = new JTextField();
		felement.setColumns(10);
		felement.setBounds(200, 127, 86, 20);
		contentPane.add(felement);
		
		JButton INSERT_REAR = new JButton("INSERT REAR");
		INSERT_REAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node newnode = new Node();
				int ele = Integer.valueOf(relement.getText());
				newnode.d=ele;
				newnode.l=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					Node temp = first;
					while(temp.l!=null)
					{
						temp = temp.l;
					}
					temp.l=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Insert Rear Successful");
				relement.setText("");
				
			}
		});
		INSERT_REAR.setFont(new Font("Times New Roman", Font.BOLD, 11));
		INSERT_REAR.setForeground(new Color(0, 100, 0));
		INSERT_REAR.setBounds(324, 82, 130, 21);
		contentPane.add(INSERT_REAR);
		
		JButton INSERT_FRONT = new JButton("INSERT FRONT");
		INSERT_FRONT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node newnode = new Node();
				int ele = Integer.valueOf(felement.getText());
				newnode.d=ele;
				newnode.l=null;
				if(first==null)
				{
					first = newnode;
				}
				else
				{
					newnode.l=first;
					first = newnode;
				}
				felement.setText("");
				JOptionPane.showMessageDialog(contentPane, "Insert Front Successfull");
			}
		});
		INSERT_FRONT.setForeground(new Color(0, 100, 0));
		INSERT_FRONT.setFont(new Font("Times New Roman", Font.BOLD, 11));
		INSERT_FRONT.setBounds(324, 126, 130, 23);
		contentPane.add(INSERT_FRONT);
		
		JButton DELETE_REAR = new JButton("DELETE REAR");
		DELETE_REAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not Possible");
				}
				else if(first.l==null)
				{
					first=null;
					JOptionPane.showMessageDialog(contentPane, "Delete Rear Successful");
				}
				else
				{
					Node temp = first;
					while(temp.l.l!=null)
					{
						temp = temp.l;
					}
					temp.l=null;
					JOptionPane.showMessageDialog(contentPane, "Delete Rear Successful");
				}
			}
		});
		DELETE_REAR.setFont(new Font("Times New Roman", Font.BOLD, 11));
		DELETE_REAR.setForeground(new Color(255, 0, 0));
		DELETE_REAR.setBounds(181, 174, 130, 23);
		contentPane.add(DELETE_REAR);
		
		JButton DELETE_FRONT = new JButton("DELETE FRONT");
		DELETE_FRONT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not Possible");
				}
				else if(first.l==null)
				{
					first=null;
					JOptionPane.showMessageDialog(contentPane, "Delete Front Sccessfuul");
				}
				else
				{
					first = first.l;
					JOptionPane.showMessageDialog(contentPane, "Delete Front Sccessfuul");
				}
			}
		});
		DELETE_FRONT.setForeground(new Color(255, 0, 0));
		DELETE_FRONT.setFont(new Font("Times New Roman", Font.BOLD, 11));
		DELETE_FRONT.setBounds(181, 219, 130, 23);
		contentPane.add(DELETE_FRONT);
		
		JButton DISPLAY = new JButton("DISPLAY");
		DISPLAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					displaybox.setText("");
					JOptionPane.showMessageDialog(contentPane, "Disply not Possible");
				}
				else if(first.l==null)
				{
					String s = String.valueOf(first.d);
					displaybox.setText(s);
				}
				else
				{
					Node temp = first;
					String s = "";
					while(temp!=null)
					{
						s = s+temp.d+" ";
						temp = temp.l;
					}
					displaybox.setText(s);
				}
			}
		});
		DISPLAY.setForeground(new Color(0, 0, 255));
		DISPLAY.setFont(new Font("Times New Roman", Font.BOLD, 11));
		DISPLAY.setBounds(200, 273, 91, 33);
		contentPane.add(DISPLAY);
		
		displaybox = new JTextField();
		displaybox.setBounds(100, 321, 307, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
