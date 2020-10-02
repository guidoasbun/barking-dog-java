public class BarkingDog {

    public static void main(String[] args) {
        boolean wakeup = shouldWakeUp(false, 2);
        System.out.println(wakeup);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        boolean wakeUp = false;

        if(hourOfDay <= 8 || hourOfDay >= 22){
            wakeUp = false;
        }else {
            wakeUp = true;
        }
        return wakeUp;
    }

}
