/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringexemple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1795904
 */
public class Professor extends Person {
    List <Student> students = new ArrayList<Student>();
    String photoUrl;
    
    public void Professor (String lastName, String firstName){
        String employeeID = formatEmployeeID(lastName, firstName);
        
        System.out.println("New professor : "+ employeeID);
    }

    private String formatEmployeeID(String lastName1, String firstName1) {
        return lastName1.toUpperCase().trim().substring(1, 3) + firstName1.toUpperCase().trim().substring(1, 3);
    }
    
    public void setPhotoUrl (String photoName, String photoPath){
        this.photoUrl = photoPath +photoName;
        //Photopath c'est le chemin se la photo
    }

    public void isSupervisedBy(Student student) {
        this.students.add(student);
    }
}
