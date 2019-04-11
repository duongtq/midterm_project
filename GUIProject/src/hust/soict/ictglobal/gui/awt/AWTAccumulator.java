package hust.soict.ictglobal.gui.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private Label lblInput;
	private Label lblOutput;
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;
	
	public AWTAccumulator()
	{
		setLayout(new FlowLayout());
		
		lblInput = new Label("Enter an integer: ");
		add(lblInput);
		
		tfInput = new TextField(10);
		add(tfInput);
		
		tfInput.addActionListener(this);
		
		lblOutput = new Label("The Accumulator: ");
		add(lblOutput);
		
		tfOutput = new TextField();
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setTitle("AWT Accumulator");
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new AWTAccumulator();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int numberIn = Integer.parseInt(tfInput.getText());
		sum+= numberIn;
		tfInput.setText("");
		tfOutput.setText(sum + "");
	}
}
