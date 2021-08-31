package workingOOP;

public class InstructorManager extends UserManager{
	public void courseAdd(Instructor instructor, Course course) {
		System.out.println(instructor.getFullName()+": "+course.courseName+" "+"kursunu ekledi.");
	}
	
	public void courseUpdate(Instructor instructor, Course course) {
		System.out.println(instructor.getFullName()+": "+course.courseName+" "+"kursunu güncelledi.");
	}
	
}
