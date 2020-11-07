package pl.dan.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import pl.dan.app.model.enums.Category;
import pl.dan.app.model.enums.Status;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Access(AccessType.FIELD)
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TASK_ID")
    private Long id;

    @NonNull
    @Column(name = "TASK_DESCRIPTION")
    private String description;

    @Column(name = "СREATED_DATE", updatable = false)
    private LocalDate creationDate;

    @Column(name = "COMPLETED_DATE", updatable = false)
    private LocalDate completionDate;

    @Column(name = "DUE_DATE")
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private Status status;

    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(name = "CATEGORY")
    private Category category;

    public Task(String description, Category category) {
        this.description = description;
        this.category = category;
        this.status = Status.PLANNED;
        this.creationDate = LocalDate.now();
    }

    public Task(String description, Category category, LocalDate dueDate) {
        this.description = description;
        this.category = category;
        this.status = Status.PLANNED;
        this.creationDate = LocalDate.now();
        this.dueDate = dueDate;
    }

    public Task(Long id, String description, Category category, LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.status = Status.PLANNED;
        this.creationDate = LocalDate.now();
        this.dueDate = dueDate;
    }

    public Task(Long id, String description, Category category) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.status = Status.PLANNED;
        this.dueDate = dueDate;
    }
}
