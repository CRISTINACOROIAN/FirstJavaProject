public class Calculator {

    public double sum(int first, double second){

        double result = first + second;
        return result;
    }
    public int substract(int first, int second){

        int result = first - second;
        return result;
    }
    public int multiply(int first,int second){

         int result = first * second;
         return result;
    }
//    9.Scrieti o metoda java, care primeste distanta
//    (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
//    si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora.
//    (Indiciu: 1 mila = 1609 metrii)

    public void printSpeedInMetric(float meters, int hours, int minutes, int seconds) {
        // V = D/T
        int timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        float speedMeters = meters / timeInSeconds;
        System.out.println("The speed in m/s: "+speedMeters);
        double kmPerHour = speedMeters * 3.6;
        System.out.println("The speed in km/h: " + kmPerHour );
        double milesPerHour = kmPerHour / 1.609;
        System.out.println("The speed in m/h: " + milesPerHour);
    }
}
