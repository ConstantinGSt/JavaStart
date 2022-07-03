package com.startjava.graduation.bookshelf;
import java.io.IOException;
import java.io.ImputStraemReader;

public class BookshelfTest {
    public static void main(String[] args) throws IOException {
        int inputMenuOption;
        Bookshelf shelf = new Bookshelf;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("     Меню");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.print("выберите нужное действие и введите соответсвующий номер:");

        inputMenuOption = Integer.parseInt(reader.readLine());
        System.out.println("");

        
    }

}