package ifce;

public class Contador {

	public void ContaPares(int num){
		int i;
		for(i = 0; i<= num; i = i+2){
			System.out.println(i);
		}
	}

	
	public int ContaTriplo(int num){
		int i;
		for(i = 0; i<= num; i++){
			System.out.println(3*i);
		}
		return i;
	}
	
}
