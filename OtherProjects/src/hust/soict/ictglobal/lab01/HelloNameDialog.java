package hust.soict.ictglobal.lab01;

import javax.swing.JOptionPane;
public class HelloNameDialog
{
	public static void main(String args[])
	{
		String result;
		result = JOptionPane.showInputDialog("Please input your name: ");
		JOptionPane.showMessageDialog(null, "Hi " + result + "!");
		System.exit(0);
	}
}