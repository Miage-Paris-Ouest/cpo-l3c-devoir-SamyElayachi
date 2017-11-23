public class SalleCinema {

    private String film;
    public int nbPlaces;
    private double tarif;
    private int nbPlacesVendus;

    public SalleCinema(String film, int nbPlaces, double tarif) {
        this.film = film;
        this.nbPlaces = nbPlaces;
        this.tarif = tarif;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public void vendrePlace(){
        this.nbPlaces--;
        this.nbPlacesVendus++;
    }

    public double tauxRemplissage(){
        return (double)nbPlacesVendus/nbPlaces;
    }

    public double chiffreAffaire(){
        return (tarif*nbPlacesVendus);
    }

    public boolean estPleine(){
        if(nbPlacesVendus==nbPlaces){
            return true;
        }
        else
            return false;
    }

    public int nbPlacesDisponible(){
        return nbPlaces-nbPlacesVendus;
    }

    public String toString(){
        StringBuffer a=new StringBuffer("");
        a.append("Film projete        : "+ this.film+"\n");
        a.append("Tarif               : "+ this.tarif+"\n");
        a.append("Nombre de places    : "+this.nbPlaces+"\n");
        a.append("Taux de remplissage : "+Math.round(tauxRemplissage()*(1.0/0.0001))/(1.0/0.0001)+"\n");
        a.append("chiffre d'affaire   : "+chiffreAffaire());
        return a.toString();
    }
}
