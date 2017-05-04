/**
 * @author The Elite Gentleman
 *
 */
public enum Gender {
    MALE("male"), FEMALE("female")
    ;
    private final String gender;

    private Gender(final String value) {
        this.gender = value;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getGender();
    }
}
