package e1;

import static java.lang.System.*;

public class HotAirBalloonApplication {
    public static void main(String[] args) {
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        out.println("smallBalloon--");
        smallBalloon.land();
        smallBalloon.liftUp();
        out.println("bigBalloon--");
        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        bigBalloon.land();
        bigBalloon.liftUp();
        

    }



}
