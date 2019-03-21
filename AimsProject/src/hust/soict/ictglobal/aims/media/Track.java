package hust.soict.ictglobal.aims.media;

public class Track implements Playable
{
	private int length;
	private String title;
	
	public int getLength()
	{
		return length;
	}
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void play()
	{
		System.out.println("Track title: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
}
