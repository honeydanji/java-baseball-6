package baseball.model;

import baseball.Utils.ExceptionProcess;
import baseball.Utils.GameMessage;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerAndUserSetting {
    private final int MAX_INPUT = 3;
    private final int MAX_INPUT_RANGE = 9;
    private final int MIN_INPUT_RANGE = 1;

    public List<Integer> computerSetting() {
        // ComputerPutData
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < MAX_INPUT) {
            int randomNumber = Randoms.pickNumberInRange(MIN_INPUT_RANGE, MAX_INPUT_RANGE);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public List<Integer> userSetting() {
        ExceptionProcess exceptionProcess = new ExceptionProcess();
        // UserInputData
        List<Integer> user = new ArrayList<>();
        while (user.size() < MAX_INPUT) {
            System.out.print(GameMessage.INPUT);
            String input = Console.readLine();
            exceptionProcess.allUserException(input);
            String[] userInput = input.split("");
            for (int i = 0; i < MAX_INPUT; i++) {
                int num = Integer.parseInt(userInput[i]);
                user.add(num);
            }
        }
        return user;
    }
}
