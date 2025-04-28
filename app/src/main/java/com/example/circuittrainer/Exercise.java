package com.example.circuittrainer;

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
    public int getId() { return id; }
    public String getName() { return name; }
    public int getDuration() { return duration; }
    public int getOrder() { return order; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setOrder(int order) { this.order = order; }
}