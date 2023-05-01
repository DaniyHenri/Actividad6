import java.io.*;
import java.util.*;

public class AddressBook {
     private HashMap<String, String> contactos;

     public AddressBook() {
          contactos= new HashMap<String, String>();
     }

     //Metodo Load
     public void load(String inputFilename) {
          String a [];

          BufferedReader br = null;

          try {
               br = new BufferedReader(new FileReader(inputFilename));
               String line;
               while ((line =  br.readLine()) != null) {
                    a=line.split(":");
                    contactos.put(a[0],a[1]);
               }
          }
          catch(IOException e) {
          } finally {
               try {
                    if (br != null) {
                         br.close();
                    }
               } catch (IOException e) {
               }
          }
     }

     //Metodo Save
     public void save(String outputFilename) {
          BufferedWriter bw = null;

          try {
               bw = new BufferedWriter(new FileWriter(outputFilename));
               for (Map.Entry<String, String> entry : contactos.entrySet()) {
                    bw.write(entry.getKey() + "," +  entry.getValue() + "\n");
               }
          } catch(IOException e) {
          } finally {
               try {
                    if (bw != null) {
                         bw.close();
                         System.out.println("\nContactos guardados");
                    }
               } catch (IOException e) {
               }
          }
     }

     //Metodo Create
     public void create(String telefono, String nombre) {
          contactos.put(telefono, nombre);
          System.out.println("\nContacto agregado: " + telefono + ", " + nombre);
     }

     //Metodo Delete
     public void delete(String telefono) {
          if (contactos.containsKey(telefono)) {
               contactos.remove(telefono);
               System.out.println("\nContacto eliminado: " + telefono);
          } else {
               System.out.println("\nNo existe el contacto");
          }
     }

     //Metodo list
     public void list() {
          System.out.println("\nLista de contactos en la agenda");
          for (Map.Entry<String, String> entry : contactos.entrySet()) {
               System.out.println(entry.getKey() + ":" +  entry.getValue());
          }
     }

     public static void main(String[] args) {
          AddressBook agenda = new AddressBook();
          String inputFilename = "input.txt";
          String outputFilename = "output.txt";

          agenda.load(inputFilename);

          agenda.create("6562232613", "Daniel");
          agenda.create("6563256435", "Pedro");
          agenda.create("6562124613", "Juan");
          agenda.create("6562535732", "Enrique");

          agenda.delete("6563256435");
          agenda.delete("6562535732");

          agenda.list();

          agenda.save(outputFilename);
     }
}