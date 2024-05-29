package practice.entities;

public class Customer {
    private long id;
    private String name;
    private Integer tier;

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer(long id, Integer tier, String name) {
        this.id = id;
        this.tier = tier;
        this.name = name;
    }
}
