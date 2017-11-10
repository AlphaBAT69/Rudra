import javax.swing.JFrame;

public class Drive extends JFrame{
	public Drive(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public static void main(String[] args){
		new Drive("drive").setVisible(true);
	}
}
