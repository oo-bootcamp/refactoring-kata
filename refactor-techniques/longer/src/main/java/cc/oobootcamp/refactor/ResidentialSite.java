package cc.oobootcamp.refactor;

import java.util.Date;

public class ResidentialSite {
    private Zone zone;
    private Reading[] readings = new Reading[1000];
    private static final double TAX_RATE = 0.05;

    public ResidentialSite(Zone zone) {
        this.zone = zone;
    }

    public void addReading(Reading newReading) {
        // add reading to end of array
        int i = 0;
        while (readings[i] != null) i++;
        readings[i] = newReading;
    }

    public Dollars charge() {
        // find last reading
        int i = 0;
        while (readings[i] != null) i++;
        int usage = readings[i - 1].getAmount() - readings[i - 2].getAmount();
        Date end = readings[i - 1].getDate();
        Date start = readings[i - 2].getDate();
        start.setDate(start.getDate() + 1); //set to begining of period
        return charge(usage, start, end);
    }

    private Dollars charge(int usage, Date start, Date end) {
        Dollars result;
        double summerFraction;

        // Find out how much of period is in the summer
        if (start.after(zone.getSummerEnd()) || end.before(zone.getSummerStart()))
            summerFraction = 0;
        else if (!start.before(zone.getSummerStart()) && !start.after(zone.getSummerEnd()) && !end.before(zone.getSummerStart()) && !end.after(zone.getSummerEnd())) {
            summerFraction = 1;
        } else {
            // part in summer part in winter
            double summerDays;
            if (start.before(zone.getSummerStart()) || start.after(zone.getSummerEnd())) {
                // end is in the summer
                summerDays = DayOfYear(end) - DayOfYear(zone.getSummerStart()) + 1;
            } else {
                // start is in summer
                summerDays = DayOfYear(zone.getSummerEnd()) - DayOfYear(start) + 1;
            }
            summerFraction = summerDays / (DayOfYear(end) - DayOfYear(start) + 1);
        }

        result = new Dollars((usage * zone.getSummerRate() * summerFraction) + (usage * zone.getWinterRate() * (1 - summerFraction)));
        result = result.plus(new Dollars(result.times(TAX_RATE)));

        Dollars fuel = new Dollars(usage * 0.0175);
        result = result.plus(fuel);

        result = new Dollars(result.plus(fuel.times(TAX_RATE)));

        return result;

    }

    private int DayOfYear(Date arg) {
        int result;
        switch (arg.getMonth()) {
            case 0:
                result = 0;
                break;
            case 1:
                result = 31;
                break;
            case 2:
                result = 59;
                break;
            case 3:
                result = 90;
                break;
            case 4:
                result = 120;
                break;
            case 5:
                result = 151;
                break;
            case 6:
                result = 181;
                break;
            case 7:
                result = 212;
                break;
            case 8:
                result = 243;
                break;
            case 9:
                result = 273;
                break;
            case 10:
                result = 304;
                break;
            case 11:
                result = 334;
                break;
            default:
                throw new IllegalArgumentException();
        }
        result += arg.getDate();

        //check leap year
        if ((arg.getYear() % 4 == 0) && ((arg.getYear() % 100 != 0) ||
                ((arg.getYear() + 1900) % 400 == 0))) {
            result++;
        }

        return result;
    }
}
