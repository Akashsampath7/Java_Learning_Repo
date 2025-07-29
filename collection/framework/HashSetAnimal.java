package collection.framework;

import java.util.Objects;

public class HashSetAnimal {

	String name;
	int age;
	String gender;
	int weight;
	
	public HashSetAnimal(String name, int age, String gender, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "HashSetAnimal [name=" + name + ", age=" + age + ", gender=" + gender + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSetAnimal other = (HashSetAnimal) obj;
		return age == other.age && Objects.equals(gender, other.gender) && Objects.equals(name, other.name)
				&& weight == other.weight;
	}

	
}
