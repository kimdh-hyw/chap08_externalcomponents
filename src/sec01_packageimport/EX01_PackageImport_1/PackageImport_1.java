package sec01_packageimport.EX01_PackageImport_1;

/*외부패키지의 클래스 사용방법 #1 (클래스의 풀네임 사용)*/

public class PackageImport_1 {
	public static void main(String[] args) {		
		//#1. 객체생성
		//A a = new A(); //오류
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		//#2. 멤버활용
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		a.print(); //임포트
	}
}
