package racingcar;

public class Car {
    private String name;
    private int movement = 0;

    public Car(String name) {
        this.name = name;
    }

    public void Move() {
        movement++;
    }

}
