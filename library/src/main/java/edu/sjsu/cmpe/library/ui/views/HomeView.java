package edu.sjsu.cmpe.library.ui.views;

import com.yammer.dropwizard.views.View;

import edu.sjsu.cmpe.library.domain.Book;

public class HomeView extends View {
    private final Book book;

    public HomeView(Book book) {
	super("home.mustache");
	this.book = book;
    }

    public Book getBook() {
	return book;
    }
}
