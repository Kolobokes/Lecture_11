package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.NewFilm;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void AddFilm3() {
        PosterManager manager = new PosterManager();
        NewFilm first = new NewFilm(1, "first", "fantastic", "test url");
        NewFilm second = new NewFilm(1, "second", "fantastic", "test url");
        NewFilm third = new NewFilm(1, "third", "fantastic", "test url");

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);

        NewFilm[] actual = manager.getFilms();

        assertEquals(3, actual.length);
    }

    @Test
    void AddFilm11() {
        PosterManager manager = new PosterManager();
        NewFilm f1 = new NewFilm(1, "first", "fantastic", "test url");
        NewFilm f2 = new NewFilm(1, "second", "fantastic", "test url");
        NewFilm f3 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f4 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f5 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f6 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f7 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f8 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f9 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f10 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f11 = new NewFilm(1, "third", "fantastic", "test url");

        manager.addFilm(f1);
        manager.addFilm(f2);
        manager.addFilm(f3);
        manager.addFilm(f4);
        manager.addFilm(f5);
        manager.addFilm(f6);
        manager.addFilm(f7);
        manager.addFilm(f8);
        manager.addFilm(f9);
        manager.addFilm(f10);
        manager.addFilm(f11);

        NewFilm[] actual = manager.getFilms();

        assertEquals(11, actual.length);
    }

    @Test
    void showLastFilm1() {
        PosterManager manager = new PosterManager();
        NewFilm f1 = new NewFilm(1, "first", "fantastic", "test url");

        manager.addFilm(f1);

        NewFilm[] actual = manager.showLastFilm();

        NewFilm[] expected = new NewFilm[1];
        expected[0] = f1;

        assertArrayEquals(expected, actual);

    }

    @Test
    void showLastFilm10() {
        PosterManager manager = new PosterManager();
        NewFilm f1 = new NewFilm(1, "first", "fantastic", "test url");
        NewFilm f2 = new NewFilm(1, "second", "fantastic", "test url");
        NewFilm f3 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f4 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f5 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f6 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f7 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f8 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f9 = new NewFilm(1, "third", "fantastic", "test url");
        NewFilm f10 = new NewFilm(1, "third", "fantastic", "test url");

        manager.addFilm(f1);
        manager.addFilm(f2);
        manager.addFilm(f3);
        manager.addFilm(f4);
        manager.addFilm(f5);
        manager.addFilm(f6);
        manager.addFilm(f7);
        manager.addFilm(f8);
        manager.addFilm(f9);
        manager.addFilm(f10);

        NewFilm[] actual = manager.showLastFilm();

        NewFilm[] expected = new NewFilm[10];
        expected[0] = f10;
        expected[1] = f9;
        expected[2] = f8;
        expected[3] = f7;
        expected[4] = f6;
        expected[5] = f5;
        expected[6] = f4;
        expected[7] = f3;
        expected[8] = f2;
        expected[9] = f1;

        assertArrayEquals(expected, actual);

    }
}