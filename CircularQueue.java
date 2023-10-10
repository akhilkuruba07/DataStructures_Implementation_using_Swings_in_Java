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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int size;
	private int front=0;
	private int rer=-1;
	private int count=0;
	private int rey[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(39, 11, 347, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Queue Size : ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(55, 54, 121, 17);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(186, 53, 86, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createQueue = new JButton("CREATE QUEUE");
		createQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.valueOf(length.getText());
				rey = new int[size];
				JOptionPane.showMessageDialog(contentPane, "Queue of size "+size+" created");
			}
		});
		createQueue.setFont(new Font("Times New Roman", Font.BOLD, 14));
		createQueue.setForeground(new Color(0, 0, 139));
		createQueue.setBounds(146, 82, 175, 25);
		contentPane.add(createQueue);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter An Element : ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(55, 118, 124, 17);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setBounds(186, 118, 86, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insert not Possible");
				}
				else
				{
					int ele = Integer.valueOf(element.getText());
					rer = (rer+1)%size;
					rey[rer]=ele;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Element "+ele+" inserted");
				}
				element.setText("");
			}
		});
		insert.setForeground(new Color(0, 0, 139));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		insert.setBounds(297, 118, 89, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not Possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element "+rey[front]+" deleted");
					front = (front+1)%size;
					count--;
					
				}
			}
		});
		delete.setForeground(new Color(0, 0, 139));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delete.setBounds(165, 160, 103, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0)
				{
					displaybox.setText("");
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else
				{
					int f=front;
					String s = "";
					for(int i=1;i<=count;i++)
					{
						s=s+"  "+rey[f];
						f=(f+1)%size;
					}
					displaybox.setText(s);
				}
			}
		});
		display.setForeground(new Color(0, 0, 139));
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.setBounds(165, 194, 107, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(55, 230, 331, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
