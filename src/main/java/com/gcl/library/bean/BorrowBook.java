package com.gcl.library.bean;

/**
 * Bean: 借阅书籍
 * @author gcl
 *
 */
public class BorrowBook {
	
	/** 条码号 */
	private String num;
	/** 书名 */
	private String bookName;
	/** 借阅日期 */
	private String borrowDate;
	/** 应还日期 */
	private String returnDate;
	/** 馆藏地 */
	private String place;
	
	public BorrowBook(){
		
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "BorrowBook [num=" + num + ", bookName=" + bookName + ", borrowDate=" + borrowDate + ", returnDate="
				+ returnDate + ", place=" + place + "]";
	}
}
