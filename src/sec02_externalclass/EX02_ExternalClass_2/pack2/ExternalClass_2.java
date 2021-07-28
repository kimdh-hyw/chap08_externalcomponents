package sec02_externalclass.EX02_ExternalClass_2.pack2;

import sec02_externalclass.EX02_ExternalClass_2.pack1.A;

/*외부클래스를 별도의 파일로 분리*/

public class ExternalClass_2 {
	public static void main(String[] args) {
		A a = new A();
		a.print(); //3, 4 
	}
}
