package ru.netology.hwmockito.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldAddPosters() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентльмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");


        String[] expected = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентльмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один"
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFindLastLimitQuantity() {
        PosterManager manager = new PosterManager();


        manager.addPoster("Отель Белград");
        manager.addPoster("Джентльмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");

        String[] actual = manager.findLast();

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентльмены",
                "Отель Белград",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFindLastAboveLimit() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентльмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");

        String[] actual = manager.findLast();

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентльмены",
                "Отель Белград",
        };

     Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFindLastUnderLimit() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");

        String[] actual = manager.findLast();

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFindLastWithChangedSizeOfAndUnderLimit() {
        PosterManager manager1 = new PosterManager(4);

        manager1.addPoster("Человек-невидимка");
        manager1.addPoster("Тролли. Мировой тур");
        manager1.addPoster("Номер один");

        String[] actual = manager1.findLast();

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFindLastWithChangedSizeOfAndAboveLimit() {
        PosterManager manager1 = new PosterManager(3);

        manager1.addPoster("Бладшот");
        manager1.addPoster("Вперед");
        manager1.addPoster("Отель Белград");
        manager1.addPoster("Джентльмены");
        manager1.addPoster("Человек-невидимка");
        manager1.addPoster("Тролли. Мировой тур");
        manager1.addPoster("Номер один");

        String[] actual = manager1.findLast();

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFindLastWithChangedSizeOfAndLimitQuantity() {
        PosterManager manager1 = new PosterManager(3);

        manager1.addPoster("Человек-невидимка");
        manager1.addPoster("Тролли. Мировой тур");
        manager1.addPoster("Номер один");

        String[] actual = manager1.findLast();

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
        };

        Assertions.assertArrayEquals(expected, actual);
    }
}
