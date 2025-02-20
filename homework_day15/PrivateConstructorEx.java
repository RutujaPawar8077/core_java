package homework_day15;

public class PrivateConstructorEx {
	private  PrivateConstructorEx(){
        System.out.println("Private Constructor");
    }

    public static  PrivateConstructorEx createInstance() {
        return new  PrivateConstructorEx();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateConstructorEx obj = PrivateConstructorEx.createInstance();
	}

}
