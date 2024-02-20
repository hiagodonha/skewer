package com.donha.skewer.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Builder
@AllArgsConstructor
@Table(name = "clientes")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 250, nullable = false, unique = true)
    private String cpfCnpj;

    @Column(length = 250, nullable = false, unique = true)
    private String email;

    @Column(length = 150)
    private String phone;

    @Column(length = 200)
    private String adress;

    public Client(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(id, client.id)
                && Objects.equals(getName(), client.getName())
                && Objects.equals(getCpfCnpj(), client.getCpfCnpj())
                && Objects.equals(getEmail(), client.getEmail())
                && Objects.equals(getPhone(), client.getPhone())
                && Objects.equals(getAdress(), client.getAdress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getName(), getCpfCnpj(), getEmail(), getPhone(), getAdress());
    }

}
