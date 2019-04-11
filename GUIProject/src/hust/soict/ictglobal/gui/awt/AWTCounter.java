package hust.soict.ictglobal.gui.awt;
import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public AWTCounter()
	{
		setLayout(new FlowLayout());
		
		lblCount = new Label("Counter");
		add(lblCount);
		
		tfCount = new TextField(count + "", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("Count");
		add(btnCount);
		
		btnCount.addActionListener(this);
		
		setTitle("AWTCounter");
		
		setSize(250, 100);
		setVisible(true);
		
	}
	
	public void printText()
	{	
	}

	public static void main(String[] args)
	{
		AWTCounter app = new AWTCounter();
		app.printText();
	}

	@Override
	public void actionPerformed(ActionEvent evt)
	{
		++count;
		tfCount.setText(count + "");
	}
}
