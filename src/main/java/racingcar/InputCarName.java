package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputCarName {

    public List<Car> getCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] names = input.split(",");

        Validator.CheckNames(names);

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            carList.add(new Car(names[i]));
        }

        return carList;
    }
}
