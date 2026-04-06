package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        InputCarName Names = new InputCarName();
        InputTotalMoves Moves = new InputTotalMoves();

        List<Car> cars = Names.getCars();
        int MoveCount = Moves.getTotalMoves();
        System.out.println();

        Racing race = new Racing(cars, MoveCount);
        race.StartRacing();

        OutputWinner Winner = new OutputWinner(cars);
        Winner.printWinner();
    }
}