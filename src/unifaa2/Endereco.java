package unifaa2;

public class Endereco {
	 private String rua;
	 private int num;
	 private String bairro;
	 private String cidade;
	 private String complemento;

	 public Endereco(String rua, int numero, String bairro, String cidade, String complemento) {
	     this.rua = rua;
	     this.num = numero;
	     this.bairro = bairro;
	     this.cidade = cidade;
	     this.complemento = complemento;
	 }

	 // Getters e Setters
	 public String getRua() {
	     return rua;
	 }

	 public void setRua(String rua) {
	     this.rua = rua;
	 }

	 public int getNumero() {
	     return num;
	 }

	 public void setNumero(int numero) {
	     this.num = numero;
	 }

	 public String getBairro() {
	     return bairro;
	 }

	 public void setBairro(String bairro) {
	     this.bairro = bairro;
	 }

	 public String getCidade() {
	     return cidade;
	 }

	 public void setCidade(String cidade) {
	     this.cidade = cidade;
	 }

	 public String getComplemento() {
	     return complemento;
	 }

	 public void setComplemento(String complemento) {
	     this.complemento = complemento;
	 }
	}
