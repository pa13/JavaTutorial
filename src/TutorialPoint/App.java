package TutorialPoint;

public class App {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("Variable Value :" + myPuppy.puppyAge);

        /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
