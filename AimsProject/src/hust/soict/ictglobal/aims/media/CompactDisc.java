package hust.soict.ictglobal.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable
{
	public CompactDisc()
	{
		super();
	}
	
	private String artist;
	private int length;
	
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public String getArtist()
	{
		return artist;
	}
	
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	
	public void addTrack(Track track)
	{
		if ( tracks.contains(track) == true )
		{
			System.out.println(track.getTitle() + " is already in the list.");
			return;
		}
		
		tracks.add(track);
	}
	
	public void removeTrack(Track track)
	{
		if ( tracks.contains(track) != true )
		{
			System.out.println(track.getTitle() + " is not in the list yet.");
			return;
		}
		
		tracks.remove(track);
	}
	
	// Total length of a CD
	public int getLength()
	{
		int sum = 0;
		for ( int i = 0; i < tracks.size(); i++ )
		{
			sum = sum + tracks.get(i).getLength();
		}
		
		// Total length of a CompactDisc
		this.length = sum;		
		return this.length;
	}
	
	public void play()
	{
		for ( int i = 0; i < this.tracks.size(); i++ )
		{
			this.tracks.get(i).play();
		}
	}
}
