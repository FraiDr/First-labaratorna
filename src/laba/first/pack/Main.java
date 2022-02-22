package laba.first.pack;

public class Main {

	public static void main(String[] args) {
		Lecturer lecturer1=new Lecturer();
		Lecturer lecturer2=new Lecturer("Nataliya Kuba",3,"Kuba");
		Lecturer lecturer3=new Lecturer("Zenoviy Veres",5,"Veres",7000,"Teamwork in IT",37);
		System.out.println(lecturer1.toString());
		System.out.println(lecturer2.toString());
		System.out.println(lecturer3.toString());
		Lecturer.getUniversity();
	}

}
