import java.util.*;
public class studentmanagementsystem{
    static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    
    public static void main (String[]args){
        while (true){
            System.out.println("studentmanagementsystem");
            System.out.println("1. add student");
            System.out.println("2. view student");
            System.out.println("3. search student");
            System.out.println("4. update student");
            System.out.println("5. delete student");
            System.out.println("6.exit");
            System.out.println("Enter Choice");
            int Choice = sc.nextInt();

            switch (Choice){
                case 1 -> addStudent();
                case 2 -> viewStudent();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid Choice");

            }


        }   
    }
    static void addStudent(){
    System.out.println("Enter roll number");
    int roll = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter courses");
    String courses = sc.nextLine();
    System.out.println("Enter name");
    String name = sc.nextLine();
    System.out.println("Enter fees");
    double fees = sc.nextDouble();
    Student s = new Student(roll, name, courses, fees);
    students.add(s);
    System.out.println("Student Add Successfully");
    }
   static void viewStudent(){
    if(students.isEmpty()){
        System.out.println("no student found");
    }
    for (Student s : students){
        s.display();
    }
   } 
   static void searchStudent(){
    System.out.println("enter roll number to search");
    int roll = sc.nextInt();
    for (Student s : students){
        if(s.getRollNumber() == roll){
            s.display();
            return;
        }
    }
    System.out.println("roll number not found");
   }
   static void updateStudent(){
    System.out.print("Enter roll number to update: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                sc.nextLine(); 
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new course: ");
                s.setCourses(sc.nextLine());
                System.out.print("Enter new fees: ");
                s.setFees(sc.nextDouble());
                System.out.println("Student updated!");
                return;
   }
}System.out.println("roll number not found");
}
    static void deleteStudent(){
        System.out.println("enter roll number");
        int roll = sc.nextInt();
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getRollNumber()== roll){
                it.remove();
                System.out.println("student deleted");
                return;
            }
            
        } System.out.println("not found");

    } 
}