package com.brideglabz;

public class Student {
    private String name;
    private String subject;
    private int standard;
    private String division;
    private int Attendperiod;
    private int Totalperiod;

    public Student(String name, String subject,int standard, String division){
        this.Attendperiod=0;
        this.Totalperiod=8;
        this.name = name;
        this.subject=subject;
        this.standard=standard;
        this.division=division;
    }

}
