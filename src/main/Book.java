package main;


public class Book {
    private String bookname;
    private String author;
    private float price;
    private int id;
    private Date date;//借出日期

    public Book(){

    }//保留不带参数的构造方法

    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private class Date{
        private int year;
        private int month;
        private int day;
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public int getMonth() {
            return month;
        }
        public void setMonth(int month) {
            this.month = month;
        }
        public int getDay() {
            return day;
        }
        public void setDay(int day) {
            this.day = day;
        }

    }
    public void setDate(int year,int month,int day){
        this.date=date;
    }

    public void setBook(String bookname,int price,String author,Date date) {
        this.bookname=bookname;
        this.author=author;
        this.price=price;
        this.date=date;
    }


}
