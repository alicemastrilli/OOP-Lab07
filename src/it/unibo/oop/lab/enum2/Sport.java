/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

	BASKET( Place.INDOOR,5, "basket" ),
	VOLLEY( Place.INDOOR, 6, "volley"),
	TENNIS( Place.INDOOR ,2, "tennis"),
	BIKE( Place.OUTDOOR, 1, "bike"),
	F1( Place.OUTDOOR, 1, "F1"),
	MOTOGP( Place.OUTDOOR, 1, "motogp"),
	SOCCER( Place.OUTDOOR, 12, "soccer");
	
	private final int NumPlayer;
	private final String Nome;
	private final Place Posto;
	
	Sport(final Place place, final int noTeamMembers, final String actualName){
		this.NumPlayer=noTeamMembers;
		this.Nome = actualName;
		this.Posto = place;
	}
	
	 public boolean isIndividualSport() {
		return this.NumPlayer == 1;
	}
	 
	public boolean isIndoorSport() {
		return this.Posto == Place.INDOOR;
	}
	
	public Place getPlace() {
		return this.Posto;
	}
	
	public String toString() {
		return this.Nome;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) 
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) 
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) 
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) 
     * 
     * Returns the string representation of a sport
     */
}
