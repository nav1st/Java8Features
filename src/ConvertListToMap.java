import java.util.ArrayList;import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
	public static void main(String[] args) {
		Employee emp = new Employee(1,"Abhi",35,"m");
		Employee emp1 = new Employee(2,"Ava",34,"f");
		
		List<Employee> emps = new ArrayList<>();
		emps.add(emp);
		emps.add(emp1);
		
		Map<Integer,Employee> empMap =  emps.stream().collect(Collectors.toMap(Employee::getId,e->e));
		empMap.forEach((k,v)->System.out.println(k+"->"+v.getName()));
		
	}
}
