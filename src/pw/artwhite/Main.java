package pw.artwhite;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Главный класс запускающий игру
 *
 * @author artwhite
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Ship ship = new Ship();
        ArrayList<String> position = new ArrayList(10);

        setRandomPositionOfShip(position);

        ship.setLocation(position);
        String testor = null;
        int countOfAttempts = 0;
        do {
            System.out.print("Куда будете бить - ");
            testor = ship.checkShip(sc.nextLine());
            System.out.println(testor);
            countOfAttempts++;
        }while (testor != "Вы выиграли");

        System.out.print("Кол-во попыток - " + countOfAttempts);
    }

    private static void setRandomPositionOfShip(ArrayList<String> position) {
        int randomNum = (int) (Math.random()*10);
        for (int i = 0; i < 3; i++){
            position.add(""+randomNum);
            randomNum++;
        }
    }
}