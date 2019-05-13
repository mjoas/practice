import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class MainCode {

    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public MainCode() {

        Logger root = Logger.getLogger("");
        FileHandler txt = null;
        try {
            txt = new FileHandler("Log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        root.setLevel(Level.ALL);
        txt.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                String ret = "";
                if(record.getLevel().intValue() >= Level.WARNING.intValue()){
                    ret += "ATTENTION!:";
                }
                ret += record.getLevel();
                SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                Date date = new Date(record.getMillis());
                ret += df.format(date);
                return ret;
            }
        });
        root.addHandler(txt);
    }

    public static void main(String[] args){

        MainCode mc = new MainCode();
        mc.dosth();
    }

    private void dosth(){

        logger.severe("Error something terribe Happend");
        logger.warning("This is a warning");
        logger.info("running smooth");
    }
}
