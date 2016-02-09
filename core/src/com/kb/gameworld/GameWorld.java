package com.kb.gameworld;

import com.kb.gameobjects.Bird;
import com.kb.gameobjects.ScrollHandler;


public class GameWorld {
    private Bird bird;
    private ScrollHandler scroller;
    public GameWorld(int midPointY){
        bird = new Bird(33,midPointY - 5, 17,12);
        scroller = new ScrollHandler(midPointY + 66);
    }

    public void update(float delta) {
        bird.update(delta);
        scroller.update(delta);
    }

    public ScrollHandler getScroller(){
        return scroller;
    }

    public Bird getBird(){
        return bird;
    }

}
