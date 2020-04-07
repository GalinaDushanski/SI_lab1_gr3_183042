class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
        char danok;
	//TODO constructor
         public  Item(int id, String name, double price, char danok){
         this.id=id;
         this.name=name;
         this.price=price;
         this.danok=danok;
         }

	//TODO setters and getters

        public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getDanok() {
		return danok;
	}

	public void setDanok(char danok) {
		this.danok = danok;
	}
	
	double taxReturn () {
		double tax;
		if(danok=='A') {
			tax=0.18 *price;
			return tax*0.15;
		}
		else if(danok=='B') {
			tax=0.05 *price;
			return tax*0.15;
		}
		else return 0;
	}
	
}