import Pages.classFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        String mail,password;
        mail="naik.r@tcs.com";
        password="";

        String[] reqID={
                "120688",
                "120444",
                "120445",
                "120848",
                "120875",
                "120976"

        };

       classFactory.invoke(reqID,mail,password);


    }
}
