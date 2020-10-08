import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) {

  BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

  int x = 12;

  try {
    System.out.print("Masukkan Data Angka :");
    String data = dataIn.readLine();
    x = Integer.valueOf(data);
  }   
  catch ( IOException e )
  {
    if (x%2 == 1){
      System.out.println("Ganjil");
    }
    else{
      System.out.println("Genap");
    }
  }

  
  }
}