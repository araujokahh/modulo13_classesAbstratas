package abstatas;

public class PessoaFisica extends Pessoa {
	
	private long cpf;
	
	private Double precoHora;

	@Override
	public Double salario() {
		return precoHora;
	}

}
