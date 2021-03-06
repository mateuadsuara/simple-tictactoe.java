package tictactoe;

import java.util.AbstractList;
import java.util.List;

import static tictactoe.Mark.*;

public class Line extends AbstractList<Mark> implements List<Mark> {
    private final List<Mark> marks;
    private final int[] spaces;

    public Line(List<Mark> marks, int... atSpaces) {
        this.marks = marks;
        this.spaces = atSpaces;
    }

    @Override
    public Mark get(int spaceIndex) {
        int atSpace = spaces[spaceIndex];
        return marks.get(atSpace);
    }

    @Override
    public int size() {
        return spaces.length;
    }

    public boolean isFullyOccupiedBySameMark() {
        for (Mark mark : this)
            if (mark == NONE || mark != firstMark())
                return false;

        return true;
    }

    public Mark firstMark() {
        return get(0);
    }
}
