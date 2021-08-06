

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadingYML {

    public static void main(String[] args) throws FileNotFoundException, YamlException {

        String path = System.getProperty("user.dir") + "/src/main/java/test.yml";
        YamlReader reader = new YamlReader(new FileReader(path));
        Map map = (Map) reader.read();
        //System.out.println(map.size());
        //System.out.println(map.get("testdata"));
        List dataSets = (List) map.get("testdata");

        for (int i = 0; i < dataSets.size(); i++) {
            Map mapData = (Map) dataSets.get(i);
            String testName = (String) mapData.get("testname");
            System.out.println(testName);
            List dataSet = (List) mapData.get("data");
            for (int j = 0; j < dataSet.size(); j++) {
                Map currentMap = (Map) dataSet.get(j);
                Set<String> keySet = currentMap.keySet();

                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    String key = (String) it.next();
                    String value = (String) currentMap.get(key);

                    System.out.println(key + " ---- -----  " + value);
                }
            }

        }


    }
}
