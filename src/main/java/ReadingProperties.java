

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("user.dir"));
        Properties prop = new Properties();
        String path = System.getProperty("user.dir")+"/src/main/java/Properties";

        FileInputStream fs = new FileInputStream(path);
        prop.load(fs);

        System.out.println(prop.getProperty("userName"));

        Date d = new Date();
        System.out.println(d);

        JSONObject js = new JSONObject();
        js.put("name","alex");
        js.put("place","USA");
        System.out.println(js.toString());

        JSONObject js1 = new JSONObject();
        js1.put("name","Ajantha");
        js1.put("place","USA");

        JSONArray details = new JSONArray();
        details.put(js);
        details.put(js1);
        System.out.println(details.toString());

        JSONObject jsdetails = new JSONObject();
        jsdetails.put("Userdetails",details);
        System.out.println(jsdetails.toString());








    }
}
