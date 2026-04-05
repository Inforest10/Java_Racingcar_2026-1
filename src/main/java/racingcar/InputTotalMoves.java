package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class InputTotalMoves {
    public int getTotalMoves() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();

        Validator.CheckCount(input);

        return Integer.parseInt(input);
    }
}
