import java.lang.reflect.Constructor;

public class Client {

	public static void main(String[]args){
		
		try{
			Class c=Class.forName("Test");
		Constructor con[]=c.getDeclaredConstructors();
					con[0].setAccessible(true);
					con[0].newInstance();
		}
		
		catch(Exception e){
			e.getMessage();
		}
	}
}
