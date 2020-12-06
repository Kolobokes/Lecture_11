package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.NewFilm;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void addFilm() {
        PosterManager manager = new PosterManager();
        NewFilm first = new NewFilm(1, "first", "fantastic", "test url");
        NewFilm second = new NewFilm(1, "second", "fantastic", "test url");
        NewFilm third = new NewFilm(1, "third", "fantastic", "test url");

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);

        NewFilm[] tmp = new NewFilm[3];
        tmp[0] = first;
        tmp[1] = second;
        tmp[2] = third;

        NewFilm[] actual = manager.getFilms();

        assertArrayEquals(tmp, actual);
    }

    @Test
    void showLastFilm3() {
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
    void showLastFilm11() {
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
}