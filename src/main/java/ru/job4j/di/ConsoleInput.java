package ru.job4j.di;

import java.util.Scanner;

/**
 * ConsoleInput.
 * <p>
 * Sample class for test DI.
 *
 * @author fourbarman (maks.java@yandex.ru).
 * @version %I%, %G%.
 * @since 09.03.2023.
 */
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
