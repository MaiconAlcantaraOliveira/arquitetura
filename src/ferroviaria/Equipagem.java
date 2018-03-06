package ferroviaria;

/**
 *
 */
public class Equipagem extends Trem {

   @Override
    public String toString() {
        return "Equipagem{" 
                + "\n"+ "numeroMatricula:" + numeroMatricula 
                + "\n"+", nome:" + nome 
                + "\n"+ ", salarioPorMes:" + salarioPorMes 
                + "\n"+ ", quantidadeHoraExtraMes:" + quantidadeHoraExtraMes 
                + "\n"+ ", quantidadeHoraNoturnaMes:" + quantidadeHoraNoturnaMes 
                + "\n"+ ", cargo:" + cargo 
                + ", setor:" + setor + '}';
    }

    /**
     * Default constructor
     */
    public Equipagem() {
    }

    /**
     *
     */
    public int numeroMatricula;

    /**
     *
     */
    public String nome;

    /**
     *
     */
    public double salarioPorMes;

    /**
     *
     */
    public double quantidadeHoraExtraMes;

    /**
     *
     */
    public double quantidadeHoraNoturnaMes;

    /**
     *
     */
    public String cargo;

    /**
     *
     */
    public String setor;

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPorMes() {
        return salarioPorMes;
    }

    public void setSalarioPorMes(double salarioPorMes) {
        this.salarioPorMes = salarioPorMes;
    }

    public double getQuantidadeHoraExtraMes() {
        return quantidadeHoraExtraMes;
    }

    public void setQuantidadeHoraExtraMes(double quantidadeHoraExtraMes) {
        this.quantidadeHoraExtraMes = quantidadeHoraExtraMes;
    }

    public double getQuantidadeHoraNoturnaMes() {
        return quantidadeHoraNoturnaMes;
    }

    public void setQuantidadeHoraNoturnaMes(double quantidadeHoraNoturnaMes) {
        this.quantidadeHoraNoturnaMes = quantidadeHoraNoturnaMes;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return
     */
    private double adicionalPorEstouro() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    private double adicionalPorTrecho() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public double adicionalHoraExtra() {
        double salarioporHora = salarioPorMes / 30;
        return (salarioporHora + (salarioPorMes*0.15))*quantidadeHoraExtraMes;
    }

    /**
     * @return
     */
    public double adicionalNoturno() {
        double salarioporHora = salarioPorMes / 30;
        return (salarioporHora + (salarioporHora*0.20))*quantidadeHoraNoturnaMes;
    }

}
