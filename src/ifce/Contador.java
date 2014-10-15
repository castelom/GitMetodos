package ifce;

public class Contador {

	public void ContaPares(int num){
		int i;
		for(i = 0; i<= num; i = i+2){
			System.out.println(i);
		}
	}
	public void ContaPares_e_Impares(int num){
		int i;
		for(i = 0; i<= num; i = i+2){
			System.out.println(i);
		}
		for(i = 1; i<= num; i = i+2){
			System.out.println(i);
		}
	}
	public int ContaImpar(int num){
		int i;
		for(i = 1; i<= num; i = i+2){
			System.out.println(i);
		}
		return  i;
	}
	
	public void ContaTodos(int num){
		int i;
		for(i = 0; i<= num; i++){
			System.out.println(i);
		}
	}
	public void ContaDobro(int num){
		int i;
		for(i = 0; i<= num; i++){
			System.out.println(2*i);
		}
	}
	
}
