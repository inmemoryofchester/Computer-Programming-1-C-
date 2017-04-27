
public class Methods {
	public static void main(String[] args) {
		// method kung walay static kinahanglan pa nimo tawag ang class baog ma gamit ang method
		// ingani pag tawag sa class
		Methods MethodsName = new Methods();
		MethodsName.secondMethod();
		// method kung naay static
		staticMethod();
		// method naay int parameter
		MethodwithIntParameter(1);
		// method naay string parameter
		MethodwithStringParameter(" string");
		// method naa duha ka string parameter
		MethodwithTwoParameter(" First Parameters", " Second Parameters");
		// ang parameter dapat parehas pagka plastar
		MethodwithMultipleParameter(" First Parameter", " Second Parameter"," Third Parameter"," Fourth Parameter");
	}
	public void secondMethod() {
		System.out.println("Method without static must need to call first the class: Classname MethodName = new Classname();");
	}
	public static void staticMethod() {
		System.out.print("Method with Static: ");
		System.out.println("You with static");
	}
	public static void MethodwithIntParameter(int params) {
		System.out.print("Method with Int Parameter: ");
		System.out.println(params);
	}
	public static void MethodwithStringParameter(String params) {
		System.out.print("Method with String Parameter: ");
		System.out.println(params);
	}
	public static void MethodwithTwoParameter(String params, String param) {
		System.out.print("Method with Two Parameter: ");
		System.out.print(params);
		System.out.println(param);
	}
	public static void MethodwithMultipleParameter(String one,String two,String three,String four) {
		System.out.print("Method with Multiple Parameter: ");
		System.out.print(one);
		System.out.print(two);
		System.out.print(three);
		System.out.println(four);
	}
	
}
