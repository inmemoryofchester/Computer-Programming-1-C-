
public class Methods {
	public static void main(String[] args) {
		// method without static must need to call the class first
		// this is a way to call a class
		Methods MethodsName = new Methods();
		MethodsName.secondMethod();
		// method with static
		staticMethod();
		// method with int parameter
		MethodwithIntParameter(1);
		// method with string parameter
		MethodwithStringParameter("This method has string parameter");
		// method with two string parameter
		MethodwithTwoParameter("First Parameters", "Second Parameters");
		// parameter is must place with same order
		MethodwithMultipleParameter("First Parameter", "Second Parameter","Third Parameter","Fourth Parameter");
	}
	public void secondMethod() {
		System.out.println("Method without static must need to call first the class");
	}
	public static void staticMethod() {
		System.out.println("You with static");
	}
	public static void MethodwithIntParameter(int params) {
		System.out.println(params);
	}
	public static void MethodwithStringParameter(String params) {
		System.out.println(params);
	}
	public static void MethodwithTwoParameter(String params, String param) {
		System.out.println(params);
		System.out.println(param);
	}
	public static void MethodwithMultipleParameter(String one,String two,String three,String four) {
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
	}
	
}
