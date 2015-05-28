package com.sangupta.feedjson.model;

/**
 * 
 */
import java.util.List;

/**
 * A value object that represents a JSON based
 * representation of articles that are usually imported/exported
 * via a FeedReader like Google Reader, InoReader etc.
 * 
 * @author sangupta
 *
 */
public class FeedItems {

	public String id;
	
	public String title;
	
	public String description;
	
	public long updated;
	
	public List<FeedItem> items;
	
}
