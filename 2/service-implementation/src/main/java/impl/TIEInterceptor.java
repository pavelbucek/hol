package impl;

import service.StarFighter;

public class TIEInterceptor extends AbstractStarFighter {

    public String getName() {
        return "TIE Interceptor";
    }

    public int getSpeedMGLT() {
        return 111;
    }

    public int getShieldsSBD() {
        return 0;
    }
}
