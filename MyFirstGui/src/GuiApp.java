import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;


public class GuiApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiApp frame = new GuiApp();
					frame.setVisible(true);
					frame.setTitle("HelloCalum");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null); // to change layout
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(29, 82, 202, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnReverse = new JButton("Reverse");
		btnReverse.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// this is where the reverse button stuff happens when you click on it
				StringBuilder str = new StringBuilder(textField.getText());
				str.reverse();
				textField.setText(str.toString());
				textField_1.setText(str.toString());
			}
		});
		btnReverse.setBounds(305, 36, 89, 23);
		contentPane.add(btnReverse);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// this is where button stuff happens, when it is clicked
				textField.setText("");
				textField_1.setText(textField.getText());
			}
		});
		btnClear.setBounds(305, 93, 89, 23);
		contentPane.add(btnClear);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		textField_1.setBounds(29, 174, 179, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField.getText());
			}
		});
		btnTransfer.setBounds(305, 156, 89, 23);
		contentPane.add(btnTransfer);
		
		JLabel lblEnterYourName = new JLabel("Enter your name here");
		lblEnterYourName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblEnterYourName.setBounds(70, 40, 138, 14);
		contentPane.add(lblEnterYourName);
		
		JLabel label = new JLabel("");
		label.setBounds(50, 118, 46, 14);
		contentPane.add(label);
		
		JLabel lblTransfersOverHere = new JLabel("Transfers over here");
		lblTransfersOverHere.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblTransfersOverHere.setBounds(70, 143, 126, 14);
		contentPane.add(lblTransfersOverHere);
		
		
			}
	}

