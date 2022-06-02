public class Item {
    private Long id;

    private String name;
    private Integer type;
    private Integer value;

    public Item() {
    }

    public Item(Long id, String name, Integer type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceType getType() {
        return ResourceType.valueOf(type);
    }

    public void setType(ResourceType type) {
        if (type != null) {
            this.type = type.getCode();
        }
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
