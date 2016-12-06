package impl;

import service.StarFighter;

public class XWing extends AbstractStarFighter {

    public String getName() {
        return "X-Wing";
    }

    public int getSpeedMGLT() {
        return 100;
    }

    public int getShieldsSBD() {
        return 50;
    }
}
