package abstatas;

public class PessoaJuridica extends Pessoa {
	
	private long cnpj;
	
	private Double precoServico;


	@Override
	public Double salario() {
		return precoServico;
	}

}
