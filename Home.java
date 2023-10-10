import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(224, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(171, 11, 303, 21);
		contentPane.add(lblNewLabel);
		
		JButton ARRAY = new JButton("ARRAY");
		ARRAY.setBackground(new Color(220, 20, 60));
		ARRAY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Array r = new Array();
				//r.setVisible(true);	
				new Array().setVisible(true);
			}
		});
		ARRAY.setFont(new Font("Times New Roman", Font.BOLD, 16));
		ARRAY.setBounds(232, 57, 110, 23);
		contentPane.add(ARRAY);
		
		JButton STACK = new JButton("STACK");
		STACK.setBackground(new Color(100, 149, 237));
		STACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
			}
		});
		STACK.setFont(new Font("Times New Roman", Font.BOLD, 16));
		STACK.setBounds(103, 112, 110, 23);
		contentPane.add(STACK);
		
		JButton QUEUE = new JButton("QUEUE");
		QUEUE.setBackground(new Color(255, 99, 71));
		QUEUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		QUEUE.setFont(new Font("Times New Roman", Font.BOLD, 16));
		QUEUE.setBounds(368, 112, 115, 23);
		contentPane.add(QUEUE);
		
		JButton CIRCULAR_QUEUE = new JButton("CIRCULAR QUEUE");
		CIRCULAR_QUEUE.setBackground(new Color(255, 255, 102));
		CIRCULAR_QUEUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CircularQueue().setVisible(true);
			}
		});
		CIRCULAR_QUEUE.setFont(new Font("Times New Roman", Font.BOLD, 16));
		CIRCULAR_QUEUE.setBounds(37, 179, 221, 29);
		contentPane.add(CIRCULAR_QUEUE);
		
		JButton SINGLY_LINKED_LIST = new JButton("SINGLY LINKED LIST");
		SINGLY_LINKED_LIST.setBackground(new Color(50, 205, 50));
		SINGLY_LINKED_LIST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SinglyLinkedList().setVisible(true);
			}
		});
		SINGLY_LINKED_LIST.setFont(new Font("Times New Roman", Font.BOLD, 16));
		SINGLY_LINKED_LIST.setBounds(312, 179, 230, 29);
		contentPane.add(SINGLY_LINKED_LIST);
		
		JButton DOUBLY_LINKED_LIST = new JButton("DOUBLY LINKED LIST");
		DOUBLY_LINKED_LIST.setBackground(new Color(240, 230, 140));
		DOUBLY_LINKED_LIST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DoublyLinkedList().setVisible(true);
			}
		});
		DOUBLY_LINKED_LIST.setFont(new Font("Times New Roman", Font.BOLD, 16));
		DOUBLY_LINKED_LIST.setBounds(170, 252, 221, 29);
		contentPane.add(DOUBLY_LINKED_LIST);
	}
}
