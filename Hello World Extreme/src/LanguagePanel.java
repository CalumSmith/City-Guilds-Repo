import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import java.awt.Font;

import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;


public class LanguagePanel extends JPanel {
	private JTextField txtLanguageType;
	private JTextField txtHelloMessage;
	
	private JLabel imgEngFlag;
	private JLabel imgFrenchFlag;
	private JLabel imgIrishFlag;
	private JLabel imgGermanFlag;
	private JLabel imgPolishFlag;
	private JLabel imgSwedishFlag;
	private JLabel imgItalianFlag;
	private JLabel imgWelshFlag;
	private JLabel imgSpanishFlag;

	/**
	 * Create the panel.
	 */
	public void hideLabel(){
		imgEngFlag.setVisible(false);
		imgFrenchFlag.setVisible(false);
		imgGermanFlag.setVisible(false);
		imgIrishFlag.setVisible(false);
		imgPolishFlag.setVisible(false);
		imgSwedishFlag.setVisible(false);
		imgItalianFlag.setVisible(false);
		imgWelshFlag.setVisible(false);
		imgSpanishFlag.setVisible(false);
		
	}
	
	public LanguagePanel() {
		setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBackground(Color.ORANGE);
		setLayout(null); //Specifies the layout.
		
		txtLanguageType = new JTextField();
		txtLanguageType.setBackground(Color.LIGHT_GRAY);
		txtLanguageType.setEditable(false);
		txtLanguageType.setBounds(232, 57, 144, 20);
		add(txtLanguageType);
		txtLanguageType.setColumns(10);
		
		txtHelloMessage = new JTextField();
		txtHelloMessage.setBackground(Color.LIGHT_GRAY);
		txtHelloMessage.setForeground(Color.WHITE);
		txtHelloMessage.setEditable(false);
		txtHelloMessage.setBounds(10, 100, 291, 72);
		add(txtHelloMessage);
		txtHelloMessage.setColumns(10);
		
		JButton btnEnglish = new JButton("English");
		btnEnglish.setForeground(Color.RED);
		btnEnglish.setBackground(Color.WHITE);
		btnEnglish.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnEnglish.addActionListener(myActionListener);
		btnEnglish.setBounds(23, 183, 89, 23);
		add(btnEnglish);
		
		JButton btnFrench = new JButton("French");
		btnFrench.setForeground(Color.MAGENTA);
		btnFrench.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnFrench.setBounds(162, 183, 89, 23);
		add(btnFrench);
		btnFrench.addActionListener(myActionListener);
		
		JButton btnIrish = new JButton("Irish");
		btnIrish.setForeground(Color.GRAY);
		btnIrish.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnIrish.setBounds(297, 183, 89, 23);
		add(btnIrish);
		btnIrish.addActionListener(myActionListener);
		
		JButton btnGerman = new JButton("German");
		btnGerman.setForeground(Color.MAGENTA);
		btnGerman.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnGerman.setBounds(23, 217, 89, 23);
		add(btnGerman);
		btnGerman.addActionListener(myActionListener);
		
		JButton btnPolish = new JButton("Polish");
		btnPolish.setForeground(Color.RED);
		btnPolish.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnPolish.setBounds(162, 217, 89, 23);
		add(btnPolish);
		btnPolish.addActionListener(myActionListener);
		
		JButton btnSwedish = new JButton("Swedish");
		btnSwedish.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnSwedish.setBounds(297, 217, 89, 23);
		add(btnSwedish);
		btnSwedish.addActionListener(myActionListener);
		
		JLabel lblHelloIn = new JLabel("Hello in :");
		lblHelloIn.setBounds(113, 60, 78, 14);
		add(lblHelloIn);
		
		JButton btnItalian = new JButton("Italian");
		btnItalian.setForeground(Color.BLUE);
		btnItalian.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnItalian.setBounds(23, 251, 89, 23);
		add(btnItalian);
		btnItalian.addActionListener(myActionListener);
		
		JButton btnWelsh = new JButton("Welsh");
		btnWelsh.setForeground(Color.RED);
		btnWelsh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnWelsh.addActionListener(myActionListener);
		btnWelsh.setBounds(162, 251, 89, 23);
		add(btnWelsh);
		
		JButton btnSpanish = new JButton("Spanish");
		btnSpanish.setForeground(Color.MAGENTA);
		btnSpanish.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnSpanish.addActionListener(myActionListener);
		btnSpanish.setBounds(297, 251, 89, 23);
		add(btnSpanish);
		
		
		JLabel lblLanguageTranslator = new JLabel("Language Translator");
		lblLanguageTranslator.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblLanguageTranslator.setBounds(113, 23, 224, 23);
		add(lblLanguageTranslator);
		
		imgEngFlag = new JLabel("");
		imgEngFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\EnglishFlag.png"));
		imgEngFlag.setBounds(354, 100, 400, 200);
		imgEngFlag.setVisible(false);
		add(imgEngFlag);
		
	
		imgFrenchFlag = new JLabel("");
		imgFrenchFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\FrenchFlag.png"));
		imgFrenchFlag.setBounds(354, 100, 400, 200);
		imgFrenchFlag.setVisible(false);
		add(imgFrenchFlag);
		
		imgIrishFlag = new JLabel("");
		imgIrishFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\IrishFlag.png"));
		imgIrishFlag.setBounds(354, 100, 400, 200);
		imgIrishFlag.setVisible(false);
		add(imgIrishFlag);
		
		imgGermanFlag = new JLabel("");
		imgGermanFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\GermanFlag.png"));
		imgGermanFlag.setBounds(354, 100, 400, 200);
		imgGermanFlag.setVisible(false);
		add(imgGermanFlag);
		
		imgPolishFlag = new JLabel("");
		imgPolishFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\PolishFlag.png"));
		imgPolishFlag.setBounds(354, 100, 400, 200);
		imgPolishFlag.setVisible(false);
		add(imgPolishFlag);
		
		imgSwedishFlag = new JLabel("");
		imgSwedishFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\SwedishFlag.png"));
		imgSwedishFlag.setBounds(354, 100, 400, 200);
		imgSwedishFlag.setVisible(false);
		add(imgSwedishFlag);
		
		imgItalianFlag = new JLabel("");
		imgItalianFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\ItalianFlag.png"));
		imgItalianFlag.setBounds(354, 100, 400, 200);
		imgItalianFlag.setVisible(false);
		add(imgItalianFlag);
		
		imgWelshFlag = new JLabel("");
		imgWelshFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\WelshFlag.png"));
		imgWelshFlag.setBounds(354, 100, 400, 200);
		imgWelshFlag.setVisible(false);
		add(imgWelshFlag);
		
		imgSpanishFlag = new JLabel("");
		imgSpanishFlag.setIcon(new ImageIcon("C:\\Users\\Student\\Pictures\\SpanishFlag.png"));
		imgSpanishFlag.setBounds(354, 100, 400, 200);
		imgSpanishFlag.setVisible(false);
		add(imgSpanishFlag);
	}

		//below our languagePanel constructor,
		// we are going to create our actionlistener

	private ActionListener myActionListener = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			// this is where the code goes for when an event happens
			//in our case the event will be a button click.
			if(event.getSource() instanceof JButton){
				//we begin to do our required code if we confirm we have a JButton
				
				JButton buttonPressed = (JButton)event.getSource();
				//going from a object to a button
				String buttonText = buttonPressed.getText();
				
				switch(buttonText){
					case "English" :txtLanguageType.setText(buttonText);
									txtHelloMessage.setText("Hello");
									hideLabel();
									imgEngFlag.setVisible(true);
						
						break;
					case "French" : txtLanguageType.setText(buttonText);
									txtHelloMessage.setText("bonjour");
									hideLabel();
									imgFrenchFlag.setVisible(true);
						break;
					case "Irish" : 	txtLanguageType.setText(buttonText);
									txtHelloMessage.setText("dia duit");
									hideLabel();
									imgIrishFlag.setVisible(true);
						break;
					case "German" : txtLanguageType.setText(buttonText);
									txtHelloMessage.setText("Hallo");
									hideLabel();
									imgGermanFlag.setVisible(true);
						break;
					case "Polish" : txtLanguageType.setText(buttonText);
									txtHelloMessage.setText("czesc");
									hideLabel();
									imgPolishFlag.setVisible(true);
						break;
					case "Swedish" :txtLanguageType.setText(buttonText);
									txtHelloMessage.setText("Halla");
									hideLabel();
									imgSwedishFlag.setVisible(true);
						break;
					case "Welsh" :txtLanguageType.setText(buttonText);
								  txtHelloMessage.setText("Helo");
								  hideLabel();
								  imgWelshFlag.setVisible(true);
						break;
					
					case "Italian" :txtLanguageType.setText(buttonText);
					                txtHelloMessage.setText("ciao");
					                hideLabel();
					                imgItalianFlag.setVisible(true);
					  	break;
				
					case "Spanish" :txtLanguageType.setText(buttonText);
					  		      	txtHelloMessage.setText("Hola");
					  		      	hideLabel();
					  		      	imgSpanishFlag.setVisible(true);
					  	break;  	
				
				
				
				}
				
			
			
			}
		}
		
	};
	
}


