public class Account {
    private Long id;
    private String name;
    private int balance;

    public Account(Long id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
