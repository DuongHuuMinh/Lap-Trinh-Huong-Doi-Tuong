import java.util.Scanner;


public class Bt12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap x");
		int x = sc.nextInt();
		System.out.print("nhap y");
		int y = sc.nextInt();
		if(y==0)System.out.print(1);
		else if(y>0){
			int kq = 1;
			for (int i = 1; i<=y;i++){
				kq*=x;
			}
			System.out.print(kq);
		}
		else{
			float kq = 1;
			for (int i = 1; i<=-y;i++){
			kq/=(float)x;
			}
			System.out.print(kq);
		}
	}

}
