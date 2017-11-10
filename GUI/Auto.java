import javax.swing.JFrame;

public class Auto extends JFrame{
	public Auto(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public static void main(String[]  args){
		new Auto("auto").setVisible(true);
	}
}
