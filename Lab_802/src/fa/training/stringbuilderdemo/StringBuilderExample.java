package fa.training.stringbuilderdemo;

public class StringBuilderExample {
	public void demonstrateStringBuilder() {
		System.out.println("demonstrateStringBuilder() !!!");
		StringBuilder sb1 = new StringBuilder("Hello Java World");
		sb1.delete(4, 8);
		System.out.println("Delete method demo: " + sb1);

		StringBuilder sb2 = new StringBuilder("Hello Java World");
		sb2.insert(4, "abc");
		System.out.println("Insert Operation: " + sb2);

		StringBuilder sb3 = new StringBuilder("fsoft.fpt.com");
		sb3.replace(1, 4, "Atmit");
		System.out.println("Replace Opertion: " + sb3);

		StringBuilder sb4 = new StringBuilder("ABCDE");
		System.out.println("Reverse of ABCDE" + sb4.reverse());

		StringBuilder sb5 = new StringBuilder("ABCDEF");
		sb5.setCharAt(3, 'x');
		System.out.println("Replacing char at index 3: " + sb5);
	}
}
