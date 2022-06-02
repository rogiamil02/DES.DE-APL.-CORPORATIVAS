public enum ResourceType {

    NURSE(1, 3),
    DOCTOR(2, 3),
    RESPIRATOR(3, 5),
    TOMOGRAFHY(4, 12),
    AMBULANCE(5,  10);

    private Integer code;

    private Integer point;

    public Integer getCode() {
        return code;
    }

    public void setCodigo(Integer code) {
        this.code = code;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    private ResourceType(Integer code, Integer point) {
        this.code = code;
        this.point= point;
    }

    public static ResourceType valueOf(Integer code) {
        for (ResourceType tr: values()) {
            if (tr.getCode().equals(code)) {
                return tr;
            }
        }
        return null;
    }
}
