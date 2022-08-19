package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class Bookshelf {
	String end;
	Scanner scan = new Scanner(System.in);
	Book[] bookShelf = new Book[10];
	Book addBook;
	int inputMenuOption;
	

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

	void startGame() {
		
		do {
			menu();
			end="W";
			if (scan.hasNextInt()) {
				inputMenuOption = scan.nextInt();
				if (inputMenuOption == 1) {
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
				} else if (inputMenuOption == 2) {
					do {
						for(int i = 0; i < bookShelf.length;i++) {
							if("x".equals(end)==true) {
							break;
							}else if(bookShelf[i] == null) {
								System.out.println("Добавьте книгу в следующем формате: Автор Ф И О Enter" + "\n" + "Название Enter"
										+ "\n" + "год издания Enter");
								addBook = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
								
								bookShelf[i] = addBook;
								System.out.println(
								bookShelf[i].autor + "\n" + bookShelf[i].title + "\n" + bookShelf[i].published + "\n");
								end = "x";
							}
						}	
					}while("x".equals(end)!=true);
//				} else if(inputMenuOption == 3) {
//				} else if(inputMenuOption == 4) {
//				} else if(inputMenuOption == 5) {
//				} else if(inputMenuOption == 6) {
				}
				
			} else if(scan.hasNextLine()) {
				end = scan.nextLine();
			}
		} while("end".equals(end)!=true);
		scan.close();
	}
}
