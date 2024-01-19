package logicaDeProgramacao;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
		String nome = "João Roberto";
		int idade = 22;
		char sexo = 'M';
		
		if(idade < 18 || sexo == 'F') {
			System.out.println("Você não tem a idade necessária!");
		}
			else{
				System.out.println("voce deve se alistar"); 
			}
		
		
		
		
		if (sexo == 'M') {
			
			if(idade > 18) {
				System.out.println("Alistamento militar obrigatório!");
			}
				else{
					System.out.println("Você não tem a idade necessária!"); 
				}
		}
		else {
			System.out.println("É preciso ser do sexo masculino para se alistar com obrigatoriedade!");
		}
		
	}

	
}
