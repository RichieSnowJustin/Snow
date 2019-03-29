package chance;
import java.util.Scanner;

public class Student {
    private String stdName, regNo;
    private int yob;
    private String[] courses = {"BIT-S-1401", "BIT-S-1402", "BIT-S-1403", "BIT-4-1404", "BIT-S-1405", "BIT-S-1406"};
    int n=courses.length;
    private int[] marks = new int[n];
    private int sum;
    Scanner scan = new Scanner(System.in);
    
    Student() {
        System.out.println("Enter a student name: ");
        this.stdName=(scan.nextLine());
        System.out.println("Enter "+stdName+"'s registration number: ");
        this.regNo=(scan.nextLine();
        System.out.println("Enter "+stdName+"'s year of birth: ");
        while(true){
            int test=scan.nextInt();
            if(test>1985 && test<2010){
                this.yob=test;
                break;
            }else
                System.out.println("Invalid year of birth!");
        }
    }
    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName.toUpperCase();
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo.toUpperCase();
    }
    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void setMarks(){
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("Enter "+stdName+"'s marks in "+courses[i]+": ");
            int test=scan.nextInt();
            if(test>=0 && test<=100){
                marks[i]=test;
                sum+=marks[i];
            }else{
                System.out.println("Enter a score between 0 and 100!\n");
                i--;
            }
        }
    }
    public double getAve(){
        double ave=Math.round((sum/n)*100.0)/100.0;
        return ave;
    }
    public void printResults() {
        System.out.println("\nCourses\t\tMarks");
        for(int i=0;i<n;i++){
            System.out.println(courses[i]+"\t"+marks[i]);
        }
        System.out.println(stdName+"'s average is "+getAve());
    }
    public void printStdInfo(){
        System.out.printf("Full name: %s\nReg No: %s\nYear of birth: %d%n", stdName, regNo, yob);
    }
}
