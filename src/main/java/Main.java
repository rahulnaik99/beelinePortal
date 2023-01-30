import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        String[] reqID={
                "109689",
                "109018",
                "111126",
                "112622",
                "112626",
                "112627",
                "111715",
                "111716",
                "111657",
                "111663",
                "112000",
                "111999",
                "111323",
                "111326",
                "111131",
                "111133",
                "108703",
                "111923",
                "112084",
                "111751",
                "112504",
                "112664",
                "112345",
                "112394",
                "112828",


        };
       classFactory Method = new classFactory();
        Method.invoke(reqID);

    }
}
