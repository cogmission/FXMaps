package ai.cogmission.fxmaps.model;

import com.google.maps.model.LatLng;
import com.lynden.gmapsfx.javascript.object.LatLong;

/**
 * Container for latitude and longitude information.
 * @author cogmission
 *
 */
public class LatLon {
    private double latitude;
    private double longitude;
    
    private LatLong latLong;
    
    /**
     * Constructs a new {@code LatLon} 
     * 
     * @param latitude
     * @param longitude
     */
    public LatLon(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.latLong = new com.lynden.gmapsfx.javascript.object.LatLong(latitude, longitude);
    }
    
    /**
     * Returns the string identifier used to reference the
     * javascript object entity.
     * 
     * @return the variable name string identifier
     */
    public String getVariableName() {
        return latLong.getVariableName();
    }
    
    /**
     * Returns the latitude 
     * @return  the latitude (double)
     */
    public double latitude() {
        return latitude;
    }
    
    /**
     * Returns the longitude (double)
     * @return  the longitude (double)
     */
    public double longitude() {
        return longitude;
    }
    
    /**
     * Used internally to convert from this to a GMapsFX
     * model.
     * 
     * @return  the GMapsFX version of a lat long.
     */
    public LatLong toLatLong() {
        return latLong;
    }
    
    /**
     * Used internally to convert from this to a Google Maps
     * Services model.
     * 
     * @return  the Google Maps Service version of a lat long.
     */
    public LatLng toLatLng() {
        return new LatLng(latitude, longitude);
    }
}
