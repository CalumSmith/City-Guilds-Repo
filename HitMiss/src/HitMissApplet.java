import javax.swing.JApplet;


public class HitMissApplet extends JApplet {

	

	 
	public HitMissApplet() {

		HitMissPanel HM = new HitMissPanel();
		
		setContentPane(HM);
	}
	
	public void init(){
		setSize(550, 450);	
	}
	
}
	
	
	


