package baseball.Controller;

import baseball.model.ComputerAndUserSetting;
import java.util.List;

public class StartGame {
    private final InputContrast inputContrast = new InputContrast();
    private final ComputerAndUserSetting computerAndUserSetting = new ComputerAndUserSetting();

    // 변수명 변경
    public void start() {
        // 컴퓨터와 유저 데이터 셋팅
        List<Integer> computer = computerAndUserSetting.computerSetting();
        List<Integer> user = computerAndUserSetting.userSetting();
        Boolean enter;
        // Service 이동 >> Controller 에서 호출 >> View 전달
        // 변수명 변경
        do {
            enter = inputContrast.contrastList(computer, user);
        } while (enter);
    }

    public void reStart() {
        start();
    }
}
