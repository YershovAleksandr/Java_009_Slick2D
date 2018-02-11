package com.nam;

import org.newdawn.slick.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class GameApp extends BasicGame{

    private Logger log = LoggerFactory.getLogger(GameApp.class);

    GameApp(String gamename){
        super(gamename);
    }

    public void init(GameContainer gc) throws SlickException{
        log.info("Init");
    }

    public void update(GameContainer gc, int i) throws SlickException{

    }

    public void render(GameContainer gc, Graphics g) throws SlickException{
        g.setColor(Color.red);
        g.drawRect(100, 100, 300, 300);
    }
}
