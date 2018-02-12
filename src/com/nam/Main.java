package com.nam;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
	// write your code here

        log.info("Info");

        try{
            AppGameContainer app = new AppGameContainer(new GameApp("Fuck Fucker Motherfucka"));
            app.setDisplayMode(1024,768, false);
            app.start();
        }
        catch (SlickException ex){
            log.error("Wtf", ex);
        }



    }

}
