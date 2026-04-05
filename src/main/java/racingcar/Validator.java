package racingcar; // 이 선언이 없으면 Car 클래스를 찾지 못합니다.

import java.util.List; // List 타입을 사용하기 위해 필요합니다.
import java.util.ArrayList;

public class Validator {

    public static void CheckNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (name.isEmpty())     throw new IllegalArgumentException("이름은 빈 값일 수 없습니다.");
            if (name.length() > 5)  throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
            if (name.contains(" ")) throw new IllegalArgumentException("이름에 공백이 포함될 수 없습니다.");
        }

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    throw new IllegalArgumentException("중복된 이름이 있습니다.");
                }
            }
        }
    }

    public static void CheckCount(String number) {

        int count;

        try {
            count = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }

        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
    }
}
