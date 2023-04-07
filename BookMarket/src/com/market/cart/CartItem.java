package com.market.cart;

import com.market.bookitem.Book;

public class CartItem {

	//private String[] itemBook = new String[7];
	private Book itemBook; //장바구니 담은 책 정보
	private String bookID; //장바구니 담은 책 ISBN
	private int quantity; //책 개수
	private int totalPrice; //책1권가격 * 장바구니담은 개수
	
	public CartItem() {
		
	}
	/*
	public CartItem(String[] book) {
		this.itemBook = book;
		this.bookID = book[0];
		this.quantity = 1;
		updateTotalPrice();
	}
	public String[] getItemBook() {
		return itemBook;
	}
	public void setItemBook(String[] itemBook) {
		this.itemBook = itemBook;
	}*/
	
	//생성자
	//booklist : 장바구니 담은 책 1가지
	public CartItem(Book booklist) {
		this.itemBook = booklist;
		this.bookID = booklist.getBookId();
		this.quantity = 1;
		updateTotalPrice();
	}
	
	public Book getItemBook() {
		return itemBook;
	}
	
	public void setItemBook(Book itemBook) {
		this.itemBook = itemBook;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getBookID() {
		return bookID;
	}
	
	public void setBookID(String bookID) {
		this.bookID = bookID;
		this.updateTotalPrice();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void updateTotalPrice() {
		//totalPrice = Integer.parseInt(this.itemBook[2])*this.quantity;
		totalPrice = this.itemBook.getUnitPrice()*this.quantity;		
	}

}
