package kamp3Odev;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setCertificate("C#");
		instructor.setCity("�stanbul");
		instructor.setContact("05323235323");
		instructor.setCountry("T�rkiye");
		instructor.setCourse("C#");
		instructor.setEmail("asdeas@gmail.com");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setPassword("123");

		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setCertificate("Java");
		instructor2.setCity("�stanbul");
		instructor2.setContact("11111");
		instructor2.setCountry("Amerika");
		instructor2.setCourse("Java");
		instructor2.setEmail("123123@gmail.com");
		instructor2.setFirstName("Okan");
		instructor2.setLastName("�ivgin");
		instructor2.setPassword("123");
		
		
		Student student = new Student("123", 1, "qwweq@gmail.com", "T�rkiye", "�stanbul", "053111", "123", "U�ur Okan", "�ivgin", "Java");
		Student student2 = new Student("2134", 2, "qwweq@gmail.com", "T�rkiye", "�stanbul", "053111", "123", "Sait", "�ivgin", "Java");
		
		Student[] students= {student,student2};
		

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(students);
		
		System.out.println(student.getFirstName() + " " + student.getLastName());
		System.out.println(student2.getFirstName() + " " + student2.getLastName());
		

		

	}

}
