package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main.
 *
 * @author fourbarman (maks.java@yandex.ru).
 * @version %I%, %G%.
 * @since 09.03.2023.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();
        context.register(Store.class);
        context.register(ConsoleInput.class);
        context.register(StartUI.class);
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Ivan Ivanov");
        ui.print();
    }
}
