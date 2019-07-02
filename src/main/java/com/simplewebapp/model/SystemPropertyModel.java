package com.simplewebapp.model;

/**
 * Created by Clor on 02.07.2019.
 * ©XCodersTeam, 2019
 */
public class SystemPropertyModel {
    private String currentDate;
    private String pcName;
    private String javaFreeMemory;
    private String javaTotalMemory;

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getPcName() {
        return pcName;
    }

    public SystemPropertyModel(String currentDate, String pcName, String javaFreeMemory, String javaTotalMemory) {
        this.currentDate = currentDate;
        this.pcName = pcName;
        this.javaFreeMemory = javaFreeMemory;
        this.javaTotalMemory = javaTotalMemory;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public String getJavaFreeMemory() {
        return javaFreeMemory;
    }

    public void setJavaFreeMemory(String javaFreeMemory) {
        this.javaFreeMemory = javaFreeMemory;
    }

    public String getJavaTotalMemory() {
        return javaTotalMemory;
    }

    public void setJavaTotalMemory(String javaTotalMemory) {
        this.javaTotalMemory = javaTotalMemory;
    }
}
