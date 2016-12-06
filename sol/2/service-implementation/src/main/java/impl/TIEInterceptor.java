package impl;

import service.StarFighter;

public class TIEInterceptor implements StarFighter {

    public String getName() {
        return "TIE Interceptor";
    }

    public int getSpeedMGLT() {
        return 111;
    }

    public int getShieldsSBD() {
        return 0;
    }

    @Override
    public String toString() {
        return "[" + getName() + "] Shields: " + getShieldsSBD() + " SBD, Top Speed: " + getShieldsSBD() + " MGLT";
    }
}
