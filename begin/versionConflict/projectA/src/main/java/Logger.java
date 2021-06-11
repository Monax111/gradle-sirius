public class Logger {

    public void log(String str, Boolean isDebug) {
        if (isDebug) {
            System.out.println(str);
        }
    }
}
