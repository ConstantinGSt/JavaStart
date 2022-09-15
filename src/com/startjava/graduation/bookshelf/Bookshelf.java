package com.startjava.graduation.bookshelf;

import java.util.Objects;
import java.util.Scanner;

public class Bookshelf {
    String end = "go";
    Scanner scan = new Scanner(System.in);
    Book[] bookShelf = new Book[10];
//    Book addBook = new Book("Калдырь Мелонхоличный", "Как прибухнуть на самоизоляции в тайне от жОны", "2022г Весна");
//    bookShelf[0] = addBook;
    int inputMenuOption;

    void startGame() {
        do {
            menu();
            if(scan.hasNextInt()) {
                inputMenuOption = scan.nextInt();
                if(inputMenuOption == 1) {
                    menuInfo(inputMenuOption);
                } else if(inputMenuOption == 2) {
                    addBooksToShelf();
                }
            } else if(scan.hasNextLine()) {
                end = scan.nextLine();
//            } else if(inputMenuOption == 3) {

            }
        } while(!end.equals("end"));
        System.out.println("Конец программы");
    }

    public void addBooksToShelf() {   // добавляя книгу на полку
        for(int i = 0; i < bookShelf.length; i++) {
            if(bookShelf[i] == null) {
                System.out.println("Добавьте книгу в следующем формате: Автор Ф И О Enter" + "\n" + "Название Enter"
                        + "\n" + "год издания Enter");
                scan.nextLine();
                bookShelf[i] = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
                break;
            } else if(bookShelf[bookShelf.length - 1] != null) {
                System.out.println("Сейчас на полке свободных мест нет.");
                menuInfo(1);
            }
        }
    }


    public void menuInfo(int num) { // num должен всегда равняться 1
        int booksInShelf = 0;
        int freeInShelf = 0;
        for(int i = 0; i < bookShelf.length; i++) {
            if(bookShelf[i] != null) {
                booksInShelf++;
                System.out.print("[K]");
            } else if(bookShelf[i] == null) {
                System.out.print("[]");
                freeInShelf++;
            }
        }
        System.out.println(
                "\n" + "Книг на полке: " + booksInShelf + "\n" + "Свободное место для " + freeInShelf + " книг" + "\n");
    }

    public void menu() {
        System.out.println("     Меню");
        System.out.println("1. Информация о полке.");
        System.out.println("2. Добавить книгу.");
        System.out.println("3. Удалить книгу.");
        System.out.println("4. Информацяи о книге.");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("Для выбора необходимого действия введите соответсвующий номер,"
                + "для прекращения работы напишите 'end'");
    }
}
