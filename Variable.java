package kh.project1.test1;

public class Variable {

	public static void main(String[] args) {
		// ���� ����
		int num;
		// ���� ��� - �� ����
		num = 10;
		// ���� ��� - �� �б�
		System.out.println(num);	// 10
		
		num = 10+20;
		System.out.println(num);	// 30
		
		// ���� ���� �� �ٷ� �� ����(�ʱⰪ)
		int num2 = 20;
		System.out.println(num);
		// ���� ���� ������ ���ÿ� ����
		int num3, num4, num5;
		// ���� ���� ���� ���ÿ� ���� �� �ٷ� �� ����(�ʱⰪ)
		int num6, num7 = 40, num8 = 50;
		
		// �������� �ٸ� ������ ����
		int num9 = 10;
		int num10 = num9;
		
		// �������� �̿��� ���� �� �ٽ� ����
		int num11 = 100;
		System.out.println(num11);
		num11 = num11 + 1;
		System.out.println(num11);
		num11 = 100;
		System.out.println(num11);
		
		// ������ Ÿ�Կ� ���� ���� ����
		byte num01 = 100; // 1byte ũ���� �������� ����
		System.out.println("num01 ���� �� : " + num01); // 100
		short num02 = 10000; // 2byte ũ���� �������� ����
		System.out.println("num02 ���� �� : " + num02); // 10000
		int num03 = 10000000; // 4byte ũ���� �������� ����
		System.out.println("num03 ���� �� : " + num03); //10000000
		long num04 = 10000000000l;
		System.out.println("num04 ���� �� : " + num04);
		float num05 = (float)3.5; // 4byte ũ���� �Ǽ����� ����(3.5f�� ĳ�����ص� ��)		
		System.out.println("num05 ���� �� : " + num05); // 3.5
		double num06 = 12345.234;		  // 8byte ũ���� �Ǽ����� ����
		System.out.println("num06 ���� �� : " + num06); // 12345.234
		char ch = '��'; // 2byte ũ���� ���Ϲ������� ����
		System.out.println("ch ���� �� : " + ch); 		 // ��
		String str = "��θ�~"; // ����ũ���� ���ڿ����� ����
		System.out.println("str ���� �� : " + str);	 // ��θ�~
		System.out.println("str ���� �� : " + str.charAt(0)); // Ư����ġ �ѱ��� ����
		System.out.println("str ���� �� : " + str.length());  // ���� ����
		boolean bl = true;	// 1byte ũ���� ������ ����
		System.out.println("bl ���� �� : " + bl);       // true
		bl = false;
		System.out.println("bl ���� �� : " + bl);		 // false
		
		// ������ �ٸ� ���� ������ ����
//		int in1 = 3.5;  // ����
		float fl1 = 5;  // 5.0
		System.out.println("fl1 ���� �� : " + fl1);
		double fl2 = 100; // 100.0
		System.out.println("fl2 ���� �� : " + fl2);
		int in2 = 'A';  //  65
		System.out.println("in2 ���� �� : " + in2);
		char ch1 = 65;  // A
		System.out.println("ch1 ���� �� : " + ch1);
		String str1 = ""+'A'+ '0'+1051479414; 
		System.out.println(str1);
		
		// ���� ��� ����
		int var1 = 10;
		System.out.println(var1);  // 10 ���� ���
		{	// ���ο� ���
			int var2 = 20;
			System.out.println(var1);  // 10 ���� ��� 
			System.out.println(var2);  // 20 ���� ���
		}
		//System.out.println(var2);  // ���� �߻�
		
		// final ���
		final int num100 = 101;
		System.out.println(num100);
		//num100 = 20;
		System.out.println(num100);
		final int num99;       // �̷��� ���� �� �ʱ�ȭ �ÿ��� �� ���� ����
		num99 = 102;
		System.out.println(num99);
		
		int number = 290;
		System.out.println((byte)number);
		
	}
}
