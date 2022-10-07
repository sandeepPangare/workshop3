package com.brideglabz;

public class Teacher {
    private String subject;
    private int standard;
    private String division;
    private int Attendperiod;
    private int Totalperiod;

    public Teacher(String subject,int standard, String division) {
        this.Attendperiod =0;
        this.Totalperiod =8;
        this.subject = subject;
        this.standard=standard;
        this.division=division;
    }

    public String getSubject() {
        return subject;
    }

    public int getStandard() {
        return standard;
    }
    public String getDivision(){
        return division;
    }

    public int getTotalperiod() {
        return Totalperiod;
    }
}
