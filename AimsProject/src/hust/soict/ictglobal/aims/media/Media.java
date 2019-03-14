package hust.soict.ictglobal.aims.media;

public class Media {
	
	private String title;
	private String category;
	protected float cost;
	private static int id = 0;
	
	public Media()
	{
		Media.id = Media.id + 1;
	}
	
	// Constructor 1
	public Media(String title)
	{
		this.title = title;
		Media.id = Media.id + 1;
	}
	
	// Constructor 2
	public Media(String title, String category)
	{
		this.title    = title;
		this.category = category;
		Media.id = Media.id + 1;
	}
	
	public Media(String title, String category, float cost)
	{
		this.title    = title;
		this.category = category;
		this.cost     = cost;
		Media.id = Media.id + 1;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public int getId()
	{
		return Media.id;
	}
}
