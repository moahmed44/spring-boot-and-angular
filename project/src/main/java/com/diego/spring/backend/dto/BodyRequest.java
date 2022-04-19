package com.diego.spring.backend.dto;

/**
 * Class that works transfering data from the body request
 * @author Diego Moran
 * @version: 1.0
 */
public class BodyRequest {

	private String categoryId;
	private String searchByName;
	private String searchByNumberEx;
	private String searchByType;
	
	
	public String getCategoryId() {
		return categoryId;
	}
	public String getSearchByName() {
		return searchByName;
	}
	public String getSearchByNumberEx() {
		return searchByNumberEx;
	}
	public String getSearchByType() {
		return searchByType;
	}
	
	
}
