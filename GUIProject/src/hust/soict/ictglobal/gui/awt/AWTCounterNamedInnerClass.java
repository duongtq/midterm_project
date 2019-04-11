package hust.soict.ictglobal.gui.awt;

import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class AWTCounterNamedInnerClass extends Frame
{
	private static final long serialVersionUID = 1L;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
 
	public AWTCounterNamedInnerClass()
	{
		setLayout(new FlowLayout());  // "super" Frame sets to FlowLayout
		add(new Label("Counter"));    // An anonymous instance of Label
		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);   // read-only
		add(tfCount);                 // "super" Frame adds tfCount
	 
		btnCount = new Button("Count");
		add(btnCount);                // "super" Frame adds btnCount
	      
		btnCount.addActionListener(new BtnCountListener());
	 
		setTitle("AWT Counter");
		setSize(250, 100);
		setVisible(true);
	}
 
	public static void main(String[] args)
	{
		new AWTCounterNamedInnerClass(); // Let the constructor do the job
	}

	private class BtnCountListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt)
		{
			++count;
			tfCount.setText(count + "");
		}
	}
}