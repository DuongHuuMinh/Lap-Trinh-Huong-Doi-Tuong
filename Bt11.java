import java.util.Scanner;

public class Bt11 {
	public static boolean check(int n){
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return n>1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a");
		int a = sc.nextInt();
		System.out.print("nhap b");
		int b = sc.nextInt();
		System.out.print("cac so nguyen to trong mang ");
		for(int i=a; i<b;i++){
			if(check(i)==true)
				System.out.print(i+" ");
		}
		sc.close();
	}

}
