package day02_OopWithNLayeredApp.core.logging;

public class DataBaseLogger implements Logger{
    public void log(String data){
        System.out.println("Veri tabanına loglanır " + data);
    }
}
