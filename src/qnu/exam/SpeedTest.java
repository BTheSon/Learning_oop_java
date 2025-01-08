package qnu.exam;

public interface SpeedTest {
    int WORKSSPEEDLIMIT = 5;
    int URBANSPEEDLIMIT = 50;
    boolean isSpeedLegal(int speedLimit);
}
