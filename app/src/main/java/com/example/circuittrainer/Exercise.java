import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "exercises")
public class Exercise {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private int duration;
    private int order;

    public Exercise(String name, int duration, int order) {
        this.name = name;
        this.duration = duration;
        this.order = order;
    }

    // Getters e Setters aqui (gerados automaticamente com Alt+Insert)
}
