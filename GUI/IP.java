import javax.swing.JFrame;

public class IP extends JFrame{
	public IP(String str){
		super(str);
		setSize(500,500);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public static void main(String[] args){
		new IP("ip").setVisible(true);
	}
}
