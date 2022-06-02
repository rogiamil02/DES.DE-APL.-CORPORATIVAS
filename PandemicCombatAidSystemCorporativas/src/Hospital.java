public class Hospital {
    private Long id;

    private String name;
    private String cnpj;
    private String address;
    private Double latitude;
    private Double longitude;
    private Integer ocupation;
    private String dataAttOcupacao;

    private List<Item> items;

    public Hospital() {
    }

    public Hospital(Long id, String name, String cnpj, String address, Double latitude, Double longitude, Integer ocupation, String dataAttOcupacao) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ocupation = ocupation;
        this.dataAttOcupacao = dataAttOcupacao;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOcupation() {
        return ocupation;
    }

    public void setOcupation(Integer ocupation) {
        this.ocupation = ocupation;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDataAttOcupacao() {
        return dataAttOcupacao;
    }

    public void setDataAttOcupacao(String dataAttOcupacao) {
        this.dataAttOcupacao = dataAttOcupacao;
    }

    public void updateOcupation(int newOcupacao) {
        setOcupation(newOcupacao);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\n' +
                "• address='" + address + '\n' +
                "• ocupation=" + ocupation + "%" +
                " - dataAttOcupacao='" + dataAttOcupacao + '\n' +
                "• items=" + items +
                '}';
    }
}
