package leonardo.rigo.todo_list.repository;

import leonardo.rigo.todo_list.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
