package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class Bookshelf {
	String end;
	Scanner scan;
	Book[] bookShelf = new Book[10];
	Book addBook;
	int inputMenuOption;
		
	void startGame() {
		do {
			menu();
			if(scan.hasNextInt()) {
				inputMenuOption = scan.nextInt();
				if(inputMenuOption == 1) {
					menuInfo(inputMenuOption);
					break;
				} else if(inputMenuOption == 2) {
					addBooksToShelf();
					break;
					}
			} else if(scan.hasNextLine()) {
				end = scan.nextLine();
			}
		} while(end != "end");
	}
	
	public void addBooksToShelf() {
		for(int i = 0; i < bookShelf.length;i++) {
			if(bookShelf[i] == null) {
				System.out.println("Добавьте книгу в следующем формате: Автор Ф И О Enter" + "\n" + "Название Enter"
						+ "\n" + "год издания Enter");
				bookShelf[i] = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
			} else if(bookShelf[bookShelf.length-1] != null) {
				System.out.println("Сейчас на полке свободных мест нет.");
			}
		}
	}	

		
	public void menuInfo(int num) { // num должен всегда равняться 1
		inputMenuOption = scan.nextInt();
			int booksInShelf = 0;
			int freeInShelf = 0;
			for (int i = 0; i < bookShelf.length; i++) {
				if (bookShelf[i] != null) {
					booksInShelf++;
					System.out.print("[K]");
				} else if (bookShelf[i] == null) {
					System.out.print("[]");
					freeInShelf++;
				}					
			} System.out.println(
			"\n" + "Книг на полке: " + booksInShelf + "\n" + "Свободное место для " + freeInShelf + " книг");
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
