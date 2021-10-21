public class Cobertura extends Apartamento {
    public Cobertura() {
        this.numeroQuartos = 4;
    }

    public void setAreaApartamento(int area) {
        this.areaApartamento = area;
    }

    public void upgrade(Apartamento apt){
        apt.areaApartamento += 40;
        apt.numeroQuartos += 1;
    }
}
