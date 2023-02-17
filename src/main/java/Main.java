import Pages.classFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        String mail,password;
        mail="";
        password="";

        String[] reqID={
                "109689",
                "113363",
                "111326",

                "112394",
                "112909",
                "112908",
                "112903",
                "112910",
                "112911",
                "112912",
                "113050",
                "113541",

                "108703",
                "111923",
                "111323"

        };

       classFactory.invoke(reqID,mail,password);


    }
}
