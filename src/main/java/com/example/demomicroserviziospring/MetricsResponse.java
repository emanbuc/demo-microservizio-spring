package com.example.demomicroserviziospring;

public class MetricsResponse {
    private int uptime;
    private int processors;
    private int activeConnections;

    public MetricsResponse(int processors, int activeConnections, int uptime) {
        this.processors = processors;
        this.activeConnections = activeConnections;
        this.uptime = uptime;
    }

    public int getActiveConnections() {
        return activeConnections;
    }

    public void setActiveConnections(int activeConnections) {
        this.activeConnections = activeConnections;
    }

    public int getProcessors() {
        return processors;
    }

    public void setProcessors(int processors) {
        this.processors = processors;
    }

    public int getUptime() {
        return uptime;
    }

    public void setUptime(int uptime) {
        this.uptime = uptime;
    }
}
