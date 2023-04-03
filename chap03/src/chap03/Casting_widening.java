/**
 *확대 형 변환 
 * 날짜
 * 이민경
 */

package chap03;

import java.util.Scanner;
public class Casting_widening {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("first integer:");
		int first=stdin.nextInt();//첫번째 정수 저장 
		
		System.out.print("second integer:");		
		int second=stdin.nextInt();//두번째 정수 저장 
		
		double avg1=(first+second)/2;//정수 정수 연산 
		double avg2=(first+second)/2.0;//정수 실수 연산(확대형변환)
		double avg3=(first+second)/(float)2;// 정주 실수(형변환)연산 
		
		System.out.println("resualt1:"+avg1);
		System.out.println("resualt1:"+avg2);
		System.out.println("resualt1:"+avg3);
		
	}

}
