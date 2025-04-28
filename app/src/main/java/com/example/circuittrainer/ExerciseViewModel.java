package com.example.circuittrainer;  // Adicione esta linha

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;

public class ExerciseViewModel extends AndroidViewModel {
    private ExerciseRepository repository;
    private LiveData<List<Exercise>> allExercises;

    public ExerciseViewModel(Application application) {
        super(application);
        repository = new ExerciseRepository(application);
        allExercises = repository.getAllExercises();
    }

    public LiveData<List<Exercise>> getAllExercises() {
        return allExercises;
    }

    public void insert(Exercise exercise) {
        repository.insert(exercise);
    }
}