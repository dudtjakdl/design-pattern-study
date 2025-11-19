package patterns.creational.prototype.chpark;

public class Task implements Cloneable {
    private String description;
    private boolean completed;
    private String priority; // HIGH, MEDIUM, LOW

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    @Override
    public Task clone() {
        try {
            return (Task) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported", e);
        }
    }

    public void complete() {
        this.completed = true;
    }

    public void reset() {
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (Priority: %s)", 
            completed ? "✓" : " ", description, priority);
    }
}

