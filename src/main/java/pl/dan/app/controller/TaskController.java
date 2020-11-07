package pl.dan.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.dan.app.model.Task;
import pl.dan.app.model.enums.Category;
import pl.dan.app.service.TaskService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/task")
public class TaskController {
    private List<Task> tasks = TaskService.getHardcodedTaskList();

    @GetMapping("/list")
    public String listTasks(Model model) {

        model.addAttribute("taskList", tasks);

        return "list-tasks";
    }

    @GetMapping("/show-task-form")
    public String showTaskCreationForm(Model model) {
        List<Category> categories = new ArrayList<>(Arrays.asList(Category.values()));
        model.addAttribute("categoriesList", categories);

        return "add-new-task";
    }

    @PostMapping("/submit-task-form")
    public String addNewTask(@ModelAttribute("task") Task task, Model model) {

        tasks.add(task);
        model.addAttribute("taskList", tasks);
        return "list-tasks";
    }

    @PostMapping("/delete-to-do")
    public String deleteTask(@ModelAttribute("tasksToDelete") TaskTDO taskTDO) {

        tasks.stream()
                .filter(task -> taskTDO.getIdList().stream()
                        .anyMatch(aLong -> aLong != task.getId()))
                .collect(Collectors.toList());

        return "list-tasks";
    }
}
