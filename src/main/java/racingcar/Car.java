package racingcar; // 이 선언이 없으면 Car 클래스를 찾지 못합니다.


public class Car {
    private String name;
    private int movement = 0;

    public Car(String name) {
        this.name = name;
    }

    public void Move() {
        movement++;
    }

    public String getName() {
        return this.name;
    }

    public int getMovement() {
        return this.movement;
    }

}
