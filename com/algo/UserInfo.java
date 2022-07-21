package com.algo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserInfo {
    private int uid;
    private LocalDateTime loginDate;
    private LocalDateTime logoutDate;
    private Duration duration;

    public LocalDateTime getLoginDate() {
        return loginDate;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setLoginDate(LocalDateTime loginDate) {
        this.loginDate = loginDate;
    }

    public LocalDateTime getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(LocalDateTime logoutDate) {
        this.logoutDate = logoutDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void logHeaders(){
        final StringBuilder sb = new StringBuilder();
        sb.append("UID");
        sb.append("         |  ").append("Login Date And Time");
        sb.append("         |  ").append("Logout Date And Time");
        sb.append("         |  ").append("Duration");
        sb.append("\n");
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(uid);
        sb.append("         |  ").append(loginDate.format(DateTimeFormatter.ofPattern("dd-MM kk:mm")));
        sb.append("         |  ").append(logoutDate.format(DateTimeFormatter.ofPattern("dd-MM kk:mm")));
        sb.append("         |  ").append(duration);
        return sb.toString();
    }
}
