public class Time
{
    public static void main(String args[])
    {
        int hour = 14;
        int minute = 30;
        int second = 37;
        double total = 86400.;
        int sPerHour = 3600;
        int sPerMin = 60;
        double currentTotal = (hour * sPerHour + minute * sPerMin);

        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(second);

        System.out.print("The number of seconds left in the day is: ");
        System.out.println(total - currentTotal);


        System.out.print("Percent of the day remaining: ");
        System.out.print(100 - (currentTotal * 100 / total));
        System.out.println("%");

        int newHour = 14;
        int newMinute = 59;
        int newSecond = 51;

        System.out.print("Elapsed time: ");
        System.out.print(newHour - hour);
        System.out.print(":");
        System.out.print(newMinute - minute);
        System.out.print(":");
        System.out.println(newSecond - second);






    }

}

