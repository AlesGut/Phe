package solvers;

import practice_4_if_for.Season;

public class SwitchTaskSolver {
    public static void main (String[] args){
        //проверка метода возвращаемого день недели по числу;
        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek(10));
        //проверка метода по описанию сезона;
        System.out.println(describeSeasom(Season.WINTER));
        System.out.println(describeSeasom(Season.AUTUMN));
    }
    public static String dayOfWeek(int day) {
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = ("Несуществующий день недели");
        }
        return dayOfWeek;
    }

    public static String describeSeasom(Season season) {
        String description = "";


        switch (season) {
            case WINTER -> description = "Зима - холодно и снежно";
            case SUMMER -> description = "Лето - жарко";
            case SPRING -> description = "Весна - все цветет";
            case AUTUMN -> description = "Осень - сиди на Бали";
        }
        return description;
    }
}
