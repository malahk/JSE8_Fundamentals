package ua.org.oa.malahk;

import java.util.Scanner;

public class Group {
	
	private Student[] group = null;
	
		
	public Group(int groupSize) {
		this.group = new Student[groupSize];
		StudentInput();
	}

	private void StudentInput() {
		
		Scanner bufferScaner = new Scanner(System.in);
		String FIO = null;
		int age = 0;
		float averageGrade = 0;
		
		for (int i = 0; i < this.group.length;) {
			System.out.println("Input FIO of " + (i + 1) + "th student: ");
			FIO = bufferScaner.nextLine();
			System.out.println("Input student's age: " + (i + 1) + "th student: ");
			age = inputInt(bufferScaner);
			System.out.println("Input student's averagegrade " + (i + 1) + "th student: ");
			averageGrade = inputFloat(bufferScaner);
			
			try {
				group[i] = new Student(FIO, age, averageGrade);
				i++;
			} catch (StudentFIOException e) {
				System.out.println(e.getMessage());
				System.out.println("Input students's FIO: ");
				FIO = bufferScaner.nextLine();
			} catch (StudentAgeException e) {
				System.out.println(e.getMessage());
				System.out.println("Input student's age: ");
				age = inputInt(bufferScaner);
			} catch (StudentAGradeException e) {
				System.out.println(e.getMessage());
				System.out.println("Input students's averagegrade: ");
				averageGrade = inputFloat(bufferScaner);
			}

		}		
		int i = 1;
		for(Student st : this.group){
			System.out.println(i + "th student: "+ st);
			i++;
		}
		
	}

	private float inputFloat(Scanner bufferScaner) {
		while (!bufferScaner.hasNextFloat()) {
			System.out.println("Wrong number, you write: " + bufferScaner.nextLine() + ", try again");
		}
		float number = bufferScaner.nextInt();
		bufferScaner.nextLine();
		return number;// TODO Auto-generated method stub
		
	}

	private static int inputInt(Scanner bufferScaner) {
		while (!bufferScaner.hasNextInt()) {
			System.out.println("Wrong number, you write: " + bufferScaner.nextLine() + ", try again");
		}
		int number = bufferScaner.nextInt();
		bufferScaner.nextLine();
		return number;
	}
	
	//public void addStudent () 
	//{
		//for (int i = 1; i < group.length;) {
			//if (!(group[i] equals(group[i++])))
			//i++;
		
		//}
	//}
	
	private Boolean checkFIOInGroup (String fio)
	{
		for (Student student: this.group) {
			if (student.getFIO().equals(fio)) {
				return true;
			}
		}
		
		return false;
	}
	
}
	


