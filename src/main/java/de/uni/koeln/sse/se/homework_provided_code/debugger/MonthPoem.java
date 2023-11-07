package de.uni.koeln.sse.se.homework_provided_code.debugger;


public class MonthPoem {
	Month month;

    public MonthPoem(Month month) {
        this.month = month;
    }
     	
    public void printPoem() {
        switch (month) {
            case JANUARY: 
                System.out.println("January brings the snow,\n"
                		+ "    Makes our feet and fingers glow.");
                break;

            case FEBRUARY: 
                System.out.println("February brings the rain,\n"
                		+ "    Thaws the frozen lake again.");
                break;
              
            case MARCH:
                System.out.println("March brings breezes, loud and shrill,\n"
                		+ "    To stir the dancing daffodil.");
                break;
                
            case APRIL:
                System.out.println("April brings the primrose sweet,\n"
                		+ "    Scatters daisies at our feet.");
                break;               
                
            case MAY:
                System.out.println("May brings flocks of pretty lambs\n"
                		+ "    Skipping by their fleecy dams.");
                
            case JUNE: 
                System.out.println("June brings tulips, lilies, roses,\n"
                		+ "    Fills the children's hands with posies.");
                break;

            case JULY: 
                System.out.println("Hot July brings cooling showers,\n"
                		+ "    Apricots, and gillyflowers.");
                break;
                
            case AUGUST:
                System.out.println("August brings the sheaves of corn,\n"
                		+ "    Then the harvest home is borne.");
                break;

            case SEPTEMBER:
                System.out.println("  Warm September brings the fruit;\n"
                		+ "    Sportsmen then begin to shoot.");
                break;
           
            case OCTOBER: 
                System.out.println("Fresh October brings the pheasant;\n"
                		+ "    Then to gather nuts is pleasant.");
                break;

            case NOVEMBER: 
                System.out.println(" Dull November brings the blast;\n"
                		+ "    Then the leaves are whirling fast.");
                break;

            case DECEMBER:
                System.out.println("Chill December brings the sleet,\n"
                		+ "     Blazing fire, and Christmas treat. ");
                break;

            default:
                System.out.println("Every month of the year is beautiful");
                break;
        }
    }
}
