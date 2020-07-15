public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1234);
		System.out.println(conta.getNumero());

		Cliente thiago = new Cliente();
		// conta.titular = thiago;
		thiago.setNome("Thiago Sampaio");

		conta.setTitular(thiago);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Programador");
	}

}