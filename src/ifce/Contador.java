package ifce;

public class Contador {

	public void ContaPares(int num){
		int i;
		for(i = 0; i<= num; i = i+2){
			System.out.println(i);
		}
	}
	public void Conta(int num){
		int i;
		for(i = 0; i<= num; i = i+1){
			System.out.println(i);
		}
	}
	public void ContaImpares(int num){
		int i;
		for(i = 1; i<= num; i = i+2){
			System.out.println(i);
		}
	}
}
