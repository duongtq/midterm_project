package hust.soict.ictglobal.gui.awt;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo extends Frame implements MouseListener, MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	
	// To display the (x, y) of the mouse-clicked
	private TextField tfMouseClickX;
	private TextField tfMouseClickY;
	
	// To display the (x, y) of the current mouse-pointer position
	private TextField tfMousePositionX;
	private TextField tfMousePositionY;
	
	// Constructor to setup the GUI components and event handlers
	public MouseMotionDemo()
	{
		setLayout(new FlowLayout());
		
		add(new Label("X-Click: "));
		tfMouseClickX = new TextField(10);
		tfMouseClickX.setEditable(false);
		add(tfMouseClickX);
		
		add(new Label("Y-Click: "));
		tfMouseClickY = new TextField(10);
		tfMouseClickY.setEditable(false);
		add(tfMouseClickY);
		
		add(new Label("X-Position: "));
		tfMousePositionX = new TextField(10);
		tfMousePositionX.setEditable(false);
		add(tfMousePositionX);
		
		add(new Label("Y-Position: "));
		tfMousePositionY = new TextField(10);
		tfMousePositionY.setEditable(false);
		add(tfMousePositionY);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setTitle("Mouse Motion Demo");
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new MouseMotionDemo();
	}
	
	@Override
	public void mouseClicked(MouseEvent evt)
	{
		tfMouseClickX.setText(evt.getX() + "");
		tfMouseClickY.setText(evt.getY() + "");
	}
	
	@Override
	public void mouseMoved(MouseEvent evt)
	{
		tfMousePositionX.setText(evt.getX() + "");
		tfMousePositionY.setText(evt.getY() + "");
	}
	
	@Override public void mouseDragged(MouseEvent arg0) {}
	@Override public void mouseEntered(MouseEvent arg0) {}
	@Override public void mouseExited(MouseEvent arg0) {}
	@Override public void mousePressed(MouseEvent arg0) {}
	@Override public void mouseReleased(MouseEvent arg0) {}
}
