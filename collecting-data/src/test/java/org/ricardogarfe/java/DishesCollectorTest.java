package org.ricardogarfe.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class DishesCollectorTest {

  private DishesCollector dishesCollector = new DishesCollector();

  private List<Dish> menu = Arrays.asList(
      new Dish("pork", false, 800, Dish.Type.MEAT),
      new Dish("beef", false, 700, Dish.Type.MEAT),
      new Dish("chicken", false, 400, Dish.Type.MEAT),
      new Dish("french fries", true, 530, Dish.Type.OTHER),
      new Dish("rice", true, 350, Dish.Type.OTHER),
      new Dish("season fruit", true, 120, Dish.Type.OTHER),
      new Dish("pizza", true, 550, Dish.Type.OTHER),
      new Dish("prawns", false, 300, Dish.Type.FISH),
      new Dish("salmon", false, 450, Dish.Type.FISH));


  @Test
  public void testCountDishes() throws Exception {

    long howManyDishesCollectors = menu.stream().collect(counting());
    long howManyDishes = menu.stream().count();

    Assert.assertEquals("Dishes result size different.", howManyDishesCollectors, howManyDishes);
  }
}