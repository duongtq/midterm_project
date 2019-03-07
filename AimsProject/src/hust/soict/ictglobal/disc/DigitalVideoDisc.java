package hust.soict.ictglobal.disc;

public class DigitalVideoDisc
{
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	// Constructors
	// By title
	public DigitalVideoDisc(String title)
	{
		super();
		this.title = title;
	}
	
	// By category and title
	public DigitalVideoDisc(String title, String category)
	{
		super();
		this.category = category;
		this.title    = title;
	}
	
	// By title, category and director's name 
	public DigitalVideoDisc(String title, String category, String director)
	{
		super();
		this.director = director;
		this.category = category;
		this.title    = title;
	}
	
	// By all attributes
	public DigitalVideoDisc(String title, String category, String director, int length, float cost)
	{
		super();
		this.title    = title;
		this.category = category;
		this.director = director;
		this.length   = length;
		this.cost     = cost;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return this.director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return this.cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean search(String title)
	{
		if ( this.title.toLowerCase().contains(title.toLowerCase()) )
		{
			return true;
		}
		return false;
	}
	
}