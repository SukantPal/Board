package com.silcos.board;

import static com.silcos.board.BoardGame.TIMER_TICK_EVENT;

public class TimerTickEvent extends Event {

    public final int forPlayerId;
    public final int newValue;

    public TimerTickEvent(int id, int forPlayerId, int newValue, BoardGame origin) {
        super(id, origin);
        this.forPlayerId = forPlayerId;
        this.newValue = newValue;
    }

    @Override
    public int typeId() {
        return TIMER_TICK_EVENT;
    }
}
