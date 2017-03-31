package com.wrox;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jiangqin on 17/3/21.
 */
@WebListener
public class SessionListener implements HttpSessionListener,HttpSessionIdListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println(this.date() + ": Session " + httpSessionEvent.getSession().getId()+" created.");
        SessionRegistry.addSession(httpSessionEvent.getSession());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println(this.date() + ": Session" + httpSessionEvent.getSession().getId() + "destroyed");
        SessionRegistry.removeSession(httpSessionEvent.getSession());
    }

    @Override
    public void sessionIdChanged(HttpSessionEvent httpSessionEvent, String s) {
        System.out.println(this.date() + ": Session ID " + s+ " changed to "+httpSessionEvent.getSession().getId());
        SessionRegistry.updateSessionId(httpSessionEvent.getSession(),s);
    }

    private SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
    private String date()
    {
        return this.formatter.format(new Date());
    }
}
