package restapi.json;

public class employee {
private String name;
private int password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "employee [name=" + name + ", password=" + password + "]";
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}

}
