package com.besant.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection conn = GetConnection.getDBConnection();
			if (conn != null) {
				System.out.println("connection created");
//				PreparedStatement pstmt = conn
//						.prepareStatement("insert into [RLD].[dbo].[StudentSpring] values(?,?,?)");
//				pstmt.setString(1, "333");
//				pstmt.setString(2, "Name333");
//				pstmt.setString(3, "address333");
//				int res = pstmt.executeUpdate();
//				System.out.println(res);
				List<Student> list=new ArrayList<>();
//				String query="select * from [RLD].[dbo].[StudentSpring]";
//				Statement stmt=conn.createStatement();
				PreparedStatement stmt = conn
						.prepareStatement("select * from [RLD].[dbo].[StudentSpring] where StudentId=?");
				stmt.setString(1,"222");
				ResultSet res=stmt.executeQuery();
				int count=0;
				while(res.next())
				{
					System.out.print(res.getString(1));
					System.out.println(res.getString("StudentName"));
					Student stud=new Student();
					stud.setStudentId(res.getString(1));
					stud.setStudentName(res.getString("StudentName"));
					stud.setStudentAdd(res.getString(3));
					list.add(stud);
					count+=1;
				}
				
				System.out.println( count+" no of students found");
				//System.out.println(list);
				for (Student student : list) {
					
					System.out.println("Student id is : "+student.getStudentId());
					System.out.println("Student Name is : "+student.getStudentName());
					System.out.println("Student Address is : "+student.getStudentAdd());
				}
				conn.close();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
