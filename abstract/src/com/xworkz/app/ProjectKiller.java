package com.xworkz.app;

public class ProjectKiller {

	public static void main(String[] args) {
System.out.println("Running main in ProjectRunner");
		
		Project project=new ProjectLast();
		
		project.start();
		project.pause();
		project.resume();
		project.complete();
		project.reportStatus();

       
        System.out.println(project.getProjectType());
        project.assignTeam();
        project.implement();
        project.review();
        project.deliver();

	

	}	

}
