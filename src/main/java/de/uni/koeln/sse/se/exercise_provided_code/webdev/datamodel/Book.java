package de.uni.koeln.sse.se.exercise_provided_code.webdev.datamodel;

public class Book {
	private Integer id;
	private String bookName;
	private String author;
	private Integer yearOfPublication;

	public Book() {}

	public Book(String bookName, String author, Integer yearOfPublication) {
		this.bookName = bookName;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String name) {
		this.bookName = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(Integer year) {
		this.yearOfPublication = year;
	}
}
