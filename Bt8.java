import java.util.Scanner;


public class Bt8 {

	public static void main(String[] args) {
		int[] age = { 1, 2, 5, -1, 9, -2 };
		int count = 0;
		for(int i=0;i<=5;i++){
			if(age[i]>0){
				count++;
			}
		}
		System.out.println(count);
	}

}
