package sec01_packageimport.EX02_PackageImport_2;

import sec01_packageimport.common.A; 

//다른 패키지에 있는 클래스를 가져와 활용하는 방법 #2 : 임포트(import) 사용 : 자동임포트 단축키 ctrl+shift+O


public class PackageImport_2 {
	public static void main(String[] args) {
		
		//#1. 객체생성
		A a = new A(); //정상동작
		//sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		//#2. 멤버활용
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		a.print(); //임포트
	}
}
