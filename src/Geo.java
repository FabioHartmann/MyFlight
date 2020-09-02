public class Geo {
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Geo(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static double distancia(Geo pontoA, Geo pontoB) {
        int raioTerra = 6371;

        double latA = pontoA.getLatitude(),
                lonA= pontoA.getLongitude(),
                latB = pontoB.getLatitude(),
                lonB = pontoB.getLatitude();


        double latDistance = Math.toRadians(latB - latA);
        double lonDistance = Math.toRadians(lonB - lonA);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(latA)) * Math.cos(Math.toRadians(latB))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = raioTerra * c * 1000; // converte em metros;

        distance = Math.pow(distance, 2);

        return Math.sqrt(distance);
    }


}
