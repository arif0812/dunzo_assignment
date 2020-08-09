package com.coffeemachine.domain;

public class InsufficientIngredientQuantityException extends Exception {

    private final Portion portion;

    public InsufficientIngredientQuantityException(String message, Portion portion) {
        super(message);
        this.portion = portion;
    }

    public Portion getCurrentPortion() {
        return this.portion;
    }
}
