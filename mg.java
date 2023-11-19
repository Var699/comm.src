package comm.src.mg;

//LogIngestor.java
import static spark.Spark.*;

public class LogIngestor {

 public static void main(String[] args) {
     port(3000);

     post("/ingest", (req, res) -> {
         String logData = req.body();
         
         // Implement logic to parse and store logData in a database or storage mechanism
         // For simplicity, we'll just print the logData here
         System.out.println("Received log data: " + logData);

         return "Log data ingested successfully";
     });
 }
}

