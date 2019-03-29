package Chance;

import java.util.Scanner;


public class StudentResultsSys {
   
    public static void main(String[] args) {
        int num=1;
        Student [] myStudents = new Student[num];
  
        Scanner scan = new Scanner(System.in);
        
        int i=0;
        while(true){
            if(i>=num)
                break;
            myStudents[i]=new Student();
            myStudents[i].setMarks();
            System.out.println();
            i++;
        
        System.out.println("The following students are registered:");
        for(int n=0;n<num;n++){
            System.out.println("("+(n+1)+") "+myStudents[n].getStdName());
        }
        System.out.println();
        while(true){
            System.out.println("Pick a number between 1 and "+num+" to view the corresponding student's results or type '0' to exit the program.");
            int number = scan.nextInt();
            if(number==0)
                break;
            else if(number>0 && number<=num){
                int index = number-1;
                myStudents[index].printStdInfo();
                myStudents[index].printResults();
            }
            System.out.println();
        }
    }    
}
