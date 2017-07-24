package kuDialogTest;

public class kuCppWrapperTest {
	static {
		System.loadLibrary("kuCppWrapper");
	}
	
	public kuCppWrapperTest() {
		// TODO Auto-generated constructor stub
		
	}
	
	public native void kuWrapperHelloWorld();
	public native int kuWrapperAddTest(int a, int b);
}
