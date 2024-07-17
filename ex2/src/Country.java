import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Country {
    private String name;
    private int area;
    private List<City> cities;

    public Country(String name, int area, List<City> cities) {
        this.name = name;
        this.area = area;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
    public Map<String, Integer> getNumOfResidentsMap(int num){
        return cities.stream().filter( c -> c.getNumOfResidents() > num).collect(Collectors.toMap(City::getName, City::getNumOfResidents));
    }

    public City getCapital(City c) {
        boolean x = c.IsCapital();
        if(x){
            return c;
        }
        return null;

    }

    //    public City getCapital(){
//        City capital = cities.stream().reduce((c1, c2) -> c1.isCapital()?c1:c2).get();
//        if(capital == null){
//            throw new RuntimeException();
//        }
//        else{
//            return capital;
//        }
//    }

    public Set<String> getMayors() {
        List<City> newCities = cities;
        return newCities.stream().map(City::getMayor).filter(m -> m.getAge()>50).map(Person::getName).collect(Collectors.toSet());
    }
    public String getCityWithMaxResidents() {
        List<City> newCities = cities;
        return newCities.stream().reduce((c1,c2) -> c1.getNumOfResidents() > c2.getNumOfResidents()? c1 : c2).map(City::getName).toString();
    }
    public boolean isCityExists(String name){
        List<City> newCities = cities;
        String n = cities.stream().map(City::getName).filter(p -> p == name).findFirst().get();
        if(n == null){
            return false;
        }
        return true;
    }




}
