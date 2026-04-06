package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Racing {
    private List<Car> cars;
    private int MoveCount;

    Racing(List<Car> cars, int MoveCount) {
        this.cars = cars;
        this.MoveCount = MoveCount;
    }

    public void StartRacing() {
        System.out.println("실행 결과");

        for (int i = 0; i < MoveCount; i++) {

            playOneRound();
            printCars();

        }
    }

    private void playOneRound(){
        for (Car car : cars) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                car.Move();
            }
        }
    }

    private void printCars() {
        for (Car car : cars) {
            String str = car.getName() + " : " + "-".repeat(car.getMovement());
            System.out.println(str);
        }
        System.out.println();
    }


}
