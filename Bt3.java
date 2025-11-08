import java.util.Scanner;
public class Bt3 {
	public static void main(String[] args) {
		int a, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a");
		a = sc.nextInt();
		if(a<2){
			System.out.print("n khong la so nguyen to");
		}
		else{
		for(int i = 1; i<=a; i++){
			if(a%i==0)
			 count ++;
		}
			if(count == 2)
				System.out.print("n la so nguyen to");
			else
				System.out.print("n khong la so nguyen to");
		}
			
	}
}