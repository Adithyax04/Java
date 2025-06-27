   import java.io.*;  
    import java.util.*;

public class sumfromfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        int a,sum=0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            System.out.println("\nThe file contains:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            
            StringTokenizer l=new StringTokenizer(line);
            while(l.hasMoreTokens())
            {
             //System.out.println(l.nextToken());
             sum=sum+Integer.parseInt(l.nextToken());
            }
            }
            
            System.out.println("Sum="+sum); 
            bufferedReader.close();
        } catch (IOException e) {
           System.out.println("IOException "+e);
        }
    }
}
