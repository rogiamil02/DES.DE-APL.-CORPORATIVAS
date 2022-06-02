public class Transaction {

    private Long id;

    private Item item;
    private ItensExchange exchange;

    public Transaction() {
    }

    public Transaction(Long id, Item item, ItensExchange exchange) {
        this.id = id;
        this.item = item;
        this.exchange = exchange;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ItensExchange getExchange() {
        return exchange;
    }

    public void setExchange(ItensExchange exchange) {
        this.exchange = exchange;
    }
}
