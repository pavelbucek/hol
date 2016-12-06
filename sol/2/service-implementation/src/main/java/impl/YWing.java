package impl;

import service.StarFighter;

public class YWing implements StarFighter {

    public String getName() {
        return "Y-Wing";
    }

    public int getSpeedMGLT() {
        return 80;
    }

    public int getShieldsSBD() {
        return 75;
    }

    @Override
    public String toString() {
        return "[" + getName() + "] Shields: " + getShieldsSBD() + " SBD, Top Speed: " + getShieldsSBD() + " MGLT";
    }
}
