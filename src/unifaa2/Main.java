package unifaa2;

public class Main {
 public static void main(String[] args) {
     Endereco endereco1 = new Endereco("Rua A", 123, "Centro", "Cidade A", "Apto 1");
     Endereco endereco2 = new Endereco("Rua B", 456, "Vila Nova", "Cidade B", "Casa 2");
     Endereco endereco3 = new Endereco("Rua C", 789, "Jardim Bela Vista", "Cidade C", "");

     Pessoa pessoa1 = new Pessoa("João", "123.456.789-00", "(11) 98765-4321", "Masculino", endereco1);
     Client pessoa2 = new Client("Maria", "987.654.321-00", "(11) 99999-8888", "Feminino", endereco2);
     Vendedor pessoa3 = new Vendedor("Pedro", "111.222.333-44", "(11) 11111-2222", "Masculino", endereco3);

     System.out.println(pessoa1.seApresentar());
     System.out.println(pessoa2.seApresentar());
     System.out.println(pessoa3.seApresentar());
 }
}

