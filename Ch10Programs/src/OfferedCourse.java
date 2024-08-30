
public class OfferedCourse extends Course {
   // TODO: Declare private fields
	private String instructorsName;
	private String location;
	private String classTime;

   // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
	public void setInstructorName(String name) {
		instructorsName = name;
	}
	public void setLocation(String place) {
		location = place;
	}
	public void setClassTime(String time) {
		classTime = time;
	}


   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
	public String getInstructorName() {
		return instructorsName;
	}
	public String getLocation() {
		return location;
	}
	public String getClassTime() {
		return classTime;
	}

}