package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<Line> lines;
    private int countOfPerson;
    private int ladderHeight;

    public Ladder(int countOfPerson, int ladderHeight) {
        this.countOfPerson = countOfPerson;
        this.ladderHeight = ladderHeight;
        createLadder();
    }

    private List<Line> createLadder() {
        lines = new ArrayList<>();
        for (int i = 1; i <= ladderHeight; i++) {
            lines.add(new LineGenerator(new RandomCreateLine()).drawLine(countOfPerson - 1));
        }
        return lines;
    }

    public Direction CurrentDirection(int height, int playerPosition) {
        if (playerPosition == 0) {
            return new Direction(false, lines.get(height).getLinePosition(playerPosition));
        }
        if (playerPosition == lines.get(height).getRowLines().size()) {
            return new Direction(lines.get(height).getLinePosition(playerPosition - 1), false);
        }
        return new Direction(lines.get(height).getLinePosition(playerPosition - 1), lines.get(height).getLinePosition(playerPosition));
    }

    public List<Line> getLadder() {
        return lines;
    }

}