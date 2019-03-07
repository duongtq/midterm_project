/**
 * 
 */
package hust.soict.ictglobal.garbage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author TranQuyDuong
 *
 */
public class GarbageCreator {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		InputStream input_stream = new FileInputStream("text_file.txt");
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(input_stream));
		
		String line = "";
		
		String output_string = "";
		
		while ( line != null )
		{
			line = buf.readLine();
			output_string+= line;
			output_string+= "\n";
		}
		
		System.out.println(output_string);
		
		buf.close();
	}
}
