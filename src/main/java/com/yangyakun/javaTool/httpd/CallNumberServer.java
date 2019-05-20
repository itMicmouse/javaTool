package com.yangyakun.javaTool.httpd;

import fi.iki.elonen.NanoHTTPD;

public class CallNumberServer extends NanoHTTPD {

    public CallNumberServer(int port) {
        super(port);
    }

    public CallNumberServer(String hostname, int port) {
        super(hostname, port);
    }

    @Override
    public Response serve(IHTTPSession session) {
        StringBuilder builder = new StringBuilder();
        builder.append("<!DOCTYPE html><html><body>");
        builder.append("Sorry, Can't Found the page!");
        builder.append("</body></html>\n");
        return newFixedLengthResponse(builder.toString());
    }


}
