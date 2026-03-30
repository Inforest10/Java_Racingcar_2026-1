package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

class Car {
    String name;
    int count = 0;
    public void move() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            count++;
        }
    }
}


public class Application {
    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String temp_name = Console.readLine();

        String[] cars = temp_name.split(",");

        for (int i = 0; i < cars.length; i++) {
            String name = cars[i];

            // 빈 값 검증
            if (name.isEmpty()) {
                throw new IllegalArgumentException("이름은 빈 값일 수 없습니다.");
            }
            // 5자 초과 검증
            if (name.length() > 5) {
                throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
            }
            // 공백 포함 검증
            if (name.contains(" ")) {
                throw new IllegalArgumentException("이름에 공백이 포함될 수 없습니다.");
            }
        }

        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].equals(cars[j])) {
                    throw new IllegalArgumentException("중복된 이름이 있습니다.");
                }
            }
        }



        int carCount = cars.length;
        Car[] car = new Car[carCount];
        for (int i = 0; i < carCount; i++) {
            car[i] = new Car();
            car[i].name = cars[i];
        }

        System.out.println("시도할 회수는 몇회인가요?");
        String countInput = Console.readLine();
        int count = Integer.parseInt(countInput);

        try {
            count = Integer.parseInt(countInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }

        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }

        System.out.println();
        System.out.println("실행 결과");

        for (int i = 0; i < count; i++) {


            for (int j = 0; j < carCount; j++) {

                car[j].move();
            }

            for (int k = 0; k < carCount; k++) {
                String dashes = "-".repeat(car[k].count);
                String temp_str = car[k].name + " : " + dashes;
                System.out.println(temp_str);
            }


            System.out.println();
        }


        int maxCount = 0;
        for (int i = 0; i < carCount; i++) {
            if (car[i].count > maxCount) {
                maxCount = car[i].count;
            }
        }

        String winner = "최종 우승자 : ";
        for (int i = 0; i < carCount; i++) {
            if(car[i].count == maxCount) {
                winner += car[i].name + ", ";
            }
        }

        winner = winner.substring(0, winner.length() - 2);
        System.out.println(winner);
    }


}