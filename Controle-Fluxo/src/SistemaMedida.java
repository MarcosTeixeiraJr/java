import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class SistemaMedida {
    public static void main(String[] args){
        String sigla = "G";

        if (sigla.equals("P"))
            System.out.println("PEQUENO");

        else if (sigla.equals("M"))
            System.out.println("MEDIO");

        else if (sigla.equals("G"))
            System.out.println("GRANDE");

        else
            System.out.println("INDEFINIDO");
    }
}
