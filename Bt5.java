import java.util.Scanner;
public class Bt5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		float delta;
		System.out.print("nhap a");
		a = sc.nextInt();
		System.out.print("nhap b");
		b = sc.nextInt();
		System.out.print("nhap c");
		c = sc.nextInt();
		if(a!=0){
			delta = b*b-4*a*c;
			double KQ = (float)Math.sqrt(delta);
		 	if(delta > 0){
		 		System.out.println("phuong trinh co 2 nghiem");
		 		System.out.println("X1 = " + (-b+KQ)/2*a);
		 		System.out.print("X2 = " + (-b-KQ)/2*a);
		 	}
		 	else if(delta == 0){
		 		System.out.println("phuong trinh co 1 nghiem kep X1 = X2 = " + -b/2*a);
		 	}
		 	else if(delta < 0)
		 		System.out.println("phuong trinh vo nghiem");
			}
		else if(c==0){
			System.out.println("phuong trinh co 2 nghiem");
	 		System.out.println("X1 = 0" );
	 		System.out.print("X2 = " + -b/a);
		}
		else if (b==0){
			if( (-c/a) < 0){
		 		System.out.println("phuong trinh vo nghiem");
			}
			else if((-c/a) > 0){
				System.out.println("phuong trinh co 2 nghiem");
		 		System.out.println("X1 = " +-(float)Math.sqrt(-c/a) );
		 		System.out.print("X2 = " +(float)Math.sqrt(-c/a) );
			}
		}
	}
}
