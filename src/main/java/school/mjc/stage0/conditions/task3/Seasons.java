package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >0 && month<13){
            if(month<3 || month ==12){
                System.out.println("Winter");
            }else if(month>8){
                System.out.println("Autumn");
            }else if(month>2 && month<6){
                System.out.println("Spring");
            }else{
                System.out.println("Summer");
            }
        }else{
            System.out.println("wrong number!");
        }

    }
}
