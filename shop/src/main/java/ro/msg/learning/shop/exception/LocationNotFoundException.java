package ro.msg.learning.shop.exception;

public class LocationNotFoundException extends RuntimeException{

    public LocationNotFoundException(){
        super(String.format("couldn't find location with all required products"));
    }
    public LocationNotFoundException(Integer id) {
        super(String.format("location with id '%d' does not exist", id));
    }
    public LocationNotFoundException(String name) {
        super(String.format("location '%s' not found", name));
    }
}
