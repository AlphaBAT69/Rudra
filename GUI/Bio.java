import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;

public class Bio extends JFrame{
	JFreeChart ph,temp,co2;
	ChartPanel phPanel,co2Panel,tempPanel;
	JLabel l1,l2,l3,l4;
	JTextField phValue,tempValue,co2Value;
	List list;
	JScrollPane values;
	public Bio(String str){
		super(str);
		setSize(1200,700);
		setLocationRelativeTo(this);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLayout(null);
		
		ph=ChartFactory.createXYLineChart("pH Plot", "Time", "pH", null);
		phPanel=new ChartPanel(ph);
		phPanel.setBounds(10,10,650,200);
		
		temp=ChartFactory.createXYLineChart("Temperature Plot", "Time", "Temperature", null);
		tempPanel=new ChartPanel(temp);
		tempPanel.setBounds(10,220,650,200);
		
		co2=ChartFactory.createXYLineChart("CO2 Plot", "Time", "CO2", null);
		co2Panel=new ChartPanel(co2);
		co2Panel.setBounds(10,430,650,200);
		
		l1=new JLabel("Current pH Value:");
		l1.setBounds(700,10,200,50);
		l2=new JLabel("Current Temperature Value:");
		l2.setBounds(700,220,200,50);
		l3=new JLabel("Current CO2 Value:");
		l3.setBounds(700,430,200,50);
		l4=new JLabel("Values List:");
		l4.setBounds(1000,10,100,50);
		
		phValue=new JTextField();
		phValue.setBounds(700,60,200,50);
		phValue.setEditable(false);
		tempValue=new JTextField();
		tempValue.setBounds(700,270,200,50);
		tempValue.setEditable(false);
		co2Value=new JTextField();
		co2Value.setBounds(700,480,200,50);
		co2Value.setEditable(false);
		
		list=new List();
		values=new JScrollPane(list);
		values.setBounds(1000,60,170,500);
		
		add(phPanel);
		add(tempPanel);
		add(co2Panel);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(phValue);
		add(tempValue);
		add(co2Value);
		add(values);
	}
	public static void main(String[] args){
		new Bio("bio").setVisible(true);
	}
}
