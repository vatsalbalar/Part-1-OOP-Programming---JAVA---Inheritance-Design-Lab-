package program;

public class Doctor extends HospitalEmployee {
	
	public String specialty;

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Doctor(String name, int number, String specialty) {
		super(name, number);
		this.specialty = specialty;
	}

	public Doctor(String name, int number) {
		super(name, number);
	}

	@Override
	public String toString() {
		return name +" "+ number+" "+specialty;
	}
	
	
	public void work()
	{
			super.work();
			
			if(Thread.currentThread().getStackTrace()[2].getClassName() != "program.Surgeon") 
			{
				System.out.print(name +" is an "+specialty+" Doctor. ");			
				
			}
	}

}
