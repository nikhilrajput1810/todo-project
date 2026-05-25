package todobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import todobackend.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}