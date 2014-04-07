package edu.sjsu.cmpe.library.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import edu.sjsu.cmpe.library.domain.Book;

@JsonPropertyOrder(alphabetic = true)
public class BooksDto extends LinksDto {
    private List<Book> books;

    /**
     * @param book
     */
    public BooksDto(List<Book> books) {
	super();
	this.books = books;
    }

    /**
     * @return the book
     */
    public List<Book> getBooks() {
	return books;
    }

    /**
     * @param book
     *            the book to set
     */
    public void setBooks(List<Book> books) {
	this.books = books;
    }
}
