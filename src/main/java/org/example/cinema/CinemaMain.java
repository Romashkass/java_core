package org.example.cinema;

import java.util.Random;

public class CinemaMain {
    public static void main(String[] args) {
        FilmType[] types = new FilmType[]{
                new FilmType("Film8", 1.2),
                new FilmType("Film16", 1),
                new FilmType("Film32", 1.5)
        };

        double maxTaxCoefficient = -1;
        double avgTaxCoefficient = 0;
        for (FilmType type: types) {
            type.display();

            if (type.getTaxCoefficient() > maxTaxCoefficient) {
                maxTaxCoefficient = type.getTaxCoefficient();
            }

            avgTaxCoefficient += type.getTaxCoefficient();
        }
        avgTaxCoefficient /= types.length;

        types[types.length - 1].setTaxCoefficient(1.3);

        System.out.println("maxTaxCoefficient: " + maxTaxCoefficient);
        System.out.println("avgTaxCoefficient: " + avgTaxCoefficient);
        System.out.println("types[types.length - 1].getTaxCoefficient(): " + types[types.length - 1].getTaxCoefficient());
        System.out.println("=======================================");

        Film[] films = new Film[]{
                new Film(types[0], "Бэтмен", "1111", 2022, 2015, "Боевик", Color.COLOR),
                new Film(types[0], "Супермен возвращается", "87812", 2500, 2014, "Боевик", Color.COLOR),
                new Film(types[0], "Пираты силиконовой долины", "4356", 12080, 2019, "Драма", Color.COLOR),
                new Film(types[1], "Гадкий я", "2866", 1200, 2006, "Мультфильм", Color.BLACK_WHITE),
                new Film(types[1], "Арманеддон", "8876", 2200, 2019, "Боевик", Color.COLOR),
                new Film(types[2], "Полицейская академия", "4544", 3000, 2016, "Комедия", Color.BLACK_WHITE),
                new Film(types[2], "Ограбление казино", "9087", 1200, 2020, "Боевик", Color.COLOR)
        };
        Helper.printFilms(films);
        System.out.println();
        Helper.printFilms(Helper.sortFilms(films));

//        Film[] films2 = new Film[]{
//                new Film(types[0], "Бэтмен", "1232", 0.5, 2015, "Боевик", Color.COLOR),
//                new Film(types[0], "Бэтмен 2", "3456", 0.5, 2014, "Боевик", Color.COLOR),
//                new Film(types[0], "Супермен", "9635", 1, 2019, "Боевик", Color.COLOR),
//                new Film(types[1], "Астрал", "1132", 1, 2006, "Ужасы", Color.BLACK_WHITE),
//                new Film(types[1], "Миссия невыполнима", "0098", 1, 2019, "Боевик", Color.COLOR),
//                new Film(types[2], "Аватар", "6843", 3, 2016, "Боевик", Color.COLOR),
//                new Film(types[2], "Аватар 2", "3863", 3, 2020, "Боевик", Color.COLOR),
//        };


    }

    static class Helper {
        public static void printFilms(Film[] films) {
            for (Film film: films) {
                System.out.println(film);
            }
        }

        private static Film[] sortFilms(Film[] films) {
            return recursiveQuickSort(films, 0, films.length);
        }

        private static Film[] recursiveQuickSort(Film[] films, int left, int right) {
            if (right <= left) {
                return films;
            }
            int a = new Random().nextInt(right - left) + left;
            swap(films, left, a);

            int i = left + 1;
            Film pivot = films[left];
            for (int j = i; j < right; j++) {
                if (pivot.compareTo(films[j]) > 0) {
                    swap(films, i, j);
                    i++;
                }
            }
            swap(films, left, i - 1);

            int middleSectionEnd = i;
            for (int j = i; j < right; j++) {
                if (pivot.compareTo(films[j]) == 0) {
                    swap(films, middleSectionEnd, j);
                    middleSectionEnd++;
                }
            }

            recursiveQuickSort(films, left, i - 1);
            recursiveQuickSort(films, middleSectionEnd, right);

            return films;
        }

        private static void swap(Film[] films, int first, int second) {
            Film tmp = films[first];
            films[first] = films[second];
            films[second] = tmp;
        }
    }
}
