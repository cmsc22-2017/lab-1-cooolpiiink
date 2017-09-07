interface Menu {
}

class Soup implements Menu {
  Info soup;
  boolean isVegetarian;
  
  Soup(Info soup, boolean isVegetarian) {
    this.soup = soup;
    this.isVegetarian = isVegetarian;
  }
}

class Salad implements Menu {
  Info salad;
  boolean isVegetarian;
  String dressingName;
  
  Salad(Info salad, boolean isVegetarian, String dressingName) {
    this.salad = salad;
    this.isVegetarian = isVegetarian;
    this.dressingName = dressingName;
  }
}

class Sandwich implements Menu {
  Info sandwich;
  String breadKind;
  Filling fill;
  
  Sandwich(Info sandwich, String breadKind, Filling fill) {
    this.sandwich = sandwich;
    this.breadKind = breadKind;
    this.fill = fill;
  }
}

class Info {
  String name;
  int price;
  
  Info(String name, int price) {
    this.name = name;
    this.price = price;
  }
}

class Filling {
  String a;
  String b;
  
  Filling(String a, String b) {
    this.a = a;
    this.b = b;
  }
}

class ExamplesMenu {
  ExamplesMenu() {}
  
  Info s1 = new Info("Sabaw", 250);
  Info s2 = new Info("Noodles", 230);
  Info sd1 = new Info("Veggie Salad", 360);
  Info sd2 = new Info("Fruit Salad", 390);
  Info sw1 = new Info("Ham and Cheesse", 120);
  Info sw2 = new Info("Special", 155);
  
  Menu a1 = new Soup(this.s1, true);
  Menu a2 = new Soup(this.s2, false);
  
  Menu b1 = new Salad(this.sd1, true, "Delight");
  Menu b2 = new Salad(this.sd2, false, "Fruity fruit");
  
  Filling pair1 = new Filling("Ham", "Cheese");
  Filling pair2 = new Filling("Ladies' Choice", "Egg");
  
  Menu c1 = new Sandwich(this.sw1, "French", this.pair1);
  Menu c2 = new Sandwich(this.sw2, "Kilid-kilid", this.pair2);
}