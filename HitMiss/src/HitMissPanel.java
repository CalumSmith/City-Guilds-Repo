import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HitMissPanel extends JPanel {

	
	private JTextField[] textFields = new JTextField[18]; //stores all text fields
	private int numGuess = 1; 		// stores the guess which the user is on
	private int colorGuessCounter = 0; // stores the color guess counterer
	
	private int textFieldCounter = 0; //keeps track of which textfield i am on
	
	private String[] randomColorCode  = new String[3]; // array for me to store code generator 
	private String [] usersGuesses = new String[3]; // array for me to store users guesses
	
	
	private JLabel lbl2ndGuess;
	private JLabel lbl3rdGuess;
	private JLabel lbl4thGuess;
	private JLabel lbl5thGuess;
	private JLabel lbl6thGuess;
	
	private JLabel lblGuessTheHidden;
	
	private JTextField txtAnswerOne;
	private JTextField txtAnswerTwo;
	private JTextField txtAnswerThree;
	
	
	public HitMissPanel() {
		setLayout(null);
		randomColorGenerator();
		initTextfields();
	
		
		JLabel lblChooseAColor = new JLabel("Choose a color");
		lblChooseAColor.setBounds(10, 11, 97, 14);
		add(lblChooseAColor);
		
		JLabel lblHitAndMiss = new JLabel("HITS AND MISSES");
		lblHitAndMiss.setForeground(Color.BLUE);
		lblHitAndMiss.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHitAndMiss.setBounds(150, 346, 177, 54);
		add(lblHitAndMiss);
		
		JButton btnRed = new JButton("Red");
		btnRed.setBounds(10, 33, 60, 23);
		btnRed.addActionListener(myActionListener);
		add(btnRed);
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.setBounds(80, 33, 60, 23);
		btnBlue.addActionListener(myActionListener);
		add(btnBlue);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.setBounds(150, 33, 70, 23);
		btnGreen.addActionListener(myActionListener);
		add(btnGreen);
		
		JButton btnBlack = new JButton("Black");
		btnBlack.setBounds(33, 59, 70, 23);
		btnBlack.addActionListener(myActionListener);
		add(btnBlack);
		
		JButton btnYellow = new JButton("Yellow");
		btnYellow.addActionListener(myActionListener);
		btnYellow.setBounds(114, 59, 75, 23);
		add(btnYellow);
		
		JLabel lblstGuess = new JLabel("1st Guess");
		lblstGuess.setBounds(370, 40, 70, 14);
		add(lblstGuess);
		
		lbl2ndGuess = new JLabel("2nd Guess");
		lbl2ndGuess.setVisible(false);
		lbl2ndGuess.setBounds(370, 80, 70, 14);
		add(lbl2ndGuess);
		
		lbl3rdGuess = new JLabel("3rd Guess");
		lbl3rdGuess.setBounds(370, 120, 70, 14);
		lbl3rdGuess.setVisible(false);
		add(lbl3rdGuess);
		
		lbl4thGuess = new JLabel("4th Guess");
		lbl4thGuess.setBounds(370, 160, 70, 14);
		lbl4thGuess.setVisible(false);
		add(lbl4thGuess);
		
		lbl5thGuess = new JLabel("5th Guess");
		lbl5thGuess.setBounds(370, 200, 70, 14);
		lbl5thGuess.setVisible(false);
		add(lbl5thGuess);
		
		lbl6thGuess = new JLabel("6th Guess");
		lbl6thGuess.setBounds(370, 240, 70, 14);
		lbl6thGuess.setVisible(false);
		add(lbl6thGuess);
		
		lblGuessTheHidden = new JLabel("Guess the hidden code");
		lblGuessTheHidden.setBounds(96, 285, 130, 14);
		add(lblGuessTheHidden);
		
		txtAnswerOne = new JTextField();
		txtAnswerOne.setBackground(Color.WHITE);
		txtAnswerOne.setEditable(false);
		txtAnswerOne.setBounds(250, 280, 30, 30);
		add(txtAnswerOne);
		
		txtAnswerTwo = new JTextField();
		txtAnswerTwo.setBackground(Color.WHITE);
		txtAnswerTwo.setEditable(false);
		txtAnswerTwo.setBounds(290, 280, 30, 30);
		add(txtAnswerTwo);
		
		txtAnswerThree = new JTextField();
		txtAnswerThree.setBackground(Color.WHITE);
		txtAnswerThree.setEditable(false);
		txtAnswerThree.setBounds(330, 280 , 30, 30);
		add(txtAnswerThree);
	}
	
	
	

	

	private void initTextfields(){
		//Declaring the variables used for specifying the bounds of the Textfields
		int x = 210;
		int y = 35;
		int height = 30;
		int width = 30;
		
		/*
		 * A for loop used for going through our array of JTextFields to give them their position
		 */
		for(int i = 0; i < textFields.length; ++i){
			/*
			 * This modulus statement just checks if it's a third Textfield that is being placed,
			 * if it is a third one the x co-ordinate gets reset and then the y co-ordinate gets moved down one row
			 * otherwise it just moves the x co-ordinate to the side for the next textfield to be placed side by side.
			 */
			if(i % 3 == 0 && i != 0){
				y = y + height + 10;
				x = 250;
			}else{
				x = x + width + 10;
			}
			textFields[i] = new JTextField();
			textFields[i].setBounds(x, y, height, width);
			if(i > 2){
				textFields[i].setVisible(false);	//This if statement just sets all the TextFields after the first 3 to be invisible.
			}
			textFields[i].setEditable(false);
			add(textFields[i]);
		}
	}
	
	
	
	private void displayNextTextField(){
		/*
		 * This loop just goes from the current textField we're referring to on our guesses
		 * and sets the next three to be visible
		 */
		for(int i = textFieldCounter; i < (textFieldCounter + 3); ++i){
			if(i < textFields.length){
				textFields[i].setVisible(true);
			}
		}
		/*
		 * A quick switch statement just to display the label for the corresponding guess
		 */
		switch(numGuess){
			case 2 : lbl2ndGuess.setVisible(true); break;
			case 3 : lbl3rdGuess.setVisible(true); break;
			case 4 : lbl4thGuess.setVisible(true); break;
			case 5 : lbl5thGuess.setVisible(true); break;
			case 6 : lbl6thGuess.setVisible(true); break;
		}
	}
	
	
	private Color figureOutColor(String strColor){
		Color chosenColor = null;	//creates a color just to hold the color
		switch(strColor){
			case "Red" : chosenColor = Color.RED; break;
			case "Blue" : chosenColor = Color.BLUE; break;
			case "Green" : chosenColor = Color.GREEN; break;
			case "Black" : chosenColor = Color.BLACK; break;
			case "Yellow" : chosenColor = Color.YELLOW; break;
		}
		return chosenColor;	//returns the color //null if not found
	}
	
	
	private void displayNextTextFields(){
		/*
		 * This loop just goes from the current textField we're referring to on our guesses
		 * and sets the next three to be visible
		 */
		for(int i = textFieldCounter; i < (textFieldCounter + 3); ++i){
			if(i < textFields.length){
				textFields[i].setVisible(true);
			}
		}
		/*
		 * A quick switch statement just to display the label for the corresponding guess
		 */
		switch(numGuess){
			case 2 : lbl2ndGuess.setVisible(true); break;
			case 3 : lbl3rdGuess.setVisible(true); break;
			case 4 : lbl4thGuess.setVisible(true); break;
			case 5 : lbl5thGuess.setVisible(true); break;
			case 6 : lbl6thGuess.setVisible(true); break;
		}
	}
	
	
	private boolean hasWon(){
		boolean isAWinner = true;	//Boolean to store if they have won or not
		
		for(int i = 0; i < randomColorCode.length; ++i){	//Loop to iterate through the randomcolor code array
			if(!randomColorCode[i].equals(usersGuesses[i])){	//if statement to check if the elements are equal
				isAWinner = false;	//If the elements are not (!) equal then we know the user has lost.
			}
		}
		
		return isAWinner;	//Returning isAwinner if true is returned they've won, otherwise they lose
	}
	
	
	private void displayAnswer(){
		String strChosenColor = randomColorCode [0];	//Getting the randomly chosen string from our randomcolorcode
		Color chosenColor = figureOutColor(strChosenColor);	//Getting the color value of the String
		txtAnswerOne.setBackground(chosenColor);	//setting the background as the color chosen
		
		strChosenColor = randomColorCode[1];	//re-using same variable	
		chosenColor = figureOutColor(strChosenColor);	//re-using same variable
		txtAnswerTwo.setBackground(chosenColor);
		
		strChosenColor = randomColorCode[2];
		chosenColor = figureOutColor(strChosenColor);
		txtAnswerThree.setBackground(chosenColor);
	}
	
	
	
	
	
	
	
	
	private void randomColorGenerator(){
		//Creating string array to hold my colors
		String[] colors = {"Blue", "Red", "Green", "Black", "Yellow"};
		

		//Define an array of Strings to hold the randomly generated color code.
		randomColorCode = new String[3];
		//Create my random generator.
		Random randomGenerator = new Random();
		
		//A foor loop to fill my randomColorCode array with the randomly chosen colors
		for(int i = 0; i < randomColorCode.length; ++i){
			
			//Get a random int between 0 and the size of the array, in this case 5.
			int randomNum = randomGenerator.nextInt(colors.length);
			randomColorCode[i] = colors[randomNum];
		}
		
			//For each loop used to go through each of the elements in the randomcolorcode array
		for(String str : randomColorCode){
			System.out.println(str);
			
		}
	
	}
	 
	
	
	ActionListener myActionListener = new ActionListener(){

		
		public void actionPerformed(ActionEvent event) {
			//In here is where the code for when a button is clicked is called
			String buttonPressed = event.getActionCommand();	//Just grabs the text from the button and stores it in the buttonPressed variable for us to use later
					
			Color userColor = figureOutColor(buttonPressed);
			
			if(textFieldCounter < 18){
				textFields[textFieldCounter].setBackground(userColor);
				++textFieldCounter;	
			}
			
		
			usersGuesses[colorGuessCounter] = buttonPressed;
			++colorGuessCounter;
			
			
			if(colorGuessCounter == 3){
				++numGuess;
				colorGuessCounter = 0;
				if(hasWon() == true){
					displayAnswer();	
					lblGuessTheHidden.setText("You win");
				}else if(numGuess == 7){
					displayAnswer();
					lblGuessTheHidden.setText("You lose");
				}
				displayNextTextFields();
			}
		
		}
		
	};
			
					
			
}
