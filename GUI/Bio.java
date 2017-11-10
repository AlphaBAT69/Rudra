import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;

public class Bio extends JFrame{
	JFreeChart ph,temp,co2,humidity;
	ChartPanel phPanel,co2Panel,tempPanel,humidityPanel;
	JLabel l1,l2,l3,l4,ll;
	JTextField phValue,tempValue,co2Value,humidityValue;
	List list;
	JScrollPane values;
	public Bio(String str){
		super(str);
		setSize(1300,700);
		setLocationRelativeTo(this);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLayout(null);
		
		JPanel pan=new JPanel();
		pan.setLayout(new GridLayout(0,2));
		pan.setBounds(10,10,850,600);
		
		ph=ChartFactory.createXYLineChart("pH Plot", "Time", "pH", null);
		phPanel=new ChartPanel(ph);
		
		temp=ChartFactory.createXYLineChart("Temperature Plot", "Time", "Temperature", null);
		tempPanel=new ChartPanel(temp);
		
		co2=ChartFactory.createXYLineChart("CO2 Plot", "Time", "CO2", null);
		co2Panel=new ChartPanel(co2);
		
		humidity=ChartFactory.createXYLineChart("Humidity Plot", "Time", "Humidity", null);
		humidityPanel=new ChartPanel(humidity);
		
		l1=new JLabel("Current pH Value:");
		l1.setBounds(900,10,200,50);
		l2=new JLabel("Current Temperature Value:");
		l2.setBounds(900,160,200,50);
		l3=new JLabel("Current CO2 Value:");
		l3.setBounds(900,310,200,50);
		l4=new JLabel("Current Humidity Value:");
		l4.setBounds(900,460,200,50);
		ll=new JLabel("Values List:");
		ll.setBounds(1000,10,100,50);
		
		phValue=new JTextField();
		phValue.setBounds(900,60,200,50);
		phValue.setEditable(false);
		tempValue=new JTextField();
		tempValue.setBounds(900,210,200,50);
		tempValue.setEditable(false);
		co2Value=new JTextField();
		co2Value.setBounds(900,360,200,50);
		co2Value.setEditable(false);
		humidityValue=new JTextField();
		humidityValue.setEditable(false);
		humidityValue.setBounds(900,510,200,50);
		
		list=new List();
		values=new JScrollPane(list);
		values.setBounds(1110,60,170,500);
		
		pan.add(phPanel);
		add(l1);
		add(phValue);
		pan.add(tempPanel);
		add(l2);
		add(tempValue);
		pan.add(co2Panel);
		add(l3);
		add(co2Value);
		add(ll);
		add(l4);
		add(humidityValue);
		pan.add(humidityPanel);
		add(values);
		add(pan);
		plot();
	}
	public void plot(){
		
	}
	public static void main(String[] args){
		new Bio("bio").setVisible(true);
	}
}