package model;

    public class Book{
        private int bookId;
        private String title;
        private String author;
        private double price;
        private int stock;

        // Constructor for creating a new book (no ID yet)
        public Book(String title, String author, double price, int stock) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.stock = stock;
        }

        // Constructor for full book object (e.g., when retrieving from database)
        public Book(int bookId, String title, String author, double price, int stock) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
            this.stock = stock;
        }

        // Getters and Setters
        public int getBookId() {
            return bookId;
        }

        public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public String toString() {
            return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author +
                    ", price=" + price + ", stock=" + stock + "]";
        }
    }


