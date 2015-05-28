package com.sangupta.feedjson.model;

public class FeedItem {
	
	public long crawlTimeMSec;
	
	public long timestampUSec;
	
	public String id;
	
	public String[] categories;
	
	public String title;
	
	public long published;
	
	public long updated;
	
	public long starred;

	public FeedItemSummary summary;
	
	public FeedItemOrigin origin;
	
	public String author;
	
	public String authorUrl;
	
	public FeedLink canonical;
	
	public FeedLink alternate;
	
}
