import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GuessWordApplet extends JApplet {
	private JTextField textField;

	
	
	 
	public GuessWordApplet() {

	GuessWord GW = new GuessWord();
		setContentPane(GW);
		
		
		
		
	}

	public void init(){
		setSize(450, 350);
	}




}
