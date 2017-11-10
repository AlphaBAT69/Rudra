import javax.swing.JFrame;

public class Map extends JFrame{
	public Map(String str){
		super(str);
		setSize(500,500);
		setLocation(10,50);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
	}
	public static void main(String[] args){
		new Map("map").setVisible(true);
	}
}
