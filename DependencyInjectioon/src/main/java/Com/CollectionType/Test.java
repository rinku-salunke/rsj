package Com.CollectionType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{

	public static void main(String[] args){
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Student s=(Student) ac.getBean("s");
		System.out.println("--- Iterating Names ---");
		for (String name : s.getNames()) {
		    System.out.println(name);
		}
		
		s.getMobileNos().forEach(m->System.out.println(m));
		s.getCountries().forEach((k,v)->{
		System.out.println(k+" "+v);
		});
	}
}
