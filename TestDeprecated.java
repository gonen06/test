class Annotation {
	@Deprecated
	public void oldMethod() {
		System.out.println("This is the old method");
	}

	public void newMethod() {
		System.out.println("This is the new method");
	}
}

class TestDeprecated{
	public static void main(String[] args){
       Annotation annotation = new Annotation();
       annotation.oldMethod();
	}
}