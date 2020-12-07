package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.NewFilm;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PosterManager {
    private int numberOfFilmsToBeShown;
    private NewFilm[] films = new NewFilm[numberOfFilmsToBeShown];

    public PosterManager(
            int numberOfFilmsToBeShown
    ){
        this.numberOfFilmsToBeShown = 10;
    }

    public void addFilm(NewFilm film){
        int length = films.length + 1;
        NewFilm[] tmp = new NewFilm[length];

        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public NewFilm[] showLastFilm(){
        if(numberOfFilmsToBeShown == 0 ){
            numberOfFilmsToBeShown = 10;
        };

        if (films.length < numberOfFilmsToBeShown){
            numberOfFilmsToBeShown = films.length;
        };

        NewFilm[]  result = new NewFilm[numberOfFilmsToBeShown];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
