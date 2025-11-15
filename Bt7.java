import java.util.Scanner;
public class Bt7 {

	public static void main(String[] args) {
		int[] age = { 1, 2, 5, -1, 9, -2 };
		int max = 0;
		for(int i=0;i<=5;i++){
			if(max<age[i]){
				max = age[i];
			}
		}
		System.out.println("So lon nhat la " + max);

	}

}
