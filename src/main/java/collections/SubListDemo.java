package collections;

import java.util.LinkedList;
import java.util.List;

public class SubListDemo {

	public static void main(String[] args) {
		List<String> cityList = new LinkedList<String>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Kolkata");
        cityList.add("Hyderabad");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        
        for(int i = 0; i < cityList.size(); i++){
        	System.out.println(cityList.get(i));
        	String cityName = cityList.get(i);
        	if(cityName.equals("Mumbai"))
        		cityList.remove(cityName);
        }
        
        System.out.println("After deletion " );
        for(String city : cityList){
            System.out.println("city - " + city);
//            cityList.remove(city);
        }
	}


}
//The method replaceAll(UnaryOperator) belongs to the raw type List. References to generic type 
//List<E> should be parameterized