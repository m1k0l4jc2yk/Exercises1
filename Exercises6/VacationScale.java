public class VacationScale {

    public int [] vacationDays;
    public int yearsOfService;

    public void setVacationScale (){

        vacationDays = new int[7];
        vacationDays[0] = 10;
        vacationDays[1] = 15;
        vacationDays[2] = 15;
        vacationDays[3] = 15;
        vacationDays[4] = 20;
        vacationDays[5] = 20;
        vacationDays[6] = 25;
    }
    public void displayVacationDays() {
        if (yearsOfService >= 0 && yearsOfService <= 6){
            System.out.println("Urlop w wymiarze " + vacationDays[yearsOfService] + " dni");
        } else if (yearsOfService > 6){
            System.out.println("Urlop w wymiarze " + vacationDays[6] + " dni");
        } else {
            System.out.println("Podano niewłaściwą wartość");
        }
    }
}
