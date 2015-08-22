package ua.org.oa.malahk;

public class Student {
	
	private String FIO = null;
	private int age = 0;
	private float averageGrade = 0;
	
	public Student(String fIO, int age, float averageGrade) throws StudentFIOException, StudentAgeException, StudentAGradeException
	{
		super();
		setFIO(fIO);
		setAge(age);
		setAverageGrade(averageGrade);
	}

	public String getFIO() {
		return FIO;
	}

	public void setFIO(String fIO) throws StudentFIOException
	{
		if (fIO.isEmpty()) {
			throw new StudentFIOException("Wrong/Empty FIO");
		} else {
			FIO = fIO;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws StudentAgeException
	{
		if (age < 18 || age > 50) {
			throw new StudentAgeException("Wrong age, input another one, between 18 - 50: ");
		} else {
			this.age = age;
		}
	}

	public float getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(float averageGrade) throws StudentAGradeException
	{
		if (averageGrade < 1 || averageGrade > 12) {
			throw new StudentAGradeException("Incorrect grade, plz input between 1 - 12: ");
		} else {
		this.averageGrade = averageGrade;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FIO == null) ? 0 : FIO.hashCode());
		result = prime * result + age;
		result = prime * result + Float.floatToIntBits(averageGrade);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (FIO == null) {
			if (other.FIO != null)
				return false;
		} else if (!FIO.equals(other.FIO))
			return false;
		if (age != other.age)
			return false;
		if (Float.floatToIntBits(averageGrade) != Float
				.floatToIntBits(other.averageGrade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [FIO = " + FIO + ", age = " + age + ", averageGrade = "
				+ averageGrade + "]";
	}
	
	
	
	
	
	

}
