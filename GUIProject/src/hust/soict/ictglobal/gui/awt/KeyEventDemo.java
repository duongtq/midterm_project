package hust.soict.ictglobal.gui.awt;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	private TextField tfInput;
	private TextArea taDisplay;
	
	public KeyEventDemo()
	{
		setLayout(new FlowLayout());
		add(new Label("Enter Text"));
		tfInput = new TextField(10);
		add(tfInput);
		
		taDisplay = new TextArea(5, 40);
		add(taDisplay);
		
		tfInput.addKeyListener(this);
		setTitle("Key Event Demo");
		setSize(400, 400);
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	public static void main(String[] args)
	{
		new KeyEventDemo();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent evt)
	{
		taDisplay.append("You have typed "+ evt.getKeyChar() + "\n");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
