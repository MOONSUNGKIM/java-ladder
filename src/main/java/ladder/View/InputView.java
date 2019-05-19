package ladder.View;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);
    private static final String INPUT_NAME = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INPUT_EXECUTE_RESULT = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String INPUT_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
    private static final String INPUT_PLAYER_FOR_RESULT = "결과를 보고 싶은 사람은?";

    public static String getNames() {
        System.out.println(INPUT_NAME);
        return scanner.nextLine();
    }

    public static String getExecuteResult() {
        System.out.println(INPUT_EXECUTE_RESULT);
        return scanner.nextLine();
    }

    public static int getLadderHeight() {
        System.out.println(INPUT_HEIGHT);
        return scanner.nextInt();
    }

    public static String getPlayerForResult() {
        scanner = new Scanner(System.in);
        System.out.println(INPUT_PLAYER_FOR_RESULT);
        return scanner.nextLine();
    }
}
