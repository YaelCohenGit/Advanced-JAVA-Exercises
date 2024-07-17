import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Arrays.asList VS List.of
        //List.of() you cant change
        City Jerusalem = new City("Jerusalem", 1000000, true, new Person("1","Moshe Leon", 50));
        City BneiBrak = new City("Bnei Brak", 300000, false, new Person("2","Avraham Rubinstein", 50));
        City TelAviv = new City("Tel Aviv", 500000, false, new Person("3","Roni", 50));
        Country Israel = new Country("Israel", 90000, List.of(Jerusalem, BneiBrak , TelAviv));

        City NewYork = new City("New York", 1000000, true, new Person("1","Mr. New York", 50));
        City California = new City("California", 300000, false, new Person("2","Mr. California", 50));
        Country USA = new Country("USA", 300000000, List.of( NewYork, California));

        List<Country> countries =  List.of(Israel, USA);

//        countries.stream().map(Country::getName).forEach(System.out::println);
//        countries.stream().map(Country::getArea).filter(m -> m < 10000)//.sorted((x, y) -> {return Integer.compare(x, y);})
//                .sorted((x, y) -> {
//                    //System.out.println("comparing: " + x + "," + y);
//                    return Integer.compare(x, y);
//                }).toMap()

        Map<Integer,List<City>> ans = countries.stream().filter(x -> {
                    System.out.println(x.getName());
                    return x.getArea()<10000;
                })
                .sorted((x, y) -> Math.max(x.getArea(), y.getArea()))
                .collect(Collectors.toMap(c->c.getCities().size(),Country::getCities));

        System.out.println(countries.stream().flatMap(c -> c.getCities().stream()).map(City::getName).collect(Collectors.joining(", ")));


    }
}