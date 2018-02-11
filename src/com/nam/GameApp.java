package com.nam;

import org.newdawn.slick.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class GameApp extends BasicGame{

    private Logger log = LoggerFactory.getLogger(GameApp.class);

    private Image img;

    GameApp(String gamename){
        super(gamename);
    }

    public void init(GameContainer gc) throws SlickException{
        log.info("Init");

        XMLPackedSheet sheet = new XMLPackedSheet("res/art/sheet.png", "res/art/sheet.xml");

        img = sheet.getSprite("buttonRed");

    }

    public void update(GameContainer gc, int i) throws SlickException{

    }

    public void render(GameContainer gc, Graphics g) throws SlickException{
        g.setColor(Color.red);
        g.drawRect(100, 100, 300, 300);

        img.draw(100, 100);

        //g.drawImage(img, 100, 100);
    }
}
