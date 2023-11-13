package Model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

	public static Map<String, Employee> data = new HashMap<>();
	
	static {
		
		Employee maria = new Analyst("Maria Isabel", 4800.50);
		maria.setExtraHours(3);
		maria.setPerExtraHourValue(100);
		
		Employee jose = new Analyst("José Pedro", 2800.00);
		jose.setExtraHours(6);
		jose.setPerExtraHourValue(100);
		
		Employee pedro = new Architect("Pedro H.", 8800.00, 3, 2);
		pedro.setExtraHours(4);
		pedro.setPerExtraHourValue(200);
		
		data.put("maria", maria);
		data.put("jose", jose);
		data.put("pedro", pedro);
		data.put("joao", new Architect("João H.", 7800.00, 1, 2));
		data.put("paula", new TechLead("Paula M.", 10000.00, 7, 5));
		data.put("seila", new Manager("Seila X.", 12000.00, 8, 1, 2, 800));
	}
	
	public static Employee get(String pk) {
		return data.get(pk);
	}
}
