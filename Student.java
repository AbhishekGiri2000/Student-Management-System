public class Student {
    private int rollnumber;
    private String name;
    private String courses;
    private double fees;

    public Student(int rollnumber, String name, String courses, double fees){
        this.rollnumber = rollnumber;
        this.name = name;
        this.courses = courses;
        this.fees = fees;
    }
    public int getRollNumber(){
        return rollnumber;
    }
    public void setRollNumber(int rollnumber){
        this.rollnumber = rollnumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCourses(){
        return courses;
    }
    public void setCourses(String courses){
        this.courses = courses;
    }
    public double getFees(){
        return fees;
    }
    public void setFees(double fees){
        this.fees = fees;
    }
    public void display(){
        System.out.println("Rollnumber : "+rollnumber);
        System.out.println("Name : " +name );
        System.out.println("Courses : "+courses);
        System.out.println("Fees : "+fees);
        System.out.println("--------------------");
    }

    
}
