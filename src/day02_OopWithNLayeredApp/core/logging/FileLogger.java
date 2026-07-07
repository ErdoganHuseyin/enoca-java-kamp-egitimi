package day02_OopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {
    public void log(String data){
        System.out.println("Dosyaya loglanır " + data);
    }
}
