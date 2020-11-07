package pl.dan.app.service;

import org.springframework.stereotype.Service;
import pl.dan.app.model.Task;
import pl.dan.app.model.enums.Category;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Service
public class TaskService {

    public static List<Task> getHardcodedTaskList() {

        Task task1 = new Task(1l, "Buy juice", Category.PURCHASES, LocalDate.now());
        Task task2 = new Task(2l, "Read on Spring MVC", Category.STUDY);
        Task task3 = new Task(3l, "Close remaining tickets", Category.WORK);

        List<Task> tasks = new LinkedList<>();

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        return tasks;
    }
}
