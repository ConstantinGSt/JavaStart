package com.startjava.graduation.bookshelf;

import java.util.Objects;
import java.util.Scanner;

public class Bookshelf {
    String end = "go";
    Scanner scan = new Scanner(System.in);
    Book[] bookShelf = new Book[10];
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
                } else if(inputMenuOption == 3) {
                    removeBookFromShelf();
                } else if(inputMenuOption == 4) {
                    bookInfo();
                } else if(inputMenuOption == 5) {
                    // placeholder for future options
                } else if(inputMenuOption == 6) {
                    // placeholder for future options
                }
            } else if(scan.hasNextLine()) {
                end = scan.nextLine();
            }
        } while(!end.equals("end"));
        System.out.println("Конец программы");
    }
    public void displayBookshelf() {
        for(int i = 0; i < bookShelf.length; i++) {
            if(bookShelf[i] == null) {
                System.out.print("[] ");
            } else {
                System.out.print("[\\] ");
            }
        }
        System.out.println();
    }

    public void addBooksToShelf() {
        for(int i = 0; i < bookShelf.length; i++) {
            if(bookShelf[i] == null) {
                System.out.println("Добавьте книгу в следующем формате: Автор Ф И О Enter" + "\n" + "Название Enter" + "\n" + "год издания Enter");
                scan.nextLine();
                bookShelf[i] = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
                break;
            } else if(bookShelf[bookShelf.length - 1] != null) {
                System.out.println("Сейчас на полке свободных мест нет.");
                menuInfo(1);
            }
        }
    }

    public void removeBookFromShelf() {
        boolean bookFound = false;
        System.out.println("Введите название книги, которую хотите удалить:");
        scan.nextLine();
        String bookToRemove = scan.nextLine();

        for(int i = 0; i < bookShelf.length; i++) {
            if(bookShelf[i] != null && Objects.equals(bookShelf[i].title, bookToRemove)) {
                bookShelf[i] = null;
                bookFound = true;
                break;
            }
        }

        if(bookFound) {
            System.out.println("Книга успешно удалена.");
            menuInfo(1);
        } else {
            System.out.println("Книга с таким названием не найдена.");
            menuInfo(1);
        }
    }

    public void bookInfo() {
        boolean bookFound = false;
        System.out.println("Введите название книги, которую хотите найти:");
        scan.nextLine();
        String bookToFind = scan.nextLine();

        for(int i = 0; i < bookShelf.length; i++) {
            if(bookShelf[i] != null && Objects.equals(bookShelf[i].title, bookToFind)) {
                System.out.println("Автор: " + bookShelf[i].author);
                System.out.println("Название: " + bookShelf[i].title);
                System.out.println("Год издания: " + bookShelf[i].published);
                bookFound = true;
                break;
            }
        }
        if(!bookFound) {
            System.out.println("Книга с таким названием не найдена.");
            menuInfo(1);
        }
    }

    public void menu() {
        System.out.println("Выберите действие:");
        System.out.println("1 - Показать информацию о всех книгах на полке");
        System.out.println("2 - Добавить книгу на полку");
        System.out.println("3 - Удалить книгу с полки");
        System.out.println("4 - Найти книгу на полке");
        System.out.println("5 - Опции для будущих действий");
        System.out.println("6 - Опции для будущих действий");
        displayBookshelf();
    }

    public void menuInfo(int menuOption) {
        if(menuOption == 1) {
            for(Book book : bookShelf) {
                if(book != null) {
                    System.out.println(book.author + ", " + book.title + ", " + book.published);
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.startGame();
    }
}
