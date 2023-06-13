package L5B.exercicio01lista5b;

public class Jardinagem {
    String nomeJardim;
    double qtdMetros;
    int qtdPlantas;
    double qtdMetrosGrama;
    double gramaAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorConteGrama;

    public Jardinagem(String nomeJardim, double qtdMetros, int qtdPlantas, double qtdMetrosGrama,
                      double gramaAdubo, double valorAdubo, double valorMetroGrama, double valorConteGrama) {

        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.gramaAdubo = gramaAdubo;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = valorConteGrama;
    }

    public double usarAdubo(){
            double qtdAdubo;
            qtdAdubo = (qtdMetrosGrama / 2) * 100;

            return qtdAdubo;
        }
    public double precoAdubo(){
        double aduboUtilizado = usarAdubo();
        return aduboUtilizado * valorAdubo;
        }
        public double precoCorteGrama(){
            return qtdMetrosGrama * valorMetroGrama;
        }

    @Override
    public String toString() {
        return "Jardinagem{" +
                "nomeJardim='" + nomeJardim + '\'' +
                ", qtdMetros=" + qtdMetros +
                ", qtdPlantas=" + qtdPlantas +
                ", qtdMetrosGrama=" + qtdMetrosGrama +
                ", gramaAdubo=" + gramaAdubo +
                ", valorAdubo=" + valorAdubo +
                ", valorMetroGrama=" + valorMetroGrama +
                ", valorCorteGrama=" + valorConteGrama +
                '}';
    }
}