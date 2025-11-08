import java.util.Scanner;
public class Bt2 {

	public static void main(String[] args) {
		int a,b;
		float X;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a");
		a = sc.nextInt();
		System.out.print("nhap b");
		b = sc.nextInt();
		X = (float)-b/a;
		if(a!=0)
			System.out.print("Phuong trinh co nghiem la " + X);
		else{
			if(b==0){
				System.out.print("Phuong trinh vo so nghiem");
			}
			else{
				System.out.print("Phuong trinh vo nghiem");
			}
		}
	}

}