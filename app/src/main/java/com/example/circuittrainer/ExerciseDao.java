import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface ExerciseDao {
    @Query("SELECT * FROM exercises ORDER BY `order` ASC")
    LiveData<List<Exercise>> getAllExercises();

    @Insert
    void insert(Exercise exercise);

    @Query("DELETE FROM exercises")
    void deleteAll();
}