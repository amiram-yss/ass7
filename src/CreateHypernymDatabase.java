import java.io.File;
import java.util.logging.FileHandler;

public class CreateHypernymDatabase {

    private static byte PARAMS_COUNT = 2;

    /**
     *
     * @param args Params passed from the OS.
     * @return If has the correct number of params to run.
     */
    public static boolean canRun(String[] args) {
        if (args.length != PARAMS_COUNT) {
            return false;
        }
        if (!FileManager.isRoute(args[0])) {
            return false;
        }
        return FileManager.isRoute(args[1]);
    }

    /**
     * Main method
     * @param args Params passed from the OS.
     */
    public static void main(String[] args) {
        if(!canRun(args)) {
            System.out.println("Param error.");
            return;
        }
        System.out.println("Progress started. Please wait.");
    }
}
