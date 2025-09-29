public class TimeConverter {

    public static void main(String[] args) {
        int totalSeconds = 59; 
        
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;
        
        System.out.println(minutes + " minute(s) and " + remainingSeconds + " second(s)");
    }
}