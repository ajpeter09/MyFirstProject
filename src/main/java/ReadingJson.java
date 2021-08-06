

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadingJson {

    public static void main(String[] args) throws IOException, ParseException {

        String path = System.getProperty("user.dir") + "/src/main/java/test.json";
        FileReader reader = new FileReader(path);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(reader);
        //System.out.println(json.toJSONString());
        JSONArray testData = (JSONArray) json.get("testdata");


        for ( int i = 0 ; i < testData.size(); i++){
            testData.get(i);
            JSONObject dataObject = (JSONObject) testData.get(i);
            System.out.println("Testname : " + dataObject.get("testName"));
            System.out.println("========================================");
            JSONArray dataArray  =(JSONArray) dataObject.get("data");
            for ( int j = 0 ; j <  dataArray.size(); j++){
                JSONObject currentObj =(JSONObject) dataArray.get(j);
                Set<String> keys = currentObj.keySet();
                Iterator<String> it = keys.iterator();
                while(it.hasNext()){
                    String key = it.next();
                    String value = (String) currentObj.get(key);
                    System.out.println(key + "-------" + value);
                }

            }


        }




        
        /*for (int i=0; i < testData.size(); i++){
            JSONObject testDataObj = (JSONObject) testData.get(i);
            String testName = (String) testDataObj.get("testName");
            System.out.println("testName: " + testName );
            System.out.println("****************************************");
            JSONArray dataArray= (JSONArray) testDataObj.get("data");
            for(int j=0; j < dataArray.size(); j++){
                JSONObject currentdata=(JSONObject) dataArray.get(j);
                Set<String> keys = currentdata.keySet();
                Iterator it = keys.iterator();
                while(it.hasNext()){
                    String key = (String) it.next();
                    String value = (String) currentdata.get(key);
                    System.out.println(key + " ----" + value);
                }
                System.out.println("-------------------------------");

            }

        }*/
        
        
        
        
        
        

        /*for (int i = 0; i < testData.size(); i++) {
            JSONObject dataObj = (JSONObject) testData.get(i);
            String testName = (String) dataObj.get("testName");
            JSONArray dataArray = (JSONArray) dataObj.get("data");
            for (int j = 0; j < dataArray.size(); j++) {
                JSONObject currentDataObj = (JSONObject) dataArray.get(j);
                Set<String> keys = currentDataObj.keySet();
                Iterator<String> it = keys.iterator();
                while (it.hasNext()) {
                    String key = it.next();
                    String value = (String) currentDataObj.get(key);
                    System.out.println(key + "   " + value);

                }


            }
        }*/




       /*System.out.println("---JSON obj of testdata----");
       System.out.println(json.toJSONString());
        System.out.println("---JSON obj of get first object----");
        System.out.println(json.get("testdata"));
        System.out.println();
        JSONArray data = (JSONArray) json.get("testdata");
        System.out.println("---JSON data of get first,Second and Third array----");
        System.out.println(data.get(0));
        JSONObject dataSet= (JSONObject) data.get(0);
        System.out.println(dataSet.toJSONString());
        System.out.println();
        System.out.println(dataSet.get("data"));
        System.out.println(dataSet.get("testName"));
        //System.out.println(data.get(1));
       // System.out.println(data.get(2));
        JSONArray setDetails= (JSONArray) dataSet.get("data");
        System.out.println(setDetails.get(0));
        */







    }
}
