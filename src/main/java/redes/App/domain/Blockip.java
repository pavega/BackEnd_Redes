package redes.App.domain;

import javax.persistence.*;

@Entity
public class Blockip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String ipAddress;

    public Blockip(){}

    public Blockip(int id, String ipAddress){
        this.Id = id;
        this.ipAddress = ipAddress;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
