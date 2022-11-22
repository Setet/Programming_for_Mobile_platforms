import java.util.Objects;

class Dislocation implements Print_inf, Check_inf {
    String city;
    String country;
    String id_country;

    Dislocation(String city, String country, String id_country) {
        this.city = city;
        this.country = country;
        this.id_country = id_country;

    }

    public void print() {
        System.out.printf("""
                Город:%s
                Страна:%s
                Номер страны:%s
                """, city, country, id_country);
    }

    public void check() {
        boolean status = Objects.equals(country, "Russia") & Objects.equals(id_country, "228");
        System.out.printf("Статус проверки первого этапа : %s \n", status);
    }
}
