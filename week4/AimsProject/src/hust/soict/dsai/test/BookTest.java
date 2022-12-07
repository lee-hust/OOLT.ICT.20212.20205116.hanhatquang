package hust.soict.dsai.test;

import hust.soict.dsai.aims.media.Book;

public class BookTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book book1 = new Book("Doremon", "comic", "i can can the can but the can cannot can me", 15, "quang ha", "quang");
        Book book2 = new Book("Conan", "comic", "hi hi hi hi", 18, "quang ha", "quang");
        Book book3 = new Book("Conan", "comic", "hello world", 18, "quang ha", "quang");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }

}
