package cz.martin.countries;

public class County {
    private String name;
    private long gdp;

    public County(String name, long gdp) {
        this.name = name;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGdp() {
        return gdp;
    }

    public void setGdp(long gdp) {
        this.gdp = gdp;
    }
}
