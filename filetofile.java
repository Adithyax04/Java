    import java.io.*;  
    import java.util.Scanner;

public class filetofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        System.out.println("Enter the file name to copy: ");
        String fileName1 = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(fileName1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = null;

            System.out.println("\nThe file contains:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
            }

            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("IOException "+e);
        }
        finally{
        System.out.println("Ok Finished");
        }
    }
}
