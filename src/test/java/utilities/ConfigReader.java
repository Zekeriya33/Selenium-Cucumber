package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    static { // Her method dan once calisir

        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis); // fis in okudugu bilgileri properties e yükledi

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String getProperty(String key){
 /*
 test methodundan yolladıgımız string key degerini alip Properties classindan getproperty()methodunu
   kullanarak bu key e ait value degerini bize getirir
   */
        return properties.getProperty(key);
    }
}