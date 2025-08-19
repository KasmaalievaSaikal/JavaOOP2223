package modifiers;

public class Country {

    private String name;
    private long population;
    private double area;
    private String langauge;


    public Country() {
    }

    public Country(String name, int population, double square, String langauge) {
        this.name = name;
        this.population = population;
        this.area = square;
        this.langauge = langauge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLangauge() {
        return langauge;
    }

    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }


    public static Country findLargeCountry(Country[] countries) {

        double large = 0;
        for (Country country : countries) {
            if (country.area >= large) { // 1.9 >= 1.9  //1.9>=9,8
                large = country.area;
            }
        }
        for (Country country : countries) {
            if (country.area == large) {
                return country;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", langauge='" + langauge + '\'' +
                '}';
    }
}
