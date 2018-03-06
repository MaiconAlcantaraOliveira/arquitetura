package ferroviaria;

/**
 *
 */
public class Maquinista extends Equipagem {

    @Override
    public String toString() {
        return "Maquinista{" + 
                "quantidadeHoraMonoconducaoMes:"+ quantidadeHoraMonoconducaoMes 
                + '}'
                + "\n"+  "Equipagem{" 
                + "\n"+ "numeroMatricula:" + numeroMatricula 
                + "\n"+", nome:" + nome 
                + "\n"+ ", salarioPorMes:" + salarioPorMes 
                + "\n"+ ", quantidadeHoraExtraMes:" + quantidadeHoraExtraMes 
                + "\n"+ ", quantidadeHoraNoturnaMes:" + quantidadeHoraNoturnaMes 
                + "\n"+ ", cargo:" + cargo 
                + ", setor:" + setor + '}';
    }

    double quantidadeHoraMonoconducaoMes;

    /**
     * Default constructor
     */
    public Maquinista() {
    }

    public double getQuantidadeHoraMonoconducaoMes() {
        return quantidadeHoraMonoconducaoMes;
    }

    public void setQuantidadeHoraMonoconducaoMes(double quantidadeHoraMonoconducaoMes) {
        this.quantidadeHoraMonoconducaoMes = quantidadeHoraMonoconducaoMes;
    }

    /**
     *
     */
    public double adicionalMonoconducao() {
        double salarioporHora = salarioPorMes / 30;
        return (salarioporHora + (salarioPorMes * 0.10)) * quantidadeHoraMonoconducaoMes;
    }

}
