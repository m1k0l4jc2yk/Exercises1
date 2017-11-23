public class Person {

    public int ageYears = 25;
    public int ageDays;
    public long ageMinutes, ageSeconds, ageMilliseconds;

    public void calculateAge() {
        ageDays = ageYears * 365;
        ageSeconds = ageDays * 24 * 60 * 60;
        ageMinutes = ageSeconds / 60;
        ageMilliseconds = ageSeconds * 1000;
        
        System.out.println("Masz" + ageDays + " dni.");
        System.out.println("Masz " + ageMinutes + " minut.");
	  System.out.println("masz " + ageSeconds + " sekund.");
	  System.out.println("Masz " + ageMilliseconds + " milisekund.");
    }
}
