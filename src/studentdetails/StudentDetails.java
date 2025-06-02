/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;

/**
 *
 * @author rfaus
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     * This is master code
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Student s1 = new Student();
        s1.setName("peter");
        s1.setSid(1);
        
        Student s2 = new Student();
        s2.setName("Andrea");
        s2.setSid(2);
        
        
        Student s3 = new Student();
        s3.setName("Braydem");
        s3.setSid(3);
        
        //We want to store the object of the "Student" class in an array
        //We put the class name as the data type instead of String or int
        Student [] list = new Student[3]; //array of object
        
        
        //you are storing the objects (s1, s2, s3) not the data
        //The object point to the memory that can access the data types
        list [0] =s1;
        list [1] =s2;
        list [2] =s3;
        
        for(int i=0; i<list.length;i++){
        System.out.println(list[i].getName()+ " "+list[i].getSid());
        }
    }
    
}
