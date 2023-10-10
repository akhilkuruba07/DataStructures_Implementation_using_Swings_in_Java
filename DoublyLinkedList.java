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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private Node first;
	private JTextField relement;
	private JTextField felement;
	private JTextField displaybox;
	
	public class Node{
		int d;
		Node prelink;
		Node nextlink;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(54, 11, 370, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter An Element : ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 64, 149, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter An Element : ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 103, 149, 20);
		contentPane.add(lblNewLabel_1_1);
		
		relement = new JTextField();
		relement.setBackground(new Color(175, 238, 238));
		relement.setBounds(148, 65, 86, 20);
		contentPane.add(relement);
		relement.setColumns(10);
		
		felement = new JTextField();
		felement.setBackground(new Color(175, 238, 238));
		felement.setBounds(148, 104, 86, 20);
		contentPane.add(felement);
		felement.setColumns(10);
		
		JButton INSERT_REAR = new JButton("INSERT REAR");
		INSERT_REAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  ele = Integer.valueOf(relement.getText());
				Node newnode = new Node();
				newnode.d=ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					Node temp = first;
					while(temp.nextlink !=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
				relement.setText("");
				JOptionPane.showMessageDialog(contentPane, "Insert Rear Successful");
			}
		});
		INSERT_REAR.setForeground(new Color(224, 255, 255));
		INSERT_REAR.setFont(new Font("Times New Roman", Font.BOLD, 12));
		INSERT_REAR.setBackground(new Color(0, 128, 0));
		INSERT_REAR.setBounds(258, 64, 149, 23);
		contentPane.add(INSERT_REAR);
		
		JButton INSERT_FRONT = new JButton("INSERT FRONT");
		INSERT_FRONT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele = Integer.valueOf(felement.getText());
				Node newnode = new Node();
				newnode.d = ele;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
				felement.setText("");
				JOptionPane.showMessageDialog(contentPane, "Insert Front Successful");
			}
		});
		INSERT_FRONT.setForeground(new Color(224, 255, 255));
		INSERT_FRONT.setFont(new Font("Times New Roman", Font.BOLD, 12));
		INSERT_FRONT.setBackground(new Color(0, 128, 0));
		INSERT_FRONT.setBounds(258, 103, 149, 23);
		contentPane.add(INSERT_FRONT);
		
		JButton DELETE_REAR = new JButton("DELETE REAR");
		DELETE_REAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete Rear not Possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element "+first.d+" is deleted");
					first=null;
				}
				else
				{
					Node temp = first;
					while(temp.nextlink.nextlink != null)
					{
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Element "+temp.nextlink.d+" is deleted");
					temp.nextlink=null;	
				}
			}
		});
		DELETE_REAR.setFont(new Font("Times New Roman", Font.BOLD, 12));
		DELETE_REAR.setForeground(new Color(224, 255, 255));
		DELETE_REAR.setBackground(new Color(255, 0, 0));
		DELETE_REAR.setBounds(148, 152, 149, 23);
		contentPane.add(DELETE_REAR);
		
		JButton DELETE_FRONT = new JButton("DELETE FRONT");
		DELETE_FRONT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete Rear not Possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element "+first.d+" is deleted");
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element "+first.d+" is deleted");
					first = first.nextlink;
					first.prelink=null;
				}
			}
		});
		DELETE_FRONT.setFont(new Font("Times New Roman", Font.BOLD, 12));
		DELETE_FRONT.setForeground(new Color(224, 255, 255));
		DELETE_FRONT.setBackground(Color.RED);
		DELETE_FRONT.setBounds(148, 195, 149, 23);
		contentPane.add(DELETE_FRONT);
		
		JButton DISPLAY = new JButton("DISPLAY FORWARD");
		DISPLAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				if(first==null)
				{
					displaybox.setText("");
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
					
				}
				else if(first.nextlink==null)
				{
					s=s+first.d;
				}
				else
				{
					Node temp = first;
					while(temp != null)
					{
						s = s+temp.d+" ";
						temp=temp.nextlink;
					}
				}
				displaybox.setText(s);
			}
		});
		DISPLAY.setFont(new Font("Times New Roman", Font.BOLD, 12));
		DISPLAY.setBackground(new Color(255, 140, 0));
		DISPLAY.setBounds(24, 243, 163, 23);
		contentPane.add(DISPLAY);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(175, 238, 238));
		displaybox.setBounds(67, 288, 292, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				if(first==null)
				{
					displaybox.setText("");
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
					
				}
				else if(first.nextlink==null)
				{
					s=s+first.d;
				}
				else
				{
					Node temp = first;
					while(temp.nextlink !=null)
					{
						temp = temp.nextlink;
					}
					
					while(temp !=null)
					{
						s=s+temp.d+" ";
						temp = temp.prelink;
					}
					displaybox.setText(s);
				}
			}
		});
		btnDisplayReverse.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDisplayReverse.setBackground(new Color(255, 140, 0));
		btnDisplayReverse.setBounds(244, 243, 168, 23);
		contentPane.add(btnDisplayReverse);
	}

}
