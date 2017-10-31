package pw.artwhite;

import java.util.ArrayList;

/**
 * Класс шип обрабатывающий выстрелы пользователя
 */


public class Ship {
    private ArrayList<String> location;

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    /**
     * Метод возвращает результат проверки выстрела на попадание
     *
     * @param shot - координаты выстрела
     */
    public String checkShip(String shot){
        String res = "Мимо";
        int shots = location.indexOf(shot);

        if (shots == 0){
            res = "Попал";
            location.remove(shot);
        }

        if(location.size() == 0){
            res = "Вы выиграли";
        }
        return res;
    }
}
