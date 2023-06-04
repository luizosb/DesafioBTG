package btg.desafio.spring.boot.pedidos.dto;

import java.io.Serializable;

public class ClientesDTO implements Serializable {

    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
