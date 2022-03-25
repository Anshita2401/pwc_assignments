package com.examples.business.rules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.examples.business.data.StudentDAO;

public class StudentInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDAO ob=new StudentDAO();
		String data="Insert into student_master(student_roll_no,student_name,student_gender,maths_marks,physics_marks,chemistry_marks,computer_science_marks,city,email)values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst=ob.conn.prepareStatement(data);
		
		pst.setInt(1, Integer.parseInt(args[0]));
		pst.setString(2, args[1]);
		pst.setString(3, args[2]);
		pst.setInt(4, Integer.parseInt(args[3]));
		pst.setInt(5, Integer.parseInt(args[4]));
		pst.setInt(6, Integer.parseInt(args[5]));
		pst.setInt(7, Integer.parseInt(args[6]));
		pst.setString(8, args[7]);
		pst.setString(9, args[8]);
		pst.executeUpdate();
		System.out.println("User is added");
	}
}
