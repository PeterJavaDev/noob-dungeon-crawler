package pl.noobgamesinjava.noobdungeoncrawler.display;

import pl.noobgamesinjava.noob3dengine.component.DefaultGameWindow;

public class DisplayService {

    final int displyWidth = 1280;
    final int displyHeight = 720;
    final int displyPosX = 400;
    final int displyPosY = 200;

    public void start() {
        DefaultGameWindow windowMain = new DefaultGameWindow(displyWidth, displyHeight, displyPosX, displyPosY);

    }

}
