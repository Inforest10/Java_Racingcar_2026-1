package racingcar;

import java.util.Comparator;
import java.util.List;

public class OutputWinner {
    private List<Car> cars;
    private int boundary;

    OutputWinner(List<Car> cars) {
        this.cars = cars;
    }

    public void printWinner() {
        cars.sort(Comparator.comparingInt(Car::getMovement).reversed());
        boundary = cars.get(0).getMovement();
        String winner = "최종 우승자 : ";
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getMovement() == boundary)
                winner += cars.get(i).getName() + ", ";
        }
        winner = winner.substring(0, winner.length() - 2);
        System.out.println(winner);
    }

}
