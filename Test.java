
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		StudentServices s2 = new StudentServices();
		Student[] arr = new Student[5];
	        s1.inputStudent();   // 
	        System.out.println("ID: " + s1.getID());
	        System.out.println("Ten: " + s1.getname());
	        System.out.println("Tuoi: " + s1.getage());
	        
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Nhap sinh vien thu " + (i + 1));
	            arr[i] = new Student();       
	            arr[i].inputStudent();        
	        }
	        System.out.print("Ten nguoi co ID < 10 la: ");
	        for (int i = 0; i < 5; i++) {
	        if(arr[i].getID()<10){
	        	System.out.print(arr[i].getname()+ " ");
	        	}
	        }
	        System.out.println("");
	        System.out.println("Danh sach sinh vien:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("ID: " +
	                arr[i].getID() + " Ten " +
	                arr[i].getname() + " tuoi " +
	                arr[i].getage());
	        }
		}
	}


