import java.util.Locale;

public class EjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso = rt.exec("notepad");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("mac")){
                proceso = rt.exec("texedit");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("nux") || System.getProperty("os.name").toLowerCase().startsWith("nix")){
                proceso = rt.exec("gedit");
            }
            else{
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e){
            System.err.println("e = " + e.getMessage());
        }
        System.out.println("Se ha cerrado el editor");
    }
}
