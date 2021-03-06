package weapons;

import res.Dice;
import res.Money.Currency;

public class Weapon {
	private String name;
	private int CRITICAL;
	private int CRITICAL_MULTIPLIER;
	private int RANGE_INCREMENT;
	private String type;
	private int HARDNESS;
	private Currency cost;
	private Dice DAMAGE;
	private int WEIGHT;
	private int HP;
	private String size;
	
	public Weapon(String name0) { 
		this.name = name0;
	}
	
	public String getSize() { 
		return size;
	}
	
	public void setSize(String size0) { 
		size = size0;
	}
	
	public void setCriticalMultiplier(int crit) { 
		CRITICAL_MULTIPLIER = crit;
	}
	
	public String getCriticalMultiplier() { 
		return "x" + Integer.toString(CRITICAL_MULTIPLIER);
	}
	
	public String getDamageVersus(String size) { 
		return "blank";
	}
	
	public void setHP(int hp) { 
		HP = hp;
	}
	
	public void setWeight(int weight) { 
		WEIGHT = weight;
	}
	
	public void setDamage(Dice die) { 
		DAMAGE = die;
	}
	
	public void setCost(Currency currency) { 
		cost = currency;
	}
	
	public void setHardness(int hardness) { 
		HARDNESS = hardness;
	}
	
	public void setType(String type0) { 
		type = type0;
	}
	
	public void setRangeIncrement(int range) { 
		RANGE_INCREMENT = range;
	}
	
	public void setCritical(int crit) { 
		CRITICAL = crit;
	}
	
	public String getName() { 
		return name;
	}
	
	public int getCritical() { 
		return CRITICAL;
	}
	
	public String getRangeIncrement() { 
		if(RANGE_INCREMENT != 0) { 
			return Integer.toString(RANGE_INCREMENT);
		} else {
			return "-";
		}
	}
	
	public String getType() { 
		return type;
	}
	
	public int getHardness() { 
		return HARDNESS;
	}
	
	public int getAbsCost() { 
		return cost.getAmount();
	}
	
	public String getCost() { 
		if(getAbsCost() == 0) {
			return "-";
		} else if (getAbsCost() == -1) { 
			return "Special";
		} else { 
			return cost.getAmountAndType();
		}
	}
	
	public String getDamage(int playerSize) { 
		
		int sizeMod = playerSize - 4;
		
		int faces = DAMAGE.getFaces();
		int qty = DAMAGE.getQuantity();
		Dice die = null;
		
		switch(sizeMod) { 
		case -4: //Fair
			switch(qty) { 
			case 1:
				switch(faces) { 
				case 2:
					die = new Dice(1, 0);
					break;
				case 3:
					die = new Dice(1, 0);
					break;
				case 4:
					die = new Dice(1, 0);
					break;
				case 6:
					die = new Dice(1, 1);
					break;
				case 8:
					die = new Dice(1, 2);
					break;
				case 10:
					die = new Dice(1, 3);
					break;
				case 12:
					die = new Dice(1, 4);
					break;
				}
				break;
			case 2:
				switch(faces) { 
				case 4:
					die = new Dice(1, 2);
					break;
				case 6:
					die = new Dice(1, 4);
					break;
				case 8:
					die = new Dice(1, 6);
					break;
				case 10:
					die = new Dice(1, 8);
				}
				break;
			}
			break;
		case -3: //Diminuitive
			switch(qty) { 
			case 1:
				switch(faces) { 
				case 2:
					die = new Dice(1, 0);
					break;
				case 3:
					die = new Dice(1, 0);
					break;
				case 4:
					die = new Dice(1, 1);
					break;
				case 6:
					die = new Dice(1, 2);
					break;
				case 8:
					die = new Dice(1, 3);
					break;
				case 10:
					die = new Dice(1, 4);
					break;
				case 12:
					die = new Dice(1, 6);
					break;
				}
				break;
			case 2:
				switch(faces) { 
				case 4:
					die = new Dice(1, 3);
					break;
				case 6:
					die = new Dice(1, 6);
					break;
				case 8:
					die = new Dice(1, 8);
					break;
				case 10:
					die = new Dice(1, 10);
				}
				break;
			}
			break;
		case -2: //Tiny
			switch(qty) { 
			case 1:
				switch(faces) { 
				case 2:
					die = new Dice(1, 0);
					break;
				case 3:
					die = new Dice(1, 1);
					break;
				case 4:
					die = new Dice(1, 2);
					break;
				case 6:
					die = new Dice(1, 3);
					break;
				case 8:
					die = new Dice(1,4);
					break;
				case 10:
					die = new Dice(1, 6);
					break;
				case 12:
					die = new Dice(1, 8);
					break;
				}
				break;
			case 2:
				switch(faces) { 
				case 4:
					die = new Dice(1, 4);
					break;
				case 6:
					die = new Dice(1, 8);
					break;
				case 8:
					die = new Dice(1, 10);
					break;
				case 10:
					die = new Dice(2, 6);
				}
				break;
			}
			break;
		case -1: //Small
			switch(qty) { 
			case 1:
				switch(faces) { 
				case 2:
					die = new Dice(1, 1);
					break;
				case 3:
					die = new Dice(1, 2);
					break;
				case 4:
					die = new Dice(1, 3);
					break;
				case 6:
					die = new Dice(1, 4);
					break;
				case 8:
					die = new Dice(1,6);
					break;
				case 10:
					die = new Dice(1, 8);
					break;
				case 12:
					die = new Dice(1, 10);
					break;
				}
				break;
			case 2:
				switch(faces) { 
				case 4:
					die = new Dice(1, 6);
					break;
				case 6:
					die = new Dice(1, 10);
					break;
				case 8:
					die = new Dice(2, 6);
					break;
				case 10:
					die = new Dice(2, 8);
				}
				break;
			}
			break;
		case 0: //Medium
			die = DAMAGE;
			break;
		case 1: //Large
			switch(qty) { 
			case 1:
				switch(faces) { 
				case 2:
					die = new Dice(1, 3);
					break;
				case 3:
					die = new Dice(1, 4);
					break;
				case 4:
					die = new Dice(1, 6);
					break;
				case 6:
					die = new Dice(1, 8);
					break;
				case 8:
					die = new Dice(2, 6);
					break;
				case 10:
					die = new Dice(2, 8);
					break;
				case 12:
					die = new Dice(3, 6);
					break;
				}
				break;
			case 2:
				switch(faces) { 
				case 4:
					die = new Dice(2, 6);
					break;
				case 6:
					die = new Dice(3, 6);
					break;
				case 8:
					die = new Dice(3, 8);
					break;
				case 10:
					die = new Dice(4, 8);
				}
				break;
			}
			break;
			
		case 2: //Huge
			switch(qty) { 
			case 1:
				switch(faces) { 
				case 2:
					die = new Dice(1, 4);
					break;
				case 3:
					die = new Dice(1, 6);
					break;
				case 4:
					die = new Dice(1, 8);
					break;
				case 6:
					die = new Dice(2, 6);
					break;
				case 8:
					die = new Dice(3, 6);
					break;
				case 10:
					die = new Dice(3, 8);
					break;
				case 12:
					die = new Dice(4, 6);
					break;
				}
				break;
			case 2:
				switch(faces) { 
				case 4:
					die = new Dice(3, 6);
					break;
				case 6:
					die = new Dice(4, 6);
					break;
				case 8:
					die = new Dice(4, 8);
					break;
				case 10:
					die = new Dice(6, 8);
				}
				break;
			}
			break;
		case 3: //Giant
			switch(qty) { 
			case 1:
				switch(faces) { 
				case 2:
					die = new Dice(1, 6);
					break;
				case 3:
					die = new Dice(1, 8);
					break;
				case 4:
					die = new Dice(2, 6);
					break;
				case 6:
					die = new Dice(3, 6);
					break;
				case 8:
					die = new Dice(4, 6);
					break;
				case 10:
					die = new Dice(4, 8);
					break;
				case 12:
					die = new Dice(6, 6);
					break;
				}
				break;
			case 2:
				switch(faces) { 
				case 4:
					die = new Dice(4, 6);
					break;
				case 6:
					die = new Dice(6, 6);
					break;
				case 8:
					die = new Dice(6, 8);
					break;
				case 10:
					die = new Dice(8, 8);
				}
				break;
			}
			break;
		case 4: //Colossal
			switch(qty) { 
			case 1:
				switch(faces) { 
				case 2:
					die = new Dice(1, 8);
					break;
				case 3:
					die = new Dice(2, 6);
					break;
				case 4:
					die = new Dice(3, 6);
					break;
				case 6:
					die = new Dice(4, 6);
					break;
				case 8:
					die = new Dice(6, 6);
					break;
				case 10:
					die = new Dice(6, 8);
					break;
				case 12:
					die = new Dice(8, 6);
					break;
				}
				break;
			case 2:
				switch(faces) { 
				case 4:
					die = new Dice(6, 6);
					break;
				case 6:
					die = new Dice(8, 6);
					break;
				case 8:
					die = new Dice(8, 8);
					break;
				case 10:
					die = new Dice(12, 8);
				}
				break;
			}
			break;
		}
		
		if(die != null) {
			return die.getDie();
		} else { 
			return "err";
		}
	}
	
	public int getWeight() { 
		return WEIGHT;
	}
	
	public int getHP() { 
		return HP;
	}
}
