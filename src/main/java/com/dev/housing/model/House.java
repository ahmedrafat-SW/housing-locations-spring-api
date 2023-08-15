package com.dev.housing.model;

import jakarta.persistence.*;

import java.util.Objects;

/**
 *      "id": 0,
 *     "name": "Acme Fresh Start Housing",
 *     "city": "Chicago",
 *     "state": "IL",
 *     "photo": "/assets/10.jpg",
 *     "availableUnits": 4,
 *     "wifi": true,
 *     "laundry": true
 * */

@Entity
@Table(name = "houses")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String state;
    private String photo;
    private int availableUnits;
    private boolean wifi;
    private boolean laundry;

    public House() {
    }

    public House(Long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isLaundry() {
        return laundry;
    }

    public void setLaundry(boolean laundry) {
        this.laundry = laundry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return wifi == house.wifi && laundry == house.laundry && Objects.equals(id, house.id) && Objects.equals(name, house.name) && Objects.equals(city, house.city) && Objects.equals(state, house.state) && Objects.equals(photo, house.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, state, photo, wifi, laundry);
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", photo='" + photo + '\'' +
                ", wifi=" + wifi +
                ", laundry=" + laundry +
                '}';
    }
}
