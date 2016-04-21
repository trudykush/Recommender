/**
 * A class to represent a movie case
 * 
 * Michael O'Mahony
 * 10/01/2013
 */

package alg.cases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MovieCase implements Case
{
	private Integer id; // the case id
	private String title; // the movie title
	private Set<String> genres; // the movie genres
	private Set<String> directors; // the movie directors
	private Set<String> actors; // the lead actors
	private Double popularity;
	private Double meanrating;
	
	/**
	 * constructor - creates a new MovieCase object
	 * @param id - the case id
	 */
	public MovieCase(final Integer id, Double popularity, Double meanratings) {
		this.id = id;
		title = null;
		genres = new HashSet<String>();
		directors = new HashSet<String>();
		actors = new HashSet<String>();
		this.popularity = popularity;
		this.meanrating = meanratings;
	}
	
	/**
	 * constructor - creates a new MovieCase object
	 * @param id - the case id
	 * @param title - the movie title
	 * @param genres - the movie genres
	 * @param directors - the movie directors
	 * @param actors - the lead actors
	 */
	public MovieCase(final Integer id, final String title, final ArrayList<String> genres, final ArrayList<String> directors, final ArrayList<String> actors, Double popularity, Double meanrating)
	{
		this(id, popularity, meanrating);
		this.title = title;
		
		for(String genre: genres)
			this.genres.add(genre);
		
		for(String director: directors)
			this.directors.add(director);
		
		for(String actor: actors)
			this.actors.add(actor);
	
	}
	
	/**
	 * @returns the case id
	 */
	public Integer getId()
	{
		return id;
	}
	
	/**
	 * @returns the movie title
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * @returns the movie genres
	 */
	public Set<String> getGenres()
	{
		return genres;
	}
	
	/**
	 * @returns the movie directors
	 */
	public Set<String> getDirectors()
	{
		return directors;
	}
	
	/**
	 * @returns the lead actors
	 */
	public Set<String> getActors()
	{
		return actors;
	}
	
	public Double getpopularity()
	{
		return popularity;
	}
	
	public Double getmeanrating()
	{
		return meanrating;
	}
	
	/**
	 * @returns a string representation of the MovieCase object
	 */
	public String toString()
	{
		return id + " " + title + " " + genres.toString() + " " + directors.toString() + " " + actors.toString() + " " + popularity + "" + meanrating ;
	}
}
