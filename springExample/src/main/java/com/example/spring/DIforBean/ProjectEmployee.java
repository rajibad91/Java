package com.example.spring.DIforBean;

public class ProjectEmployee {
	private String projectName;
	public String getProjectName() {
		return projectName;
	}

	public int getProjectMemberCount() {
		return projectMemberCount;
	}

	private int projectMemberCount;
	
	public ProjectEmployee(String name,int count)
	{
		this.projectName=name;
		this.projectMemberCount=count;
	}

}
