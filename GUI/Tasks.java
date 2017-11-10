import javax.swing.JToggleButton;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Tasks extends JFrame implements ActionListener{
	JToggleButton bio,ip,drive,auto;
	JFrame newTask;
	public Tasks(String str){
		super(str);
		setSize(300,300);
		setLocation(1000,200);
		//setLayout(new GridLayout(0,2));
		setLayout(null);
		//setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				try{
					newTask.dispose();
				}catch(NullPointerException npe){}
				dispose();
			}
		});
		setResizable(false);
		bio=new JToggleButton("BIO");
		ip=new JToggleButton("IP");
		drive=new JToggleButton("DRIVE");
		auto=new JToggleButton("AUTO");
		bio.addActionListener(this);
		auto.addActionListener(this);
		drive.addActionListener(this);
		ip.addActionListener(this);
		bio.setBounds(40,50,100,50);
		drive.setBounds(155,50,100,50);
		auto.setBounds(40,150,100,50);
		ip.setBounds(155,150,100,50);
		add(bio);
		add(drive);
		add(auto);
		add(ip);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		JToggleButton btn=(JToggleButton)e.getSource();
		if(btn==bio){
			if(bio.isSelected()){
				System.out.println("BIO TASK ON");
				drive.setEnabled(false);
				auto.setEnabled(false);
				ip.setEnabled(false);
				newTask=new Bio("Bio");
				newTask.setVisible(true);
			}
			else{
				System.out.println("BIO TASK OFF");
				drive.setEnabled(true);
				auto.setEnabled(true);
				ip.setEnabled(true);
				newTask.dispose();
			}
		}
		else if(btn==drive){
			if(drive.isSelected()){
				System.out.println("DRIVE TASK ON");
				bio.setEnabled(false);
				auto.setEnabled(false);
				ip.setEnabled(false);
				newTask=new Drive("drive");
				newTask.setVisible(true);
			}
			else{
				System.out.println("DRIVE TASK OFF");
				bio.setEnabled(true);
				auto.setEnabled(true);
				ip.setEnabled(true);
				newTask.dispose();
			}
		}
		else if(btn==auto){
			if(auto.isSelected()){
				System.out.println("AUTO TASK ON");
				drive.setEnabled(false);
				bio.setEnabled(false);
				ip.setEnabled(false);
				newTask=new Auto("auto");
				newTask.setVisible(true);
			}
			else{
				System.out.println("AUTO TASK OFF");
				drive.setEnabled(true);
				bio.setEnabled(true);
				ip.setEnabled(true);
				newTask.dispose();
			}
		}
		else if(btn==ip){
			if(ip.isSelected()){
				System.out.println("IP TASK ON");
				drive.setEnabled(false);
				bio.setEnabled(false);
				auto.setEnabled(false);
				newTask=new IP("ip");
				newTask.setVisible(true);
			}
			else{
				System.out.println("IP TASK OFF");
				drive.setEnabled(true);
				bio.setEnabled(true);
				auto.setEnabled(true);
				newTask.dispose();
			}
		}
	}
	public static void main(String[] args){
		new Tasks("tasks").setVisible(true);
	}
}
