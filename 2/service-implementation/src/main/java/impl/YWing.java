package impl;

import service.StarFighter;

public class YWing extends AbstractStarFighter {

    public String getName() {
        return "Y-Wing";
    }

    public int getSpeedMGLT() {
        return 80;
    }

    public int getShieldsSBD() {
        return 75;
    }
}
