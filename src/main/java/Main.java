import Pages.classFactory;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String mail,password;
        mail="";
        password="";

        String[] reqID={
                "109689",
                "113363",
                "111126",
                "111323",
                "111326",
                "112394",
                "108703",
                "111923",
                "112664",
                "112909",
                "112908",
                "112903",
                "112910",
                "112911",
                "112912",
                "112345",
                "113050",
                "113541"

        };

       classFactory.invoke(reqID,mail,password);


    }
}
