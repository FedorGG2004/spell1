import org.json.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class speller {
    public static void main(String[] args) {
        String output = getUrlContent("http://speller.yandex.net/services/spellservice.json/checkText?text=Карова");
        Map<String, Object> tish = new HashMap<String, Object>();
        String email = output;
        // em(output);
        System.out.println(output);
        JSONObject jObject = new JSONObject(tish);
        JSONArray myValue = (JSONArray) jObject.get("s");
        // JSONArray jsonArray = new JSONObject(tish).getJSONArray("s");
        //org.json.JSONObject mina = myValue.getJSONObject(0);
        //String qwe = mina.getString("s");
        System.out.println(myValue);
        
        //JSONArray array = (JSONArray) jObject;
        //JSONObject c = array.getJSONObject(0);
    }
    static void em(String emi){
        for (int i = 0; i < emi.length(); i++) {
            emi = emi.replace("\\u0410", "А");
            emi = emi.replace("\\u0411", "Б");
            emi = emi.replace("\\u0412", "В");
            emi = emi.replace("\\u0413", "Г");
            emi = emi.replace("\\u0414", "Д");
            emi = emi.replace("\\u0415", "Е");
            emi = emi.replace("\\u0416", "Ж");
            emi = emi.replace("\\u0417", "З");
            emi = emi.replace("\\u0418", "И");
            emi = emi.replace("\\u0419", "Й");
            emi = emi.replace("\\u041A", "К");
            emi = emi.replace("\\u041B", "Л");
            emi = emi.replace("\\u041C", "М");
            emi = emi.replace("\\u041D", "Н");
            emi = emi.replace("\\u041E", "О");
            emi = emi.replace("\\u041F", "П");
            emi = emi.replace("\\u0420", "Р");
            emi = emi.replace("\\u0421", "С");
            emi = emi.replace("\\u0422", "Т");
            emi = emi.replace("\\u0423", "У");
            emi = emi.replace("\\u0424", "Ф");
            emi = emi.replace("\\u0425", "Х");
            emi = emi.replace("\\u0426", "Ц");
            emi = emi.replace("\\u0427", "Ч");
            emi = emi.replace("\\u0428", "Ш");
            emi = emi.replace("\\u0429", "Щ");
            emi = emi.replace("\\u042A", "Ъ");
            emi = emi.replace("\\u042B", "Ы");
            emi = emi.replace("\\u042C", "Ь");
            emi = emi.replace("\\u042D", "Э");
            emi = emi.replace("\\u042E", "Ю");
            emi = emi.replace("\\u042F", "Я");

            emi = emi.replace("\\u0430", "а");
            emi = emi.replace("\\u0431", "б");
            emi = emi.replace("\\u0432", "в");
            emi = emi.replace("\\u0433", "г");
            emi = emi.replace("\\u0434", "д");
            emi = emi.replace("\\u0435", "е");
            emi = emi.replace("\\u0436", "ж");
            emi = emi.replace("\\u0437", "з");
            emi = emi.replace("\\u0438", "и");
            emi = emi.replace("\\u0439", "й");
            emi = emi.replace("\\u043A", "к");
            emi = emi.replace("\\u043B", "л");
            emi = emi.replace("\\u043C", "м");
            emi = emi.replace("\\u043D", "н");
            emi = emi.replace("\\u043E", "о");
            emi = emi.replace("\\u043F", "п");
            emi = emi.replace("\\u0440", "р");
            emi = emi.replace("\\u0441", "с");
            emi = emi.replace("\\u0442", "т");
            emi = emi.replace("\\u0443", "у");
            emi = emi.replace("\\u0444", "ф");
            emi = emi.replace("\\u0445", "х");
            emi = emi.replace("\\u0446", "ц");
            emi = emi.replace("\\u0447", "ч");
            emi = emi.replace("\\u0448", "ш");
            emi = emi.replace("\\u0449", "щ");
            emi = emi.replace("\\u044A", "ъ");
            emi = emi.replace("\\u044B", "ы");
            emi = emi.replace("\\u044C", "ь");
            emi = emi.replace("\\u044D", "э");
            emi = emi.replace("\\u044E", "ю");
            emi = emi.replace("\\u044F", "я");

            emi = emi.replace("\\u0020", " ");
            emi = emi.replace("\\u0021", "!");
            emi = emi.replace("\\u003F", "?");
            emi = emi.replace("\\u003A", ":");
            emi = emi.replace("\\u003B", ";");
            emi = emi.replace("\\u0028", "(");
            emi = emi.replace("\\u0029", ")");
            emi = emi.replace("\\u00AB", "«");
            emi = emi.replace("\\u00BB", "»");
        }
        System.out.println(emi);
    }
    private static String getUrlContent(String urlAdress) {
        StringBuffer content=new StringBuffer();
        try {
            URL url = new URL(urlAdress);
            URLConnection urlConn = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Error53");
        }
        return content.toString();
    }
}
