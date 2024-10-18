import java.util.*;
 class student{
    String Name;
    ArrayList<Integer> ar;
     student(String Name) {
        this.Name = Name;
        this.ar = new ArrayList<>();
     }
        public void addGrade(int grade) {
            ar.add(grade);
        }
        public double calculateAverage() {
            if (ar.isEmpty()) {
                return 0.0; 
            }
            
            int sum = 0;
            for (int grade :ar) {
                sum += grade;
            }
            return (double) sum /ar.size();
        }
        public void displayInfo() {
            System.out.println("Student Name: " + Name);
            System.out.println("Grades: " + ar);
            System.out.println("Average Grade: " + calculateAverage());
        }

}
public class week1demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        student student = new student(name);
      
        System.out.println("No. of entries to be made:");        
        int n= sc.nextInt();
        System.out.println("Enter the marks:");
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            student.addGrade(a);
        }

       System.out.println("The details of student:");
        student.displayInfo();
        
        sc.close();
    }
}
