import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class FirstFrame extends JFrame{
	JButton connect;
	JLabel connectionInfo;
	JScrollPane pane;
	public FirstFrame(String str){
		super(str);
		setSize(300,300);
		setLayout(null);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		connect=new JButton("CONNECT");
		connectionInfo=new JLabel("Connection Input here");
		pane=new JScrollPane(connectionInfo);
		pane.setBounds(50,100,200,30);
		connect.setBounds(100,150,100,25);
		add(pane);
		add(connect);
		connect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean b=get();
				if(b){
					int input=JOptionPane.showConfirmDialog(getContentPane(),	"Connection Successful!", "Done!", JOptionPane.OK_OPTION);
					//System.out.println(input);
					connectionInfo.setOpaque(true);
					connectionInfo.setBackground(Color.green);
					if(input==0){
						new Tasks("tasks").setVisible(true);
						new Map("map").setVisible(true);
						connectionInfo.setText("some value here");
					}
				}
				else{
					JOptionPane.showMessageDialog(getContentPane(), "Connection Failed!", "Error!", JOptionPane.ERROR_MESSAGE);
					connectionInfo.setText("Connection FAIL");
					connectionInfo.setOpaque(true);
					connectionInfo.setBackground(Color.red);
				}
			}
		});
	}
	public boolean get(){
		boolean b=true;
		//something here
		return b;
	}
	public static void main(String[] args){
		new FirstFrame("first frame").setVisible(true);
	}
}
