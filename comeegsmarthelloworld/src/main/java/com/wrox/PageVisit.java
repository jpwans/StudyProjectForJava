package com.wrox;

import java.io.Serializable;
import java.net.InetAddress;

/**
 * Created by jiangqin on 17/3/20.
 */
public class PageVisit implements Serializable {
    private long enteredTimestamp;

    private long leftTimestamp;

    public long getEnteredTimestamp() {
        return enteredTimestamp;
    }

    public long getLeftTimestamp() {
        return leftTimestamp;
    }

    public String getRequest() {
        return request;
    }

    public InetAddress getIpAddress() {
        return ipAddress;
    }

    private String request;

    private InetAddress ipAddress;

    public void setEnteredTimestamp(long enteredTimestamp) {
        this.enteredTimestamp = enteredTimestamp;
    }

    public void setLeftTimestamp(long leftTimestamp) {
        this.leftTimestamp = leftTimestamp;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setIpAddress(InetAddress ipAddress) {
        this.ipAddress = ipAddress;
    }
}
