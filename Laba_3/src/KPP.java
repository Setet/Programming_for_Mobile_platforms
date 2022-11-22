import java.util.Calendar;
import java.util.GregorianCalendar;

public class KPP {
    public static void main(String[] args) {
        System.out.print("Первый этап :\n");

        Calendar calendar = new GregorianCalendar(2005, Calendar.JANUARY, 11);

        Print_inf print_man = new Personal_Data("Billy", "Kelli", calendar,
                "12345");
        Check_inf check_man = (Check_inf) print_man;
        print_man.print();
        check_man.check();


        System.out.print("\nВторой этап :\n");
        Print_inf print_dislocate = new Dislocation("Ufa", "Russia", "228");
        Check_inf check_dislocate = (Check_inf) print_dislocate;
        print_dislocate.print();
        check_dislocate.check();
    }
}


