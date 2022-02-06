package git1;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
	public Student(String firstName, String lastName, int registration, int grade, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}
	public Student(String firstName,String lastName,int year) {
		super();
		this.firstName= firstName;
		this.lastName=lastName;
		this.year=year;
	}
	
	public Student() {
		super();
		this.firstName="";
		this.lastName= "";
		this.registration=0;
		this.grade=0;
		this.year=0;
	}
	
	public void printFullName(){
	      //TODO implement
		System.out.println("El nombre es: "+firstName+ " "+lastName);
	}

	public boolean isApproved(){
	       //TODO implement: should return true if grade >= 60
		   if(grade>=60) {
			   System.out.println("Pasaste");
			   return true;
		   }else {
			   System.out.println("Reprobado");
			   return false;
			   
		   }
	}

	   public int changeYearIfApproved(){
	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
	       // Make year = year + 1, and print "Congragulations" if the student has been approved
		   if(grade >=60) {
			   System.out.println("Congratulations");
			   return year +=1;
			   
		   }else {
			   System.out.println("Repites año");
			   return year;
		   }
	      
	   }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Arturo","Cuellar", 1234,61,2);
		student.changeYearIfApproved();
		student.printFullName();
		student.isApproved();

	}
}
