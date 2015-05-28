package com.sangupta.feedjson;

import java.io.File;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.io.FileUtils;

import com.sangupta.feedjson.model.FeedItems;
import com.sangupta.jerry.util.AssertUtils;
import com.sangupta.jerry.util.GsonUtils;

/**
 * Utility class to parse the feed items JSON input
 * and return a strongly typed {@link FeedItems} instance.
 * 
 * @author sangupta
 *
 */
public class FeedJsonParser {

	/**
	 * Parse the given {@link String} into a {@link FeedItems} instance.
	 * 
	 * @param json
	 * @return
	 */
	public static FeedItems parse(String json) {
		if(AssertUtils.isEmpty(json)) {
			throw new IllegalArgumentException("JSON input cannot be null/empty");
		}
		
		return GsonUtils.getGson().fromJson(json, FeedItems.class);
	}
	
	/**
	 * Parse the input from the given {@link Reader} into a {@link FeedItems} instance.
	 * 
	 * @param reader
	 * @return
	 */
	public static FeedItems parse(Reader reader) {
		if(reader == null) {
			throw new IllegalArgumentException("Reader cannot be null");
		}
		
		return GsonUtils.getGson().fromJson(reader, FeedItems.class);
	}
	
	/**
	 * Parse the input from given {@link File} into a {@link FeedItems} instance.
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static FeedItems parse(File file) throws IOException {
		if(file == null) {
			throw new IllegalArgumentException("File instance cannot be null");
		}
		
		if(!file.exists()) {
			throw new IllegalArgumentException("File does not exist.");
		}
		
		if(!file.isFile()) {
			throw new IllegalArgumentException("File does not appear to be a valid file.");
		}
		
		if(!file.canRead()) {
			throw new IllegalArgumentException("Read permissions are not available for the given file.");
		}

		String json = FileUtils.readFileToString(file);
		return GsonUtils.getGson().fromJson(json, FeedItems.class);
	}
	
}
