package ds_practice;

import java.util.*;

class Book {
    private int id;
    private String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "[ Book id:" + this.getId() + " name:" + this.getName() + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }

        Book book = (Book) obj;

        return this.name == book.name && this.hashCode() == book.hashCode();

    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

class SortByName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortById implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getId() - o2.getId();
    }

}

public class EqualityOfArrays {
    public static void main(String[] args) {
        Book[] books = { new Book(1, "harsh"), new Book(2, "tarak"), new Book(3, "harsh dusane"),
                new Book(4, "tarak dusane"), new Book(5, "hash map") };

        Book[] books1 = { new Book(1, "harsh"), new Book(2, "tarak"), new Book(3, "harsh dusane"),
                new Book(4, "tarak dusane"), new Book(5, "hash map") };

        // Arrays.sort(books, new SortByName());
        System.out.println(Arrays.toString(books));

        // System.out.println(new Book(1,"harsh").equals(new Book(1,"harsh")));
        System.out.println(Arrays.equals(books, books1));

    }

}