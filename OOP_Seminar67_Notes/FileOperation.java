package OOP_Seminar67_Notes;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();
    void saveAllLines(List<String> lines);
}