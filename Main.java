package NewLesson5;


import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       // try (OutputStream out = new FileOutputStream("HomeWork")) {
       //     out.write("Hello World; Doing my Home Work;".getBytes(StandardCharsets.UTF_8));
       // } catch (FileNotFoundException e) {
       //     e.printStackTrace();
       // } catch (IOException e) {
       //     e.printStackTrace();
       // }

       // try (InputStreamReader in = new InputStreamReader(new FileInputStream("HomeWork"))) {
       //     int x;
       //     while ((x = in.read()) != -1) {
       //         System.out.print((char) x);
       //     }

       // } catch (FileNotFoundException e) {
       //     e.printStackTrace();
       // } catch (IOException e) {
       //     e.printStackTrace();
       // }

        ArrayList<AppData> appDataArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("CarBrand.txt"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
            String[] values = tempString.split(";");
            appDataArrayList.add(new AppData(values[0], values[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(appDataArrayList);

    }
}
