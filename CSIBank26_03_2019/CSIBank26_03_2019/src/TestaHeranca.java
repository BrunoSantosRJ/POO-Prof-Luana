
public class TestaHeranca {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Pedro");
		pf.setEmail("pedro@gmail.com");
		pf.setCpf("123.456.789-91");
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("CSI");
		pj.setEmail("CSI@gmail.com");
		pj.setCNPJ("123.456.789-91");
		
		System.out.println(pf.getNome() +  " estuda em " + pj.getNome());
	}

}
