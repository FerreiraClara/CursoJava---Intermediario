package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.Exercicio.dominio;

public class Local {
    private String address;
    private Seminar[] seminar;

    public Local(String address){
        this.address = address;
    }

    public Local(String address, Seminar[] seminar){
        this.address = address;
        this.seminar = seminar;
    }

    public void print(){
        System.out.println("Dados do Local: ");
        System.out.println("    Endereço: " + this.address);

        if(seminar != null) {
            System.out.println("    Seminários: ");
            for (Seminar seminar : seminar) {
                System.out.println("    - " + seminar.getTitle());
            }

        } else {
            System.out.println("Não possui seminários correspondentes a esse local!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Seminar[] getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar[] seminar) {
        this.seminar = seminar;
    }
}
