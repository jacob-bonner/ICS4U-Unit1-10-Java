/*
* This program allows the user to enter a planet name and the program
* will tell the user its position in the solar system.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-04
*/

import java.util.Scanner;  // Import the Scanner class

public class SolarSystem {

  // Enum containing the planets in the solar syslem
  enum SolarSystemPlanets {
    // Planets
    MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5),
    SATURN(6), URANUS(7), NEPTUNE(8);

    // Finding the position of the planets if called
    int planetIndex;
    SolarSystemPlanets(int enumIndex) {
      this.planetIndex = enumIndex;
    }

    // Returning the position of the planets
    public int showPlanet() {
      return planetIndex;
    }
  }

  /**
   * This function allows the user to enter a planet and it will
   * tell the user the planet's position in the solar system.
   */
  public static void main(String[] args) {
    try {
      // Input to get the planet name
      String planetInput = null;
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter the planet name: ");
      String planetInputLowerCase = userInput.nextLine();
      planetInput = planetInputLowerCase.toUpperCase();
      System.out.println();

      // Process
      SolarSystemPlanets planetName = SolarSystemPlanets.valueOf(planetInput);
      int planetPosition = planetName.showPlanet();

      // Output
      System.out.println("This planet is number " 
                         + planetPosition + " in the solar system.");

      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    } 
  }
} 
