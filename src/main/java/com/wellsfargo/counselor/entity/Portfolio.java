package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @Column(nullable = false)
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    protected Portfolio() {
    }

    public Portfolio(LocalDate creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
