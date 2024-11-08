package ir.isc.saeidi;

public class abstrac {
	abstract class Person {
	    protected String name;
	    protected String lastName;
	    protected int age;

	    public Person(String name, String lastName, int age) {
	        this.name = name;
	        this.lastName = lastName;
	        this.age = age;
	    }

	    public abstract void notify(String message);
	}

	class Student extends Person {
	    private int studentId;

	    public Student(String name, String lastName, int age, int studentId) {
	        super(name, lastName, age);
	        this.studentId = studentId;
	    }

	    @Override
	    public void notify(String message) {
	        System.out.println("student: " + message);
	    }
	}

	class Teacher extends Person {
	    private String subject;

	    public Teacher(String name, String lastName, int age, String subject) {
	        super(name, lastName, age);
	        this.subject = subject;
	    }

	    @Override
	    public void notify(String message) {
	        System.out.println("teacher" + message);
	    }
	}

	class Manager extends Person {
	    private String department;

	    public Manager(String name, String lastName, int age, String department) {
	        super(name, lastName, age);
	        this.department = department;
	    }

	    @Override
	    public void notify(String message) {
	        System.out.println("manager: " + message);
	    }
	}
}
