package com.theironyard.charlotte;

/**
 * Created by mfahrner on 8/8/16.
 */
public class ToDoItem {
    private String text;
    private boolean isDone;

    public ToDoItem(String text) {
        this.isDone = false;
        this.text = text;
    }
    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
