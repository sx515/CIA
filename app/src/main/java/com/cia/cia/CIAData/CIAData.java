package com.cia.cia.CIAData;

public class CIAData {
    public String getCOMMAND_FLAG() {
        return COMMAND_FLAG;
    }

    public void setCOMMAND_FLAG(String COMMAND_FLAG) {
        this.COMMAND_FLAG = COMMAND_FLAG;
    }

    private String COMMAND_FLAG;

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    private String TIME;

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    private String DATA;
}
