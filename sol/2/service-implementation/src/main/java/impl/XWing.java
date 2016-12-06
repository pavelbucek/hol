package impl;

import service.StarFighter;

public class XWing implements StarFighter {

    public String getName() {
        return "X-Wing";
    }

    public int getSpeedMGLT() {
        return 100;
    }

    public int getShieldsSBD() {
        return 50;
    }

    @Override
    public String toString() {
        return "[" + getName() + "] Shields: " + getShieldsSBD() + " SBD, Top Speed: " + getShieldsSBD() + " MGLT";
    }
}
