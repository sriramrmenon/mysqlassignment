package com.example.mysqlproject;

import javax.persistence.*;

@Entity
@Table(name = "cats")
public class RequestData {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;


        @Column(name = "name")
        private String name;

        @Column(name = "owner")
        private String owner;

        @Column(name = "city")
        private String city;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getOwner() {
                return owner;
        }

        public void setOwner(String owner) {
                this.owner = owner;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }


}
