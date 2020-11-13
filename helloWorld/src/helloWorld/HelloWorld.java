package helloWorld;

public class HelloWorld {                     //변수설정 
	public static void main(String[] args) {
		String name ="30"; // "Hong Kildong";
//		name =";
		System.out.println("My name is " + name);
		int age =20;
		System.out.println("My name is " + name +" " + age);
		double height = 170.8;
		System.out.println(name + "의 키는" + height +"입니다.");
//		double= 소숫점표시 int = 정수 변수는 /한번밖에 선언안됨 
		String name1 = "이혜빈";
		int age1 = 22;
		double height1 = 175.3;
		System.out.println(name1 + "의 키는" + height1 +"입니다. " + "나이는 " + age1 +" 입니다.");
		System.out.println("두 사람 나이의 합은 " + (age + age1) +"입니다. " );
	}
}
