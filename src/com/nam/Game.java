package com.nam;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Point;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.Random;

public class Game extends BasicGameState {
    public static int ID = 2;

    private static Logger log = LoggerFactory.getLogger(Game.class);

    private StateBasedGame game;

    private int MaxPixels = 100;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        //
        log.info("Init");


        game = sbg;
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        //
        int min = 200;
        int max = 300;

        g.setColor(Color.red);

        Random rnd = new Random();
        for (int i = 0; i < MaxPixels; i++){
            int x = rnd.nextInt((max - min) + 1) + min;
            int y = rnd.nextInt((max - min) + 1) + min;
            //g.draw(new Point(x, y));
            g.fillRect(x, y, 2, 2);
            //g.flush();
            //log.info("!" + x + "-" + y);
        }

        g.setColor(Color.white);
        g.drawString("Game #" + MaxPixels, 100, 100);

    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        //
        if (gc.getInput().isKeyPressed(Input.KEY_ESCAPE)){
            //game.enterState(1);
            game.enterState(Main.MAINMENU, new FadeOutTransition(Color.blue), new FadeInTransition(Color.blue));
        }

        if (gc.getInput().isKeyPressed(Input.KEY_MINUS)){
            MaxPixels /= 2;
        }
        if (gc.getInput().isKeyPressed(Input.KEY_EQUALS)){
            MaxPixels *= 2;
        }
    }

    @Override
    public int getID() {
        return ID;
    }
}

