import java.util.Scanner;
public class Student {
	private int ID;
	private String name;
	private int age;
	
	public Student() {}
	public Student(int ID, String name, int age){
		this.ID = ID;
		this.name = name;
		this.age = age;
	}

	public int getID(){
		return ID;
	}
	public void setID(int ID){
		this.ID = ID; 
	}
	
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name = name;
	}
	
	public int getage(){
		return age;
	}
	public void setage(int age){
		this.age = age;
	}
	
	
	public Student inputStudent(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nhap ID ");
		this.ID = sc.nextInt();
		sc.nextLine();
		
		System.out.print("nhap ten ");
		this.name = sc.nextLine();
		
		System.out.print("nhap tuoi ");
		this.age = sc.nextInt();
		return this;
	}
	


	
}
