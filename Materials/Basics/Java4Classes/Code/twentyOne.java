enum Suite {
	spade,
	diamond,
	club,
	heart;
	public String info(){
		switch(this){
			case spade:
				return " of spade";
			case diamond:
				return " of diamond";
			case club:
				return " of club";
			case heart:
				return " of heart";
			default:
				return "???";
		}
	}
}

class Power {
	int value;

	public String info(){
		switch(value){
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				return Integer.toString(value);
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			case 1:
				return "Ace";
		}
		return "???";
	}

	public int getPoints(){
		switch(value){
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				return value;
			case 11:
				return 2;
			case 12:
				return 3;
			case 13:
				return 4;
			case 1:
				return 11;
		}
		return -1;
	}
}

class Card {
	Suite suite;
	Power power;

	public String info(){
		return power.info() + suite.info();
	}

	public void createCard(int n){
		int suiteNumber = n % 13;
		int powerNumber = n - suiteNumber * 13;
		switch(suiteNumber){
			case 0:
				suite = Suite.spade;
				break;
			case 1:
				suite = Suite.heart;
				break;
			case 2:
				suite = Suite.club;
				break;
			case 3:
				suite = Suite.diamond;
				break;
		}
		power = new Power();
		power.value = powerNumber;
	}
}