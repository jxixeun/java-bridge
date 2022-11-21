package bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    public List<String> upCells = new ArrayList<>();
    public List<String> downCells = new ArrayList<>();

    public List<String> getUpCells() {
        return upCells;
    }

    public List<String> getDownCells() {
        return downCells;
    }

    public static String valueOfStatus(boolean status) {
        if (status) {
            return "O";
        }
        return "X";
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(String moving, String cell) {
        boolean result = moving.equals(cell);
        if (moving.equals(CellType.DOWN.getCell())){
            downCells.add(valueOfStatus(result));
            upCells.add(" ");
        }
        if (moving.equals(CellType.UP.getCell())){
            upCells.add(valueOfStatus(result));
            downCells.add(" ");
        }
        return result;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
