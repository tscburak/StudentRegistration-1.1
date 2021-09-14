package studentRegistration.entities.concretes;

public class Student {
	
	private int Id;
	private String name;
	private String surname;
	private String phone_number;
	private String email;
	private String departments;
	private String score_type;
	private double score;
	private String placement_priority;
	private String highschool;
	private String education_situation;
	private String where;
	private String location;
	private String save;
	
	
	
	
	public Student() {
		super();
	}

	public Student(String name, String surname, String phone_number, String email, String departments,
			String score_type, double score, String placement_priority, String highschool, String education_situation,
			String where, String location, String save) {
		super();
		
		this.name = name;
		this.surname = surname;
		this.phone_number = phone_number;
		this.email = email;
		this.departments = departments;
		this.score_type = score_type;
		this.score = score;
		this.placement_priority = placement_priority;
		this.highschool = highschool;
		this.education_situation = education_situation;
		this.where = where;
		this.location = location;
		this.save = save;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public String getScore_type() {
		return score_type;
	}
	public void setScore_type(String score_type) {
		this.score_type = score_type;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getPlacement_priority() {
		return placement_priority;
	}
	public void setPlacement_priority(String placement_priority) {
		this.placement_priority = placement_priority;
	}
	public String getHighschool() {
		return highschool;
	}
	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}
	public String getEducation_situation() {
		return education_situation;
	}
	public void setEducation_situation(String education_situation) {
		this.education_situation = education_situation;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSave() {
		return save;
	}
	public void setSave(String save) {
		this.save = save;
	}

}
