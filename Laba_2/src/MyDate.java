//  Пример 3.3. Сравнение дат.
//  Листинг 10
public class MyDate {
    private int day, month, year;

    public MyDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    /*@Override
    public boolean equals(Object o) {
        boolean result = false;
        //сравниваем только объекты типа MyDate
        if (o != null && o instanceof MyDate) {
            MyDate d = (MyDate) o;
            if ((day == d.day) && (month == d.month) && (year == d.year))
                result = true;
        }
        return result;
    }*/
}

class TestEquals {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(7, 11, 2014);
        MyDate date2 = new MyDate(7, 11, 2014);

        System.out.println("Ссылки равны?");
        if (date1 == date2) {
            System.out.println("date 1 is identical date2");
        } else {
            System.out.println("date1 is not identical date2");
        }

        System.out.println("Объекты равны?");
        if (date1.equals(date2)) {
            System.out.println("date 1 is equals date2");
        } else {
            System.out.println("date1 is not equals date2");
        }

        System.out.println("Объекты и ссылки равны?");
        date2 = date1;
        if (date1 == date2) {
            System.out.println("date1 is indentical date 2");
        } else {
            System.out.println("date1 is not` indentical date 2");
        }
    }
}
