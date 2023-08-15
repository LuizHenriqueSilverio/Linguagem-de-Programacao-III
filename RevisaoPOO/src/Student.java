
public class Student extends User{

	private int enrollment;
	private String course;
	private short semester;
	
	public Student(int id, int enrollment){
		super(id);
		this.enrollment = enrollment;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public short getSemester() {
		return semester;
	}

	public void setSemester(short semester) {
		this.semester = semester;
	}

	public int getEnrollment() {
		return enrollment;
	}
	
	@Override
	public String formatPersonalData() {
		String userData = super.formatPersonalData();
		String studentData = String.format("RA: %s\nCurso: %s\nPeriodo: %d", this.enrollment, this.course, this.semester);
		return userData + studentData;
	}
}
