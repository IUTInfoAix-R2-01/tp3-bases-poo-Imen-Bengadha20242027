package bibliotheque;
 
public class Employe {
	private int Id = 1 ; 
	private String FirstName ;
	private String LastName ;
	private int Salary;
	
	
public Employe(int salary , int id , String lastname , String firstname ) { 
	this.Id = id;
	this.FirstName = firstname ;
    this.LastName = lastname;
    this.Salary = salary ;
}
public int  getSalary() {
    return  Salary;
}

public int getId() {
    return Id;
}

public String getLastName() {
    return LastName;
}	

public String getFirstName() {
    return FirstName;
}	
public String getName() {
    return FirstName + " " + LastName ;
}	

public void setSalary( int salary) {
	this.Salary = salary ; 
}
  
public int getAnnualSalary() {
	return Salary * 12;   
}

public  int raiseSalary(int percent ) {
	Salary += Salary * percent / 100 ; 
	return Salary  ;
}



public String toString() {
	return "Employe [id=" + Id + ", name=" + FirstName + " " + LastName + ", salary=" + Salary + "]";
	}
	  
}


	
