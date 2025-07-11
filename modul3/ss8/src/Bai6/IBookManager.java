package Bai6;

import java.util.List;

interface IBookManager {
    void addBook(Book book);
    void removeBook(String isbn);
    void displayBooks();
}