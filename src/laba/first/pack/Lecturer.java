package laba.first.pack;

record Lecturer(String firstNameSecondName,int lecturingExpirienceInYears,String aliasBetweenStudents,
		int salaryInUah, String nameOfSubject, int age){
	public static String university="Lviv Polytechnic";
    Lecturer()
    {
    	this("0",0,"0",0,"0",0);
    }
    Lecturer(String firstNameSecondName,int lecturingExpirienceInYears,String aliasBetweenStudents)
    {
    	this(firstNameSecondName,lecturingExpirienceInYears,aliasBetweenStudents,0,"No_Info",0);
    }
    @Override
    public String toString()
    {
      return "Lecturer{"
      		  +"firstNameSecondName:"+firstNameSecondName
    		  +"\nlecturingExpirienceInYears:"+lecturingExpirienceInYears
    		  +"\naliasBetweenStudents:"+aliasBetweenStudents
    		  +"\nsalaryInUah:"+salaryInUah
    		  +"\nameOfSubject:"+nameOfSubject
    		  +"\nage:"+ age+"}";
    }
    public static String getUniversity() 
    {
      return university;
    }
  }


 