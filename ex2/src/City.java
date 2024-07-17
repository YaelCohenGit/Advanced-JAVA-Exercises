public class City {
    private String name;
    private int numOfResidents;
    private boolean isCapital;
    private Person mayor;

    public City(String name, int numOfResidents, boolean isCapital, Person mayor) {
        this.name = name;
        this.numOfResidents = numOfResidents;
        this.isCapital = isCapital;
        this.mayor = mayor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfResidents() {
        return numOfResidents;
    }

    public void setNumOfResidents(int numOfResidents) {
        this.numOfResidents = numOfResidents;
    }


    public void setIsCapital(boolean isCapital) {
        this.isCapital = isCapital;
    }

    public Person getMayor() {
        return mayor;
    }

    public void setMayor(Person mayor) {
        this.mayor = mayor;
    }

    public boolean IsCapital() {
        return isCapital;
    }
}
