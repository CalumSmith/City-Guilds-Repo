import javax.swing.JApplet;
import javax.swing.SwingUtilities;



public class GreetingApplet extends JApplet {

	/**
	 * Create the applet.
	 */
	public GreetingApplet() {
		LanguagePanel langPanel = new LanguagePanel(); // creating our panel.
		
		setContentPane(langPanel); //adds our panel to the applet.
		
	}
		
		//method used to kick off the applet
	
		
public void init() {
		
		
		try{
			SwingUtilities.invokeAndWait(new Runnable (){
				public void run(){
					new GreetingApplet();
				}
			});
			
			}catch(Exception e){
				e.printStackTrace();
			}		
	
	}
}
