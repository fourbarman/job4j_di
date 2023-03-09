package ru.job4j.di;

import java.util.ArrayList;
import java.util.List;
/**
 * Store.
 * <p>
 * Sample class for test DI.
 *
 * @author fourbarman (maks.java@yandex.ru).
 * @version %I%, %G%.
 * @since 09.03.2023.
 */
public class Store {
    private List<String> data = new ArrayList<>();

    public void add(String value) {
        data.add(value);
    }

    public List<String> getAll() {
        return data;
    }
}
