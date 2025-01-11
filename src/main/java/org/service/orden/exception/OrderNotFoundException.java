package org.service.orden.exception;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(String id) {
        super("La orden con ID: " + id + " no existe en la base de datos");
    }
}
