package GenericCollection;

import java.util.Enumeration;
import java.util.Properties;

/*
 * 객체를 하나 만들어서 Key, value를 사용합니다.
 * 
 */
public class CollectionSample11_Properties {

	public static void main(String[] args) {

		Properties p = new Properties();

		p.setProperty("name", "홍길동");
		p.setProperty("age", "23");
		p.setProperty("job", "프로그래머");

		String name = p.getProperty("name");
		String age = p.getProperty("age");
		String job = p.getProperty("job");
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
		
		Enumeration e = p.propertyNames();
		
		while(e.hasMoreElements()){
			String key = (String) e.nextElement();
			System.out.println(key + "=" + p.getProperty(key));
		}

	}

}
