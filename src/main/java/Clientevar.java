import java.time.LocalDate;
import java.util.List;

public class Clientevar {
	 private long id;
     private String nome;
     private String primeiroNome;


     private String cpf;
     private LocalDate dataNascimento;
     private int versao;


     public long getId() {
         return id;
     }

     public void setId(long id) {
         this.id = id;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public String getPrimeiroNome() {
         return primeiroNome;
     }

     public void setPrimeiroNome(String primeiroNome) {
         this.primeiroNome = primeiroNome;
     }

     public String getCpf() {
         return cpf;
     }

     public void setCpf(String cpf) {
         this.cpf = cpf;
     }

     public LocalDate getDataNascimento() {
         return dataNascimento;
     }

     public void setDataNascimento(LocalDate dataNascimento) {
         this.dataNascimento = dataNascimento;
     }

     public int getVersao() {
         return versao;
     }

     public void setVersao(int versao) {
         this.versao = versao;
     }
}


