package xyz.nucleoid.fantasy;

public interface FantasyWorldAccess {
    void setTickWhenEmpty(boolean tickWhenEmpty);

    boolean fantasy$shouldTick();
}
