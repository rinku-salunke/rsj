package Com.CollectionType;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private List<String>  names;
private Set<String> mobileNos;
private Map<String,Integer> countries;
public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public Set<String> getMobileNos() {
	return mobileNos;
}
public void setMobileNos(Set<String> mobileNos) {
	this.mobileNos = mobileNos;
}
public Map<String, Integer> getCountries() {
	return countries;
}
public void setCountries(Map<String, Integer> countries) {
	this.countries = countries;
}
}
