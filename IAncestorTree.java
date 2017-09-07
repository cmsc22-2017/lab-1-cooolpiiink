interface IAncestorTree {
}

class Human implements IAncestorTree {
	String name;
	int age;
	String gender;
	IAncestorTree mom;
	IAncestorTree dad;
	
	Human(String name, int age, String gender, IAncestorTree mom, IAncestorTree dad) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mom = mom;
		this.dad = dad;
	}
}

class Anonymous implements IAncestorTree {
	Anonymous() {}
}

class ExamplesIAncestorTree {
	ExamplesIAncestorTree() {}
	
	IAncestorTree unknown = new Anonymous();
	IAncestorTree jake = new Human("Jake", 81, "M", this.unknown, this.unknown);
	IAncestorTree girl = new Human("Girl", 83, "F", this.unknown, this.unknown);
	IAncestorTree boy = new Human("Boy", 74, "M", this.unknown, this.unknown);
	IAncestorTree mae = new Human("Mae", 78, "F", this.unknown, this.unknown);
	IAncestorTree pacito = new Human("Pacito", 52, "M", this.girl, this.jake);
	IAncestorTree dionisia = new Human("Dionisia", 51, "F", this.mae, this.boy);
	IAncestorTree frank = new Human("Frank", 34, "M", this.dionisia, this.pacito);
}