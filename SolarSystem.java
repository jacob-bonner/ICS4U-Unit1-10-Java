/*
* This program allows the user to enter a planet name or position and the
* program will tell the user the corresponding planet name or position.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-04
*/

import java.util.Scanner;  // Import the Scanner class

// enum showing Mobile prices
enum SolarSystemPlanets {
   Mercury(1), Venus(2), Earth(3), Mars(4), Jupiter(5),
   Saturn(6), Uranus(7), Neptune(8);

  int planetIndex;
  SolarSystemPlanets(int enumIndex) {
    this.planetIndex = enumIndex;
  }

  int showPlanet() {
    return planetIndex;
  }
}

public class SolarSystem {
   
  public static void main(String args[]) {
    final SolarSystemPlanets somePlanet = SolarSystemPlanets.Mars;
    
    
    System.out.println(somePlanet.planetIndex);


    SolarSystemPlanets returnValue;
    returnValue = SolarSystemPlanets.valueOf("Mercury"); 
    System.out.println("Selected : " + returnValue);                   
  }
} 
