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
                "112910",
                "112911",
                "112912",
                "113050",
                "113541",
                "111923",
                "114415",
                "114416"

        };

       classFactory.invoke(reqID,mail,password);


    }
}
