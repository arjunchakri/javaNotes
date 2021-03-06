//-------------inheritance
package training.day1;

abstract class AbstractClass {
	public abstract void abstractMethod();
	
	
	public int fee(){
		return 10;
	}
}

class AbstractClassImplementation1 extends AbstractClass {

	static class AA{
		static int a = 0;
	}
	
	public int fee(){
		return super.fee() + 5;
	}
	
	@Override
	public void abstractMethod() {
		System.out.println("Abstract method1 exec..");
	}
}
class AbstractClassImplementation2 extends AbstractClass {

	@Override
	public void abstractMethod() {
		System.out.println("Abstract method2 exec..");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		AbstractClass obj1 = new AbstractClassImplementation1();
		obj1.abstractMethod();
		AbstractClass obj2 = new AbstractClassImplementation2();
		obj2.abstractMethod();
		System.out.println(AbstractClassImplementation1.AA.a);
		
	}
}


//-----------Access specifiers
package training.day1;

public class A {

	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;

	public static void main(String[] args) {
		A obj = new A();
		System.out.println("a = " + obj.a);
		System.out.println("b = " + obj.b);
		System.out.println("c = " + obj.c);
		System.out.println("d = " + obj.d);
	}

}
class B {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println("a = " + obj.a);
//		System.out.println("b = " + obj.b);
		System.out.println("c = " + obj.c);
		System.out.println("d = " + obj.d);
	}

}
public class C extends A{

	public static void main(String[] args) {
		C obj = new C();
		System.out.println("a = " + obj.a);
//		System.out.println("b = " + obj.b);
		System.out.println("c = " + obj.c);
//		System.out.println("d = " + obj.d);
	}

}


//-------------overloading-overriding
package training.day1;
class Parent {
	public int add(int i, int j) {
		return i - j;
	}

	public int add(int i, int j, int k) {
		return i + j - k;
	}

}

class Child extends Parent {
	public int add(int i, int j) {
		return i + j;
	}

	public int add(int i, int j, int k) {
		return i + j + k;
	}

}

public class OverloadingOverriding {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.add(1, 2));
	}
}


//--------------anonymous methods
abstract class Bike{
	public abstract void run();
}

public class AnonymousForAbstractClass{
	
	public static void main(String[] args) {
		Bike bike = new Bike(){

			@Override
			public void run() {
				System.out.println("running..");
			}
		};
		bike.run();
	}
	
}

//---------anonymous inner class
interface Person {
	public void eat();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person person = new Person() {
			@Override
			public void eat() {
				System.out.println("Eating..");
			}
		};
		person.eat();
	}

}

//-------------cloning
public class Cloning implements Cloneable {
	int a = 10;
	int b = 10;

	public static void main(String[] args) throws CloneNotSupportedException {
		Cloning cloning = new Cloning();
		System.out.println(cloning.a + " , " + cloning.a);
		Cloning cloning2 = new Cloning();
		System.out.println(cloning2.a + " , " + cloning2.a);
		System.out.println();
		cloning2.a++;
		cloning2.b++;

	}

}
//-----------------inner classes
a)
package training.day2;

public class InnerClasses {

	private int data = 30;

	class Inner {
		public void method() {
			System.out.println(data);
		}
	}

	// creating inner class
	public void createInnerObject() {
		Inner inner = new Inner();
		inner.method();
	}

	public static void main(String[] args) {
		// -error
		// Inner obj = new Inner();

		// creating inner class
		InnerClasses.Inner inner = new InnerClasses().new Inner();
		// inner.method();

	}

}

package training.day2;

public class InnerClassesExtended {
	//method local inner class
	private int data = 10;

	public void innerClassDeclaration() {
		class Inner {
			public void method() {
				System.out.println(data);
			}
		}
		Inner inner = new Inner();
		
	}

	public static void main(String[] args) {
		InnerClassesExtended obj = new InnerClassesExtended();
		obj.innerClassDeclaration();
	}

}


b)
package training.day2;

public class InnerClassesExtended {
	//method local inner class
	private int data = 10;

	public void innerClassDeclaration() {
		class Inner {
			public void method() {
				System.out.println(data);
			}
		}
		Inner inner = new Inner();
		
	}

	public static void main(String[] args) {
		InnerClassesExtended obj = new InnerClassesExtended();
		obj.innerClassDeclaration();
	}

}


c) static inner classes
package training.day2;

public class StaticInnerClass {
	public static int a = 10;
	
	static class Inner {
		public static void show(){
			System.out.println("a = " + a);
		}
	}
	
	public static void main(String[] args) {
		Inner.show();
	}
	
	
}

//--------------wrapper classes
package training.day2;

public class WrapperClasses {
	public static void main(String[] args) {
		// StringBuffer stringBuffer = new StringBuffer("Hello");
		// System.out.println(stringBuffer.hashCode());
		// stringBuffer.append("World");
		// System.out.println(stringBuffer.hashCode());
		int a = 10;
		Integer i = Integer.valueOf(a);
		Integer j = new Integer(10);

		byte b = 127;
		Byte byte1 = new Byte((byte) 10);
		System.out.println(byte1);

		double d = 10;
		Double d1 = new Double(100);

		char c = 'c';
		Character character = new Character('c');
		
	}

}


JUnit:
package training.day4;

public class C3JUnitTest {

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}
}

package training.day4;

import static org.junit.Assert.*;
import org.junit.Test;
public class C3JUnitTestTest {
	C3JUnitTest classTest;
	public C3JUnitTestTest() {
		classTest = new C3JUnitTest();
	}
	@Test
	public void testAdd() {
		assertEquals(4, classTest.add(1, 2));
	}
}



