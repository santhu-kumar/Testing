

	public class Accessmodifiers {
		
	    public String publicVar = "This is a public 10";
	    private String privateVar = "This is a private 20";
	    protected String protectedVar = "This is a protected 30";
	    String defaultVar = "This is a default 40";

	    public void publicMethod() {
	        System.out.println("This is a public method.");
	    }

	    private void privateMethod() {
	        System.out.println("This is a private method.");
	    }

	    protected void protectedMethod() {
	        System.out.println("This is a protected method.");
	    }

	    void defaultMethod() {
	        System.out.println("This is a default method.");
	    }

	    public static void main(String[] args) {
	    	
	        Accessmodifiers example = new Accessmodifiers();
	        System.out.println(example.publicVar);
	        System.out.println(example.privateVar); // This will result in an error
	        System.out.println(example.protectedVar);
	        System.out.println(example.defaultVar);

	        example.publicMethod();
	        example.privateMethod(); // This will result in an error
	        example.protectedMethod();
	        example.defaultMethod();
	    }

	}


