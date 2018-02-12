package com.nam;

import org.newdawn.slick.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class GameApp extends BasicGame{

    private Logger log = LoggerFactory.getLogger(GameApp.class);

    private Image img1;
    private Image img2;
    private Image img3;

    GameApp(String gamename){
        super(gamename);
    }

    public void init(GameContainer gc) throws SlickException{
        log.info("Init");

        XMLPackedSheet sheet = new XMLPackedSheet("res/art/sheet.png", "res/art/sheet.xml");

        img1 = sheet.getSprite("playerShip1_blue.png");
        img2 = sheet.getSprite("playerShip2_blue.png");
        img3 = sheet.getSprite("playerShip3_blue.png");

    }

    public void update(GameContainer gc, int i) throws SlickException{

    }

    public void render(GameContainer gc, Graphics g) throws SlickException{
        g.setColor(Color.red);
        g.drawRect(100, 100, 300, 300);

        img1.draw(100, 100);
        img2.draw(100, 200);
        img3.draw(100, 300);

        //g.drawImage(img, 100, 100);
    }
}
