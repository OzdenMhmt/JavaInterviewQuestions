package JavaInterviewQuestions;

import java.util.stream.Stream;

public class Java_17_FibonacciSeries {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21 34 ....
		
		//1.yol
		int a1=0;//a2
		int a2=1;//toplam
		
		for (int i = 1; i <= 13; i++) {
			System.out.print(a1+" ");
			int toplam=a1+a2;
			a1=a2;
			a2=toplam;
		}
		//2.yol
		System.out.println("");
		Stream.iterate(new int[] {0,1} , t-> new int[] {t[1],t[0]+t[1]}).limit(20).forEach(t-> System.out.print(t[0]+" "));
		}
		}
		
		
		
	


