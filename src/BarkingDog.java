public class BarkingDog {

//    public static void main(String[] args) {
//        boolean wakeup = shouldWakeUp(true, -1);
//        System.out.println(wakeup);
//    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        boolean wakeUp = false;

        if(barking && ((hourOfDay < 8 && hourOfDay >= 0 ) || (hourOfDay > 22 && hourOfDay <= 23))){
            wakeUp = true;
        }else if (barking && (hourOfDay < 0 || hourOfDay > 23)){
            wakeUp = false;
        }
        return wakeUp;
    }

}
