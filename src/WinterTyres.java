public class WinterTyres {
    public static void main(String[] args) {

        needWinterTyres(8, true);

    }

    public static boolean needWinterTyres (int temperature, boolean slipperyRoad) {

        if (temperature < 10 && slipperyRoad == true){
            System.out.println("Please use winter tyres!");
            return true;
        }
            else if (temperature < 4) {
            System.out.println("Please use winter tyres!");
            return true;
        }
            else {
            System.out.println("Winter tyres are not required.");
            return false;
        }
    }
}
