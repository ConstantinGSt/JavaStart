package com.startjava.graduation.bookshelf;
import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        Book addBook = new Book("Калдырь Мелонхоличный", "Как прибухнуть на самоизоляции в тайне от жОны", "2022г Весна");
        shelf.bookShelf[0] = addBook;
        
//        Scanner scan = new Scanner(System.in);
//        shelf.scan.next();
        shelf.startGame();

    }

}