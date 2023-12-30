package com.learning.taskapp;

public class task {
    private String name;
    private boolean taskStatus;

    public String getName(){
        return name;
    }
    public boolean gettaskStatus(){
        return taskStatus;
    }

    public void setName(String name){
        this.name = name;
    }
    public void settaskStatus(boolean taskStatus){
        this.taskStatus = taskStatus;
    }
    public task(String name, boolean taskStatus){
        this.taskStatus = taskStatus;
        this.name = name;
    }

    public void update(String name, boolean taskStatus){
        setName(name);
        settaskStatus(taskStatus);
    }
}
