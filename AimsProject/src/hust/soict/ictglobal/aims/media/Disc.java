package hust.soict.ictglobal.aims.media;

public class Disc extends Media
{
	private int length;
	private String director;
	
	public Disc()
	{
		
	}
	
	public Disc(String title)
	{
		super(title);
	}
	
	public Disc(String title, String category)
	{
		super(title, category);
	}

	public Disc(String title, String category, float cost)
	{
		super(title, category, cost);
	}

	public int getLength()
	{
		return length;
	}
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public String getDirector()
	{
		return director;
	}
	
	public void setDirector(String director)
	{
		this.director = director;
	}
	
	

}
