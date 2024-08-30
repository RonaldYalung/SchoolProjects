
public class Course{
   // TODO: Declare private fields
	private String courseNumber;
	private String courseTitle;

   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
	public void setCourseNumber(String number) {
		courseNumber = number;
	}
	public void setCourseTitle(String title) {
		courseTitle = title;
	}
   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
	public String getCourseNumber() {
		return courseNumber;
	}
	public String getCourseTitle() {
		return courseTitle;
	}

   // TODO: Define printInfo()
	public void printInfo() {
		System.out.println("Course Information:");
		System.out.println("   Course Number: " + courseNumber);
		System.out.println("   Course Title: " + courseTitle);
	}
}
