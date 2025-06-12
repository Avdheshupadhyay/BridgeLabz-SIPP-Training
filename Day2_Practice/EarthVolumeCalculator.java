//This program calculates the volume of Earth in cubic kilometers and cubic miles.
public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Given data (radius in km)
        double radiusOfEarthInKm = 6378;
        double pi = Math.PI;

        // Calculate volume in km^3
        double volumeInKm = (4.0 / 3.0) * pi * Math.pow(radiusOfEarthInKm, 3);

        // Convert km^3 to miles^3 (1 km^3 ≈ 0.239913 mi^3)
        double volumeInMiles = volumeInKm * 0.239913;

        // Output the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + 
                         " and cubic miles is " + volumeInMiles);
    }
}