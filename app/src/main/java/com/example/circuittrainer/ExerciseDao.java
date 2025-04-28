package com.example.circuittrainer;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.lifecycle.LiveData;
import java.util.List;

@Dao
public interface ExerciseDao {
    @Insert
    void insert(Exercise exercise);

    @Query("SELECT * FROM exercises ORDER BY `order` ASC")
    LiveData<List<Exercise>> getAllExercises();
}