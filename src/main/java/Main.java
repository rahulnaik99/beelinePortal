import Pages.classFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        String mail,password;
        mail="naik.r@tcs.com";
        password="Rahulnaik@ylp99#91410";

        String[] reqID={
                "109689",
                "111326",
                "112911",
                "115550",
                "113050",
                "114854",
                "114357",
                "114362",
                "114363",
                "114352",
                "111751",
                "114415",
                "114416"
        };

       classFactory.invoke(reqID,mail,password);


    }
}
