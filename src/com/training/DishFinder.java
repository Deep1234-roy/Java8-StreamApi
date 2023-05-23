package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.training.model.Dish;
import com.training.model.Type;

public class DishFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dish> menu = Arrays.asList(
				 new Dish("pork", false, 800, Type.MEAT),
				 new Dish("beef", false, 700, Type.MEAT),
				 new Dish("chicken", false, 400, Type.MEAT),
				 new Dish("french fries", true, 530, Type.OTHER),
				 new Dish("rice", true, 350, Type.OTHER),
				 new Dish("season fruit", true, 120, Type.OTHER),
				 new Dish("pizza", true, 550, Type.OTHER),
				 new Dish("prawns", false, 300, Type.FISH),
				 new Dish("salmon", false, 450, Type.FISH)
				 );
		
		//You wish to find a dish that is vegetarian.
		menu.stream()
			.filter(Dish::isVegetarian)
			.forEach(System.out::println);
		
		//You want to check if fish is available in the non-vegetarian dish.
		Optional<Dish> chekFish=menu.stream()
			.filter(dish-> dish.isVegetarian() == false)
			.filter(dishType -> dishType.getType() == Type.FISH)
			.findAny();
		if(chekFish.isPresent())
			System.out.println("Fish is available in the non-vegetarian dish");
		else
			System.out.println("Fish is not available in the non-vegetarian dish");
		
		//Partition the menu based on vegetarian dishes and non-vegetarain dishes.
		Map<Boolean, List<Dish>> menuSpecificList=menu.stream()
			.collect(Collectors.partitioningBy(Dish::isVegetarian));
		for(Entry<Boolean, List<Dish>> entry: menuSpecificList.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		//After partitioning, group the dishes by their types, 
		//both in vegetarian and non-vegetarain
		Map<Type, List<Dish>> dish=menu.stream()
			.collect(Collectors.groupingBy(Dish::getType));
		
		for(Entry<Type,List<Dish>> entry: dish.entrySet()) {
			System.out.println("Dish Type -> " + entry.getKey());
			System.out.println("Dishes are -> ");
			entry.getValue().forEach(System.out::println);
		}
		
		System.out.println("----------------------------------");
		
		//Find the highest-calorie dish in the menu
		menu.stream()
			.sorted((s1,s2)-> Integer.compare(s2.getCalories(), s1.getCalories()))
			.limit(1)
			.forEach(System.out::println);
		
		OptionalInt highestCaloricFood =menu.stream()
			.mapToInt(Dish::getCalories)
			.max();
		if(highestCaloricFood.isPresent())
			System.out.println("Highest Caloric Dish => " + highestCaloricFood);
		else
			System.out.println("No Present");

	}

}
