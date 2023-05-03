package ru.kiwutu.eventtest.domain.entity.place;


public class PlaceInfo {
    private final String place;


    public PlaceInfo(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != getClass()) return false;
        PlaceInfo info= (PlaceInfo) object;
        return
                this.place.equals(info.getPlace());
    }

    //TODO
   /* @NonNull
    @Override
    public String toString() {
        return  + ", " +  + " " + ;
    }*/

    public String getPlace() {
        return place;
    }
}








