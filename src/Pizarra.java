import java.io.FileInputStream;
import java.util.Properties;


public class Pizarra {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;
        try{
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                process = rt.exec("notepad");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("mac")){
                process = rt.exec("texedit");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("nux") || System.getProperty("os.name").toLowerCase().startsWith("nix")){
                process = rt.exec("gedit");
            }
            else{
                process = rt.exec("gedit");
            }
            process.waitFor();
        }catch (Exception e){
            System.err.println("e = :" + e);
        }
        System.out.println("Se cerro el programa.");
    }
}