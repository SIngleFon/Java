package HomeWork_Ls2.Task1;
import java.io.BufferedReader;
import java.io.FileReader;



public class Task1 {

    public static StringBuilder ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line.trim());
        return sb;
        }
        return sb;
    }

    public static void main(String[] args) throws Exception {
        StringBuilder list = ReadLineFromFile("HomeWork_Ls2/Task1/data.xml");
        String ar = list.toString();
        ar = ar.replaceAll("[,{}\"]", "");
        ar = ar.replaceAll("[:]", " ");
        String[] ars = ar.split(" ");
        StringBuilder result = new StringBuilder("select * from students where ");
        for (int i = 0; i < ars.length - 1; i+= 2) {
            if ((ars[i].contains("null") != true) & (ars[i+1].contains("null") != true)){
                result.append(ars[i] + " = " + ars[i+1] + ", ");
            }
        }
        int last = result.length() - 2;
        result.replace(last, last + 1, ".");
        System.out.println(result);
    }
}
