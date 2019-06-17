package Lab2.Assignment33;

public class TestStringMock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "What's in the name";
		StringMock smock= new StringMock();
		System.out.println("It is present in the index of"+StringMock.search(name,'n'));
		System.out.println("not in the char"+smock.search(name,'z'));

	}

}
