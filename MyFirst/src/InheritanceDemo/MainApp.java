package InheritanceDemo;

public class MainApp {

    public static void main(String[] args) throws Exception {
        Parent p = new Child();
        p.meth();
		p.methP(); //Child specific cant be accessed from parent ref
		//Child ref cant be used for parent object
		/*Child c = new Parent();*/
    }

}
