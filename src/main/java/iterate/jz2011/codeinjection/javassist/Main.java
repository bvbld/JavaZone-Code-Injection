package iterate.jz2011.codeinjection.javassist;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("\n############### Starting the Javassist example... ###############\n");
		try {
			TargetClass targetClass = new TargetClass();
			targetClass.myMethod();
			targetClass.myMethodSlower();
		} finally {
			System.out.println("\n############### DONE with the Javassist example ###############\n");
		}
	}

}
