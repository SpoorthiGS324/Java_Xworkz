package com.xworkz.app;

public class ProjectLast extends  Project{
	@Override
    public String getProjectType() {
        return "Fullstack Web Development";
    }

    @Override
    public void assignTeam() {
        System.out.println("Team assigned for the project.");
    }

    @Override
    public void implement() {
        System.out.println("Implementing project .");
    }
    
    @Override
    public void review() {
        System.out.println("Reviewing project progress.");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering the project.");
    }

}


