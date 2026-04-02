package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {

        Properties p=new Properties();
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
        p.load(file);

        Set<Object> k= p.keySet();
        System.out.println(k);

        Collection<Object> v= p.values();
        System.out.println(v);

    }
}
