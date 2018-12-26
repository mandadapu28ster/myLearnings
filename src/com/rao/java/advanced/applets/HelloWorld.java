package com.rao.java.advanced.applets;

import java.awt.*;
import java.applet.Applet;

public class HelloWorld extends Applet {

    public void paint( Graphics g ) {
        g.drawString( "Hello", 50, 50 );
    }

}
