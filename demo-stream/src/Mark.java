import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mark {
  List<Person> s1 = 
  // students: [id, name, grade]
  // 1, John, 40
  // 2, Mary, 30
  // 3, Oscar, 80
// PASS_THRESHOLD = 50
// Result: Map<Boolean, List<Student>>
// Entry 1: true, [{3, "Oscar", 80}]
// Entry 2: false, [{1, "John", 40}, {2, "Mary", 30}]
Map<Boolean, List<Student>> passingFailing = students.stream()
    .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
}
