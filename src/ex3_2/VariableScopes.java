package ex3_2;

public class VariableScopes {
	String globalVariable = "Global variable (in class)";

	public VariableScopes(String globalVariable) {
		System.out.println(this.globalVariable);
		this.globalVariable = globalVariable;
	}

	public VariableScopes() {
		System.out.println(globalVariable);
	}

	public void printVariable() {
		System.out.println(globalVariable);
		// System.out.println(localVariable); /* blad - zmienna niedostepna */
	}

	public void method() {
		String localVariable = "Local variable (in method)";
		System.out.println(localVariable);

		{
			String blockVariable = "Local variable (in block)";
			localVariable = blockVariable;
			System.out.println(blockVariable);
		}

		System.out.println(localVariable);
		// System.out.println(blockVariable); /* blad - zmienna niedostepna */
	}

	public static void main(String[] args) {
		VariableScopes vars = new VariableScopes("New text");
		vars.method();
		vars.printVariable();
	}
}
