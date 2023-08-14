package com.xworkz.app;

public  abstract class Project {
	
	public void start() {
        System.out.println("Project is starting.");
    }

    public void pause() {
        System.out.println("Project is paused.");
    }

    public void resume() {
        System.out.println("Project is resumed.");
    }

    public void complete() {
        System.out.println("Project is completed.");
    }
    
    public void reportStatus() {
        System.out.println("Project status report.");
    }

  
    public abstract String getProjectType();
    public abstract void assignTeam();
    public abstract void implement();
    public abstract void review();
    public abstract void deliver();



}
