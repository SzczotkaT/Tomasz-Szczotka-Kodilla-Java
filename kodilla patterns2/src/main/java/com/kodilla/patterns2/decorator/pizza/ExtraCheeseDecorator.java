package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {
    public ExtraCheeseDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getDetails(){
        return super.getDetails() + " + extra cheese";
    }
}
