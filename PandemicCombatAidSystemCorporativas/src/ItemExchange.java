public class ItemExchange {
    private Long id;

    private Hospital hospitalOrigin;
    private Hospital hospitalDestiny;
    private String dateExchange;

    public ItensExchange() {
    }

    public ItensExchange(Long id, Hospital hospitalOrigin, Hospital hospitalDestiny, String dateExchange) {
        this.id = id;
        this.hospitalOrigin = hospitalOrigin;
        this.hospitalDestiny = hospitalDestiny;
        this.dateExchange = dateExchange;
    }

    public void transaction(List<Item> itemSent, List<Item> itemReceived) {

        List<Item> recursosHospOrigin = hospitalOrigin.getItems();
        List<Item> recursosHospDestiny = hospitalDestiny.getItems();

        int valueItemSent = calculateResourceValue(itemSent);
        int valeuItemReceived = calculateResourceValue(itemReceived);

        if (valueItemSent == valeuItemReceived) {
            for (Item itemSen: itemSent) {
                if (recursosHospOrigin.contains(itemSen)) {
                    recursosHospDestiny.add(itemSen);
                    recursosHospOrigin.remove(itemSen);

                }
            }
            for (Item itemRec: itemReceived) {
                if (recursosHospDestiny.contains(itemRec)) {
                    recursosHospOrigin.add(itemRec);
                    recursosHospDestiny.remove(itemRec);
                    ;
                }
            }
            System.out.println("Item Exchanged");
        } else {
            System.out.println("Resource values must be equivalent");
        }

    }

    public Integer calculateResourceValue(List<Item> hospitalItem) {
        return hospitalItem.stream()
                .distinct()
                .map(resource -> resource.getType().getPoint())
                .reduce(0, (acc, valueresource) -> acc + valueresource);
    }
}
