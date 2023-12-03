package de.uni.koeln.sse.se.exercise_provided_code.webdev.datamodel;

public class Book {
	private Integer id;
	private String name;
	private String author;
	private Integer year;
	
	public Book() {}

	public Book(String name, String author, Integer year) {
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}
