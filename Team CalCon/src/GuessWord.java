import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;


public class GuessWord extends JPanel {
	//Declaring instance variables
	private JTextField textField;  					
	private JTextField textField_1;
	private JTextField textField_2;
	private int wordCounter = 0;
	private String[] listOfWords ={"MEMORY", "COMPUTER", "PRINTER", "TROUSERS", "BUTTERCUP"};
	private char[] wordGuess;
	private int numLives = 8;
	private int i;
	private int originalWord;
	GuessWord panel;
	

	
	public GuessWord() {
		setLayout(null);
		panel = this;
		
		//labels and text fields
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(197, 62, 183, 20);
		add(textField_1);
		textField_1.setColumns(24);
		
		JLabel lblGuessTheWord = new JLabel("Guess the Word");
		lblGuessTheWord.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGuessTheWord.setForeground(Color.RED);
		lblGuessTheWord.setBounds(214, 37, 153, 14);
		add(lblGuessTheWord);
		
		JLabel lblGuessesRemaining = new JLabel("Guesses Remaining");
		lblGuessesRemaining.setForeground(Color.RED);
		lblGuessesRemaining.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGuessesRemaining.setBounds(196, 108, 119, 27);
		add(lblGuessesRemaining);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setEditable(false);
		textField_2.setBounds(327, 113, 86, 20);
		add(textField_2);
		textField_2.setColumns(3);
	
		
		//Start button
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(myActionListener);
		btnStart.setBackground(Color.LIGHT_GRAY);
		btnStart.setBounds(292, 266, 63, 23);
		add(btnStart);
		
		//Answer button
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.addActionListener(myActionListener);
		btnAnswer.setBackground(Color.LIGHT_GRAY);
		btnAnswer.setBounds(365, 266, 86, 23);
		add(btnAnswer);
		
		//Design of letter buttons
		JButton btnA = new JButton("A");
		btnA.addActionListener(myActionListener);
		btnA.setBackground(Color.LIGHT_GRAY);
		btnA.setBounds(20, 163, 55, 23);
		add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBackground(Color.LIGHT_GRAY);
		btnB.setBounds(72, 163, 55, 23);
		btnB.addActionListener(myActionListener);
		add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.LIGHT_GRAY);
		btnC.setBounds(126, 163, 55, 23);
		btnC.addActionListener(myActionListener);
		add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setBackground(Color.LIGHT_GRAY);
		btnD.setBounds(180, 163, 55, 23);
		btnD.addActionListener(myActionListener);
		add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setBackground(Color.LIGHT_GRAY);
		btnE.setBounds(232, 163, 53, 23);
		btnE.addActionListener(myActionListener);
		add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBackground(Color.LIGHT_GRAY);
		btnF.setBounds(282, 163, 53, 23);
		btnF.addActionListener(myActionListener);
		add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBackground(Color.LIGHT_GRAY);
		btnG.setBounds(327, 163, 53, 23);
		btnG.addActionListener(myActionListener);
		add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBackground(Color.LIGHT_GRAY);
		btnH.setBounds(20, 184, 53, 23);
		btnH.addActionListener(myActionListener);
		add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBackground(Color.LIGHT_GRAY);
		btnI.setBounds(72, 184, 55, 23);
		btnI.addActionListener(myActionListener);
	    add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBackground(Color.LIGHT_GRAY);
		btnJ.setBounds(126, 184, 55, 23);
		btnJ.addActionListener(myActionListener);
		add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBackground(Color.LIGHT_GRAY);
		btnK.setBounds(180, 184, 55, 23);
		btnK.addActionListener(myActionListener);
		add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBackground(Color.LIGHT_GRAY);
		btnL.setBounds(232, 184, 53, 23);
		btnL.addActionListener(myActionListener);
		add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setBackground(Color.LIGHT_GRAY);
		btnM.setBounds(282, 184, 53, 23);
		btnM.addActionListener(myActionListener);
		add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBackground(Color.LIGHT_GRAY);
		btnN.setBounds(327, 184, 53, 23);
		btnN.addActionListener(myActionListener);
		add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setBackground(Color.LIGHT_GRAY);
		btnO.setBounds(20, 207, 55, 23);
		btnO.addActionListener(myActionListener);
		add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBackground(Color.LIGHT_GRAY);
		btnP.setBounds(72, 207, 55, 23);
		btnP.addActionListener(myActionListener);
		add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBackground(Color.LIGHT_GRAY);
		btnQ.setBounds(126, 207, 55, 23);
		btnQ.addActionListener(myActionListener);
		add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setBackground(Color.LIGHT_GRAY);
		btnR.setBounds(180, 207, 55, 23);
		btnR.addActionListener(myActionListener);
		add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBackground(Color.LIGHT_GRAY);
		btnS.setBounds(232, 207, 47, 23);
		btnS.addActionListener(myActionListener);
		add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setBackground(Color.LIGHT_GRAY);
		btnT.setBounds(272, 207, 63, 23);
		btnT.addActionListener(myActionListener);
		add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBackground(Color.LIGHT_GRAY);
		btnU.setBounds(327, 207, 55, 23);
		btnU.addActionListener(myActionListener);
		add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setBackground(Color.LIGHT_GRAY);
		btnV.setBounds(20, 229, 53, 23);
		btnV.addActionListener(myActionListener);
		add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setBackground(Color.LIGHT_GRAY);
		btnW.setBounds(72, 229, 53, 23);
		btnW.addActionListener(myActionListener);
		add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBackground(Color.LIGHT_GRAY);
		btnX.setBounds(126, 229, 55, 23);
		btnX.addActionListener(myActionListener);
		add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBackground(Color.LIGHT_GRAY);
		btnY.setBounds(180, 229, 53, 23);
		btnY.addActionListener(myActionListener);
		add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBackground(Color.LIGHT_GRAY);
		btnZ.setBounds(230, 229, 55, 23);
		btnZ.addActionListener(myActionListener);
		add(btnZ);
		
		
		
	}
	
	ActionListener myActionListener = new ActionListener(){			//ActionListener for all buttons

		@Override
		public void actionPerformed(ActionEvent e) {
			// if statements to find out which button is being pressed and what subsequent action is to be taken.
			
			//Action to be taken if start button is pressed
			if(e.getActionCommand().equals("Start")){
				textField_2.setText("");
				textField_1.setText(""); //clearing both text fields
				
				numLives = 8;
				textField_2.setText("" + numLives);
				wordGuess = listOfWords[wordCounter].toCharArray();
				textField_1.setText(new String(wordGuess));
				numLives = 8;
				
				for( i =0; i<wordGuess.length; ++i){
					wordGuess[i] = '*';
				}
				
				textField_1.setText(new String(wordGuess));
				
				wordCounter++;
				if(wordCounter ==5){
					wordCounter = 0;
					
				}
			//Action to be taken if answer button is pressed
			}else if(e.getActionCommand().equals("Answer")){
				if(wordCounter == 0){
					textField_1.setText(listOfWords[0]);
				}else{
					textField_1.setText(listOfWords[wordCounter -1]);
				}
				textField_2.setText("");
			}else{
				char c = e.getActionCommand().charAt(0);
			
				int index = listOfWords[wordCounter - 1].indexOf(c);
			
				if(index != -1){
					char[] actualWord = listOfWords[wordCounter -1].toCharArray();
					for(int j = 0; j < actualWord.length; ++j){
						if(actualWord[j] == c){
							wordGuess[j] = c;
						}
					}
				//Generic code for when letter buttons are pressed	
				}else{
					--numLives;
					textField_2.setText("" + numLives);
					if(numLives == 0){
						UIManager.put("OptionPane.messageForeground", Color.RED);
						JOptionPane.showMessageDialog(panel, "You Lose");
						numLives = 8;
						textField_2.setText("" +numLives);
						
					}
				}
			
				textField_1.setText(new String(wordGuess));
			}
			
			String strWordGuess = new String(wordGuess);
			if(wordCounter == 0){
				if(strWordGuess.equals(listOfWords[0])){
					UIManager.put("OptionPane.messageForeground", Color.BLUE);
					JOptionPane.showMessageDialog(panel, "You Win");
					
					textField_2.setText("" +numLives);
				}
			}else{
				if(strWordGuess.equals(listOfWords[wordCounter - 1])){
					UIManager.put("OptionPane.messageForeground", Color.BLUE);
					JOptionPane.showMessageDialog(panel, "You Win");
				
					textField_2.setText("" +numLives);
				}
			}
		}
		
	};
}
