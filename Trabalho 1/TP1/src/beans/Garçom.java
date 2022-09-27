/* Nesta classe os metodes get e set foram criados para serem utilizados no DAO*/
package beans;

/**
 *
 * @author anaca
 */
public class Garçom {
	private int id;
	private String nome;
	private double salario;
	
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
}
