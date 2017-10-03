package com.gavus.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import static org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS;

public class Main {
    public static void main(String[] args) {


        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(SESSIONS);
        server.setHandler(context);
    }
}
