import java.time.LocalDate;
import java.time.LocalDateTime;

public class DayTask extends Task {

    public DayTask(String title, String description, LocalDateTime taskDateTime, TaskType taskType) {
        super(title, description, taskDateTime, taskType);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        LocalDate taskDate = this.getTaskDateTime().toLocalDate();
        return localDate.equals(taskDate) || localDate.isAfter(taskDate);
    }

    @Override
    public Repeatable getRepeatabilityType() {
        return Repeatable.DAILY;
    }
}
