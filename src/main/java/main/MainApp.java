/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Student;
import java.util.ArrayList;
import model.StudentModel;

public class MainApp {

    public static void main(String[] args) {
        StudentModel studentModel = new StudentModel();
//        Student studentByID = studentModel.getStudentByID(1);
//        System.out.println(studentByID.toString());

//        ArrayList<Student> allStudents = studentModel.getAllStudents();
//        System.out.println(allStudents);

//        int addStudent = studentModel.addStudent("Noel", "Tien Giang");
//        if (addStudent >= 0) {
//            System.out.println(addStudent);
//        }
        
//        int editStudent = studentModel.editStudent(4,"Anh", "Vung Tau");
//        if (editStudent >= 0) {
//            System.out.println(editStudent);
//        }
        
        int deleteStudent = studentModel.deleteStudent(1);
        if (deleteStudent >= 0) {
            System.out.println(deleteStudent);
        }
    }
}
