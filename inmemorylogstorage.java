package comm.src.mg;

//InMemoryLogStorage.java
import java.util.ArrayList;
import java.util.List;

public class InMemoryLogStorage {

 private List<String> logs;

 public InMemoryLogStorage() {
     this.logs = new ArrayList<>();
 }

 public void addLog(String log) {
     logs.add(log);
 }

 public List<String> getLogs() {
     return new ArrayList<>(logs);
 }
}

