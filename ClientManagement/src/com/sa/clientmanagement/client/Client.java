package com.sa.clientmanagement.client;

public class Client {
    private int id;
    private String name;
    private Industry industry;
    private String contactPerson;
    private long revenue;

    public Client(int id, String name, Industry industry, String contactPerson, long revenue) {
        this.id = id;
        this.name = name;
        this.industry = industry;
        this.contactPerson = contactPerson;
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", industry=" + industry +
                ", contactPerson='" + contactPerson + '\'' +
                ", revenue=" + revenue +
                '}';
    }
}
