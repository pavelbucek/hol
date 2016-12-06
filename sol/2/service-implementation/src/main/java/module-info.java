
module implementation {

    requires declaration;

    provides service.StarFighter with impl.XWing;
    provides service.StarFighter with impl.YWing;
    provides service.StarFighter with impl.TIEFighter;
    provides service.StarFighter with impl.TIEInterceptor;
}
