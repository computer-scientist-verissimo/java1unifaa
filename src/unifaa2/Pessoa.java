package unifaa2;

public class Pessoa {
	 private String nome;
	 private String cpf;
	 private String telefone;
	 private String sexo;
	 private Endereco endereco;

	 public Pessoa(String nome, String cpf, String telefone, String sexo, Endereco endereco) {
	     this.nome = nome;
	     this.cpf = cpf;
	     this.telefone = telefone;
	     this.sexo = sexo;
	     this.endereco = endereco;
	 }

	 public String seApresentar() {
	     return "Prazer, meu nome é " + this.nome + "moro em " + this.endereco.getCidade();
	 }

	 // Getters e Setters
	 public String getNome() {
	     return nome;
	 }

	 public void setNome(String nome) {
	     this.nome = nome;
	 }

	 public String getCpf() {
	     return cpf;
	 }

	 public void setCpf(String cpf) {
	     this.cpf = cpf;
	 }

	 public String getTelefone() {
	     return telefone;
	 }

	 public void setTelefone(String telefone) {
	     this.telefone = telefone;
	 }

	 public String getSexo() {
	     return sexo;
	 }

	 public void setSexo(String sexo) {
	     this.sexo = sexo;
	 }

	 public Endereco getEndereco() {
	     return endereco;
	 }

	 public void setEndereco(Endereco endereco) {
	     this.endereco = endereco;
	 }
	}