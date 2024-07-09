package az.com.dth.data;

import com.vaadin.hilla.Nonnull;

public class Gender {

    @Nonnull
    private String name;

    @Nonnull
    private String abbreviation;

    @Nonnull
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gender)) {
            return false;
        }
        Gender other = (Gender) obj;
        return id == other.id;
    }
}
